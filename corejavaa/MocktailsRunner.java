public class MocktailsRunner{
	public static void main(String[] args) {
        Mocktails mocktails = new Mocktails();
        mocktails.checkAvailability("Mojito");
        mocktails.checkAvailability("Cola");
        mocktails.suggestMocktail("Mint");
        mocktails.suggestMocktail("Orange");
        mocktails.totalMocktails(5);
        mocktails.totalMocktails(0);
        String[] availableMocktails = {"Mojito", "Lemonade", "Fruit Punch"};
        mocktails.displayMocktails(availableMocktails);
        mocktails.displayMocktails(new String[]{});
    }
}