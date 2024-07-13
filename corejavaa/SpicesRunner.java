public class SpicesRunner {   
   public static void main(String[] args) {
        Spices mySpices = new Spices();

        mySpices.addSpice("Pepper");
        mySpices.addSpice("Chili");

        mySpices.removeSpice("Salt");
        mySpices.removeSpice("Sugar");

        String[] spiceArray = {"Pepper", "Salt", "Chili", "Turmeric"};
        mySpices.displaySpices(spiceArray);

        mySpices.checkSpice("Turmeric");
        mySpices.checkSpice("Ginger");
    }
}