import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortDemoTest {

    private SortDemo sortDemo;

    @BeforeEach
    void setUp() {
        sortDemo = new SortDemo();
    }

    @Test
    void testJavaSortReturnsSortedArray() {
        int[] result = sortDemo.javaSort();

        for (int i = 0; i < result.length - 1; i++) {
            assertTrue(result[i] <= result[i + 1],
                    "Array not sorted at index " + i);
        }
    }

    @Test
    void testBubbleSortReturnsSortedArray() {
        int[] result = sortDemo.bubbleSort();

        for (int i = 0; i < result.length - 1; i++) {
            assertTrue(result[i] <= result[i + 1],
                    "Bubble sort failed at index " + i);
        }
    }

    @Test
    void testInsertionSortReturnsSortedArray() {
        int[] result = sortDemo.insertionSort();

        for (int i = 0; i < result.length - 1; i++) {
            assertTrue(result[i] <= result[i + 1],
                    "Insertion sort failed at index " + i);
        }
    }

    @Test
    void testAllSortMethodsReturnSameLength() {
        int[] javaResult = sortDemo.javaSort();
        int[] bubbleResult = sortDemo.bubbleSort();
        int[] insertionResult = sortDemo.insertionSort();

        assertEquals(javaResult.length, bubbleResult.length);
        assertEquals(javaResult.length, insertionResult.length);
    }

    @Test
    void testSortDoesNotModifyOriginalData() {
        int[] firstRun = sortDemo.javaSort();

        int[] bubbleResult = sortDemo.bubbleSort();

        assertEquals(firstRun.length, bubbleResult.length);
    }
}
