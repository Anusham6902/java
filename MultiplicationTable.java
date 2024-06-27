public class MultiplicationTable {

    public static void main(String[] args) {
        int number = 2; 
        int limit = 10; 

        System.out.println("Multiplication Table for " + number + ":");

        for (int i = 1; i <= limit; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
