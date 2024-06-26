public class EvenOddCount {
    public static void main(String[] args) {
      
        int[] numbers = {11,34,3,44, 5, 6,56, 8, 7, 10};
         int evenCount = 0;
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    }
}