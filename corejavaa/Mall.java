public class Mall {

    void displayShops(String[] shops) {
        if (shops.length > 0) {
            System.out.println("Shops in the mall:");
            for (String shop : shops) {
                System.out.println(shop);
            }
        } else {
            System.out.println("No shops available.");
        }
    }

   
    void displayFloors(int floors) {
        if (floors > 0) {
            System.out.println("The mall has " + floors + " floors.");
        } else {
            System.out.println("The mall has no floors.");
        }
    }

   
    void displayParking(boolean hasParking) {
        if (hasParking) {
            System.out.println("The mall has parking facilities.");
        } else {
            System.out.println("The mall does not have parking facilities.");
        }
    }

   
    void displayMallName(String name) {
        if (name != null && !name.isEmpty()) {
            System.out.println("Mall Name: " + name);
        } else {
            System.out.println("No name provided for the mall.");
        }
    }

   }