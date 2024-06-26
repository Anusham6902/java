public class Multiples{
   
    public void displayMultiplesOf3() {
        System.out.println("Multiples of 3:");
        for (int number : ContainNumbers.numbers) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    
    public void displayMultiplesOf6() {
        System.out.println("Multiples of 6:");
        for (int number : ContainNumbers.numbers) {
            if (number % 6 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}