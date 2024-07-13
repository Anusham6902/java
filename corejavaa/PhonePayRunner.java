public class PhonePayRunner {
    public static void main(String[] args) {
        System.out.println("Transaction Details:");
        PhonePay.transactionDetails();
       
        System.out.println("\nUser Account Details:");
        PhonePay.userAccountDetails();
        
        System.out.println("\nPayment Methods:");
        PhonePay.paymentMethods();
        
        String[] transactions = {"TXN12345", "TXN67890", "TXN54321"};
        System.out.println("\nTransaction History:");
        PhonePay.transactionHistory(transactions);
    }
}