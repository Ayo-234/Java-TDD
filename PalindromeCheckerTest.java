import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindrome() {
        PalindromeChecker palindrome = new PalindromeChecker();
        // Test for palindrome Strings
        assertTrue("level should be a palindrome", palindrome.isPalindrome("level"));
        assertTrue("madam should be a palindrome", palindrome.isPalindrome("madam"));

        // Test for non-palindrome Strings
        assertFalse("hello should not be a palindrome", palindrome.isPalindrome("hello"));
        assertFalse("Bingham should not be a palindrome", palindrome.isPalindrome("Bingham"));

        assertTrue("An empty String should be a palindrome", palindrome.isPalindrome(""));
    }
}
