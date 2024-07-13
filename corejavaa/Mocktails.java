public class Mocktails {

    
    public void checkAvailability(String mocktail) {
        if (mocktail.equalsIgnoreCase("Mojito")) {
            System.out.println(mocktail + " is available.");
        } else {
            System.out.println(mocktail + " is not available.");
        }
    }

    
    public void suggestMocktail(String baseIngredient) {
        if (baseIngredient.equalsIgnoreCase("Mint")) {
            System.out.println("You might like a Mojito.");
        } else if (baseIngredient.equalsIgnoreCase("Lemon")) {
            System.out.println("You might like a Lemonade.");
        } else {
            System.out.println("Sorry, no suggestions available for " + baseIngredient + ".");
        }
    }


    public void totalMocktails(int count) {
        if (count > 0) {
            System.out.println("We have " + count + " mocktails available.");
        } else {
            System.out.println("No mocktails available.");
        }
    }

    public void displayMocktails(String[] mocktails) {
        if (mocktails.length > 0) {
            System.out.println("Available mocktails:");
            for (String mocktail : mocktails) {
                System.out.println("- " + mocktail);
            }
        } else {
            System.out.println("No mocktails available.");
        }
    }

}