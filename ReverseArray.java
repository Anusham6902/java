public class ReverseArray {
    public static void main(String[] args) {
        
        int[] numbers = {7, 18,17,45,9};
        int[] reversedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("Reversed array:");
        for (int element : reversedArray) {
            System.out.print(element + " ");
        }
    }
}