public class Meesho {
    
  
    public static void method1() {
        System.out.println("Method 1: Static method without arguments related with Meesho");
    }
    
    
    public void method2(int[] array) {
        if (array != null && array.length > 0) {
            System.out.println("Method 2: Instance method with array argument related with Meesho");
        }
    }

    public static void method3(String message) {
        if ("meesho".equals(message)) {
            System.out.println("Method 3: Static method with String argument related with Meesho");
        }
    }
    

    public void method4() {
        System.out.println("Method 4: Instance method without arguments related with Meesho");
    }
}