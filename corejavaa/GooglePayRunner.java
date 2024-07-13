public class GooglePayRunner{
    public static void main(String[] args) {
       
        System.out.println("Transaction Details:");
        GooglePay.transactionDetails();
        
        System.out.println("\nUser Account Details:");
        GooglePay.userAccountDetails();
        
        System.out.println("\nPayment Methods:");
        GooglePay.paymentMethods();
        
        String[] transactions = {"TXN54321", "TXN09876", "TXN13579"};
        System.out.println("\nTransaction History:");
        GooglePay.transactionHistory(transactions);
    }
}