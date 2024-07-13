public class Spices {

    
    void addSpice(String spice) {
        if (spice.equalsIgnoreCase("Pepper")) {
            System.out.println("Adding Pepper to the collection.");
        } else {
            System.out.println(spice + " is not Pepper.");
        }
    }

    
    void removeSpice(String spice) {
        if (spice.equalsIgnoreCase("Salt")) {
            System.out.println("Removing Salt from the collection.");
        } else {
            System.out.println(spice + " is not Salt.");
        }
    }

    
    void displaySpices(String[] spices) {
        for (String spice : spices) {
            if (spice.length() > 3) {
                System.out.println("Displaying spice: " + spice);
            } else {
                System.out.println(spice + " has a name that is too short.");
            }
        }
    }

  
    void checkSpice(String spice) {
        if (spice.equalsIgnoreCase("Turmeric")) {
            System.out.println("Turmeric is in the collection.");
        } else {
            System.out.println(spice + " is not Turmeric.");
        }
    }

 }