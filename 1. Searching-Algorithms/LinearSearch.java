package searchingAlgorithms;

public class LinearSearch {

    public void search(int[] data, int item) {
        boolean found = false;
        int index = 0;

        for (int i = 0; i < data.length; i++) {
            if (item == data[i]) {   
                found = true;
                index = i;
                break;
            }
        }

        if (found == true) {
            System.out.println("Item found at index : "+ index);
        } else {
            System.out.println("Item not found! ");
        }
    }
}

