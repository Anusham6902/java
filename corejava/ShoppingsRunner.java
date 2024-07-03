public class ShoppingsRunner {
 public static void main(String[] args) {
     
         Shoppings.setShoppingType("Electronics");
        Shoppings.setItemName("Laptop");
         Shoppings.setPriceAndGst(1000.0, 18.0);

         Shoppings.displayShoppingType();
         Shoppings.displayItemAndType();
        Shoppings.displayTotalPrice();
         Shoppings.displayShoppingDetails();
    }
}