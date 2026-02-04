import java.util.*;

class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        int index = Arrays.binarySearch(arr, 7);

        if (index >= 0)
            System.out.println("Found at index " + index);
        else
            System.out.println("Not found");
    }
}
