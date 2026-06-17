import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListDemoTest {

    private ListDemo listDemo;

    @BeforeEach
    public void setUp() {
        listDemo = new ListDemo();
    }

    @Test
    public void testArrayListGet() {
        // The sum of numbers from 0 to 9999 = 49995000
        int expectedSum = 49995000;
        assertEquals(expectedSum, listDemo.arrayListGet(), "ArrayList sum did not match expected value.");
    }

    @Test
    public void testLinkedListGet() {
        int expectedSum = 49995000;
        assertEquals(expectedSum, listDemo.linkedListGet(), "LinkedList sum did not match expected value.");
    }

    @Test
    public void testArrayListRemoveFront() {
        // Test that it executes without throwing exception
        assertDoesNotThrow(() -> listDemo.arrayListRemoveFront());
    }

    @Test
    public void testLinkedListRemoveFront() {
        assertDoesNotThrow(() -> listDemo.linkedListRemoveFront());
    }

    @Test
    public void testArrayListRemoveMiddle() {
        assertDoesNotThrow(() -> listDemo.arrayListRemoveMiddle());
    }

    @Test
    public void testLinkedListRemoveMiddle() {
        assertDoesNotThrow(() -> listDemo.linkedListRemoveMiddle());
    }
}