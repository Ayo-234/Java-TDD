 public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        word.toLowerCase(); 
        int length = word.length();

        for (int i = 0; i < length / 2; i++) { // loop to check if a word is a palindrome
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "Bingham";
        String word2 = "level";
        String word3 = "madam";

        System.out.println(word1 + " is a palindrome: " + isPalindrome(word1));
        System.out.println(word2 + " is a palindrome: " + isPalindrome(word2));
        System.out.println(word3 + " is a palindrome: " + isPalindrome(word3));
    }
}
