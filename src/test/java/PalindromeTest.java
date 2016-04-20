import org.junit.*;
import static org.junit.Assert.*;

public class PalindromeTest {
  @Test
  public void isPalindrome_notPalindrome_false() {
    Palindrome testPalindrome = new Palindrome();
    assertEquals(true, testPalindrome.isPalindrome("racecar"));
  }

}
