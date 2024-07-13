public class Pubs {

    public void displayPubInfo(String name, String location, boolean isOpen) {
        if (isOpen) {
            System.out.println("The pub " + name + " located at " + location + " is open.");
        } else {
            System.out.println("The pub " + name + " located at " + location + " is closed.");
        }
    }

 
    public boolean isPubOpen(int currentHour) {
        if (currentHour >= 10 && currentHour <= 22) {
            return true; // Pub is open from 10 AM to 10 PM
        } else {
            return false;
        }
    }

    public void getPubRating(int rating) {
        if (rating >= 4) {
            System.out.println("The pub has a great rating of " + rating + " stars!");
        } else {
            System.out.println("The pub has a rating of " + rating + " stars.");
        }
    }

    
    public void displayPubNames(String[] pubNames) {
        System.out.println("List of pub names:");
        for (String pubName : pubNames) {
            if (pubName != null && !pubName.isEmpty()) {
                System.out.println(pubName);
            } else {
                System.out.println("Invalid pub name.");
            }
        }
    }
}