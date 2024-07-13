public class Even_OddNum{
    public static void main(String[] args) {
      
         int evenCount = 0;
        int oddCount = 0;
        for ( int i=0; i<=50;i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("total even numbers:"+evenCount);
        System.out.println("total odd numbers:"+oddCount);
    }
}