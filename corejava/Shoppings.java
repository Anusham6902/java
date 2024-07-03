public class Shoppings {

   static String shoppingType;
    static double price;
    static double gst;
    static String itemName;
    static double totalPrice;

   
    public static void setShoppingType(String shoppingType) {
        
    }

    public static void displayShoppingType() {
        System.out.println("Shopping Type: " + shoppingType);
    }

    
    public static void setPriceAndGst(double price, double gst) {
       price = price;
      gst = gst;
       totalPrice = price + (price * gst / 100);
    }

    public static void displayTotalPrice() {
        System.out.println("Total Price (including GST): " + totalPrice);
    }

  
    public static void setItemName(String itemName) {
        itemName = itemName;
    }

    public static void displayItemAndType() {
        System.out.println("Item Name: " + itemName + ", Shopping Type: " + shoppingType);
    }

    // Method to display all the shopping details
    public static  void displayShoppingDetails() {
        System.out.println("Shopping Type: " +shoppingType);
        System.out.println("Item Name: " + itemName);
        System.out.println("Total Price (including GST): " +totalPrice);
    }

}