public class ConsonantCounter {

    public static void main(String[] args) {
        String[] array = {"Hello", "World", "Java"};

        int totalConsonants = countConsonantsInArray(array);
        System.out.println("Total consonants in the array: " + totalConsonants);
    }
      public static int countConsonantsInArray(String[] array) {
        int totalCount = 0;
        String vowels = "aeiouAEIOU"; 

        for (String str : array) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (!vowels.contains(String.valueOf(ch)) && Character.isLetter(ch)) {
                    totalCount++;
                }
            }
        }
        return totalCount;
    }
}
