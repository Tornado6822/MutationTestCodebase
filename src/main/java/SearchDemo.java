import java.util.Arrays;

public class SearchDemo {

    private static final int SIZE = 100000;

    private int[] data;

    public SearchDemo() {
        data = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            data[i] = i;
        }
    }

    public int linearSearch() {
        int target = SIZE - 1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public int binarySearch() {
        int target = SIZE - 1;

        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (data[mid] == target) {
                return mid;
            }

            if (data[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public int javaBinarySearch() {
        return Arrays.binarySearch(data, SIZE - 1);
    }
}

