public class Ott {
    public static void main(String[] args) {
        
        String userId = "user123";
        String password = "pass456";
        String subscription = "Premium";
        double subscriptionCharges = 800.0; 
        String platformName = "StreamingPlatformX";

        
        if (subscriptionCharges < 1000) {
            System.out.println("User ID: " + userId);
            System.out.println("Password: " + password);
            System.out.println("Subscription: " + subscription);
        } else {
            System.out.println("Subscription charges are not less than 1000. Current charges: " + subscriptionCharges);
        }
    }
}