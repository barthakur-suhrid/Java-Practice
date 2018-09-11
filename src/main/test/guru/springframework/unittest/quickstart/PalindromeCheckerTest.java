package guru.springframework.unittest.quickstart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    PalindromeChecker palindromeChecker=null;
    PalindromeCheckerTest palindromeCheckerTest=null;

    @Before
    public void setUp() throws Exception {
        palindromeChecker=new PalindromeChecker();
        palindromeCheckerTest=new PalindromeCheckerTest();
    }

    @After
    public void tearDown() throws Exception {
        palindromeCheckerTest=null;
        palindromeCheckerTest=null;
    }

    @Test
    public void checkPalindrome1() {
        //Expected
        String expected ="The string is a Palindrome";
        //Actual
        String results=palindromeChecker.CheckPalindrome("122232221");
        // Assert
        assertEquals(expected,results);

    }

    @Test
    public void checkPalindrome2() {
        //Expected
        String expected ="The string is not a Palindrome";
        //Actual
        String results=palindromeChecker.CheckPalindrome("23345332");
        // Assert
        assertEquals(expected,results);

    }

    @Test
    public void getReverse() {
        //Expected
        String expected ="23354332";
        //Actual
        String results=palindromeChecker.getReverse("23345332");
        // Assert
        assertEquals(expected,results);
    }
}