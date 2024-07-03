public class House {
   
    static String[] familyMembers;
	static {
        familyMembers = new String[]{"John", "Jane", "Alice", "Bob"};
    }
	
    public static void displayFamilyDetails() {
        System.out.println("Family Members:");
        for (String member : familyMembers) {
            System.out.println(member);
        }
    }

   
    public static void main(String[] args) {
        displayFamilyDetails();
    }
}