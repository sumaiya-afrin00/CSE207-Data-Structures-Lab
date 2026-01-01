package searchingAlgorithms;

public class BinarySearch {

    public void search(int[] data, int item) {
        int low = 0;
        int high = data.length - 1;
        int index = 0;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (item == data[mid]) {
                found = true;
                index = mid;
                break;
            } else if (item < data[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (found == true) {
            System.out.println("Item found at index: " + index);
        } else {
            System.out.println("Item Not Found!!");
        }
    }
}
