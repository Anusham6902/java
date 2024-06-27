public class Vowel {

    public static void main(String[] args) {
        String[] array = {"Deepika", "Gagana", "Anusha"};

        int totalVowels = countVowelsInArray(array);
        System.out.println("Total vowels in the array: " + totalVowels);
    }

    public static int countVowelsInArray(String[] array) {
        int totalCount = 0;
        String vowels = "aeiouAEIOU";
        for (String str : array) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (vowels.indexOf(ch) != -1) {
                    totalCount++;
                }
            }
        }
        return totalCount;
    }
}
