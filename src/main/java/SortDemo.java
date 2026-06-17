import java.util.Arrays;

public class SortDemo {

    private static final int SIZE = 10000;

    private int[] data;

    public SortDemo() {
        data = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            data[i] = (int)(Math.random() * SIZE);
        }
    }

    //Sorting optimized by JDK based on data type
    public int[] javaSort() {
        int[] copy = data.clone();
        Arrays.sort(copy);
        return copy;
    }

    //Bubble sort
    public int[] bubbleSort() {
        int[] copy = data.clone();

        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = 0; j <copy.length - i - 1; j++) {
                if (copy[j] > copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
        }
        return copy;
    }

    //Insertion sort
    public int[] insertionSort() {
        int[] copy = data.clone();

        for (int i = 1; i < copy.length; i++) {
            int key = copy[i];
            int j = i - 1;

            while (j >= 0 && copy[j] > key) {
                copy[j + 1] = copy[j];
                j--;
            }

            copy[j + 1] = key;
        }

        return copy;
    }
}