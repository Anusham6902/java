public class NumberCount {
    public static void main(String[] args) {
        int[] array = {5, 7, 2, 5, 8, 3, 1, 7, 5, 7, 5, 8, 5};
        int searchNumber = 5;
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                count++;
            }
        }
        
        System.out.println("Occurrences of " + searchNumber + " in array: " + count);
    }
}