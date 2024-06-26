public class SumOfArray {
    public static void main(String[] args) {
   
     int[] numbers = {18,7,45,17,77};
     int sum = calculateSum(numbers);
    System.out.println("The sum of the array elements is: " + sum);
    }
     public static int calculateSum(int[] numbers) {
     int sum = 0;
     for (int i = 0; i < numbers.length; i++) {
           sum += numbers[i];
        }
        return sum;
    }
}