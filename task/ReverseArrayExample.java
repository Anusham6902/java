public class ReverseArrayExample {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original array:");
        for (int element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Reverse the array
        reverseArray(myArray);

        // Print reversed array
        System.out.println("Reversed array:");
        for (int element : myArray) {
            System.out.print(element + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        if (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }
}