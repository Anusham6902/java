public class KitchenRunner{
	public static void main(String[] args) {
        Kitchen myKitchen = new Kitchen();
        myKitchen.checkIngredient("sugar");
        int[] mealCalories = {200, 300, 250, 400};
        myKitchen.calculateCalories(mealCalories);
        myKitchen.isKitchenClean(true);
        String[] kitchenTools = {"knife", "spoon", "fork"};
        myKitchen.displayTools(kitchenTools);
    }
}