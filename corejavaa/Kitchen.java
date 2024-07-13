public class Kitchen {


    public void checkIngredient(String ingredient) {
        String[] availableIngredients = {"salt", "pepper", "sugar", "flour"};
        boolean found = false;
        
        for (String available : availableIngredients) {
            if (available.equalsIgnoreCase(ingredient)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(ingredient + " is available.");
        } else {
            System.out.println(ingredient + " is not available.");
        }
    }

    public void calculateCalories(int[] calories) {
        int totalCalories = 0;
        
        for (int calorie : calories) {
            totalCalories += calorie;
        }

        if (totalCalories > 1000) {
            System.out.println("The meal is high in calories: " + totalCalories + " kcal");
        } else {
            System.out.println("The meal has a moderate calorie count: " + totalCalories + " kcal");
        }
    }

    public void isKitchenClean(boolean clean) {
        if (clean) {
            System.out.println("The kitchen is clean.");
        } else {
            System.out.println("The kitchen needs cleaning.");
        }
    }

    public void displayTools(String[] tools) {
        if (tools.length == 0) {
            System.out.println("No tools are available in the kitchen.");
        } else {
            System.out.println("Available kitchen tools:");
            for (String tool : tools) {
                System.out.println("- " + tool);
            }
        }
    }
}