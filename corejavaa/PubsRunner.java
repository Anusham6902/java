public class PubsRunner {
 public static void main(String[] args) {
        Pubs pubs = new Pubs();
        pubs.displayPubInfo("The Red Lion", "Main Street", true);        
        int currentHour = 15; // 3 PM
        boolean isOpen = pubs.isPubOpen(currentHour);
        System.out.println("Is the pub open at " + currentHour + ":00? " + isOpen);
        pubs.getPubRating(5);
        String[] pubNames = {"The Red Lion", "The Green Dragon", "", "The Blue Lagoon"};
        pubs.displayPubNames(pubNames);
    }
}