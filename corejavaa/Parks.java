public class Parks {

   
    public void isParkOpen(String day) {
        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("The park is open today.");
        } else {
            System.out.println("The park is closed today.");
        }
    }

    
    public void hasFacility(String facility) {
        if (facility.equalsIgnoreCase("Playground") || facility.equalsIgnoreCase("Picnic Area")) {
            System.out.println("The park has the facility: " + facility);
        } else {
            System.out.println("The park does not have the facility: " + facility);
        }
    }

  
    public void calculateArea(int length, int width) {
        if (length > 0 && width > 0) {
            int area = length * width;
            System.out.println("The total area of the park is: " + area + " square meters.");
        } else {
            System.out.println("Invalid dimensions for the park area.");
        }
    }

   
    public void checkTreeCount(int[] treeCounts) {
        int totalTrees = 0;
        for (int count : treeCounts) {
            totalTrees += count;
        }
        if (totalTrees > 100) {
            System.out.println("The park has more than 100 trees.");
        } else {
            System.out.println("The park has less than or equal to 100 trees.");
        }
    }
}