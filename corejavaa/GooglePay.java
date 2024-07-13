public class GooglePay {
    public static void transactionDetails() {
        String transactionId = "TXN54321";
        double amount = 2500.00;
        boolean isSuccess = true;

        if (transactionId.equals("TXN54321")) {
            System.out.println("Transaction ID: " + transactionId);
        } else {
            System.out.println("Invalid Transaction ID");
        }

        if (isSuccess) {
            System.out.println("The transaction was successful.");
        } else {
            System.out.println("The transaction failed.");
        }

        if (amount > 2000) {
            System.out.println("High-value transaction.");
        } else {
            System.out.println("Low-value transaction.");
        }
    }

    public static void userAccountDetails() {
        String userName = "RAJ";
        long accountNumber = 99875642313L;
        boolean isVerified = true;

        if (userName.equals("RAJ")) {
            System.out.println("User: " + userName);
        } else {
            System.out.println("Invalid User");
        }

        if (isVerified) {
            System.out.println("The account is verified.");
        } else {
            System.out.println("The account is not verified.");
        }

        if (accountNumber == 99875642313L) {
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid Account Number");
        }
    }

    public static void paymentMethods() {
        String method = "Credit Card";
        boolean isActive = true;

        if (method.equals("Credit Card")) {
            System.out.println("Payment Method: " + method);
        } else {
            System.out.println("Unknown Payment Method");
        }

        if (isActive) {
            System.out.println("The payment method is active.");
        } else {
            System.out.println("The payment method is inactive.");
        }
    }

    public static void transactionHistory(String[] transactions) {
        for (String transaction : transactions) {
            if (transaction.equals("TXN54321")) {
                System.out.println("Transaction: " + transaction);
            } else if (transaction.equals("TXN09876")) {
                System.out.println("Transaction: " + transaction);
            } else {
                System.out.println("Unknown transaction: " + transaction);
            }
        }
    }
}