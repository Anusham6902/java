public class Factorial {
    public static void main(String[] args) {
        int[] array = {5, 3, 7, 4};
        
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            long factorial = 1;
            for (int j = 1; j <= number; j++) {
                factorial =factorial*j;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}