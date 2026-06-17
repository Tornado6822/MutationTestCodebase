import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchDemoTest {

    private SearchDemo searchDemo;

    @BeforeEach
    void setUp() {
        searchDemo = new SearchDemo();
    }



    @Test
    void testBinarySearchFindsLastElement() {
        int result = searchDemo.binarySearch();

        assertEquals(99999, result);
    }

    @Test
    void testJavaBinarySearchFindsLastElement() {
        int result = searchDemo.javaBinarySearch();

        assertEquals(99999, result);
    }

    @Test
    void testAllSearchMethodsReturnSameResult() {

        assertEquals(
                searchDemo.binarySearch(),
                searchDemo.javaBinarySearch()
        );
    }

    @Test
    void testConstructorCreatesValidObject() {
        assertNotNull(searchDemo);
    }
}