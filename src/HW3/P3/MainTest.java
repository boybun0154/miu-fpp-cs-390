package HW3.P3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkPalindrome() {
        int number = 11211;
        assertTrue(Main.checkPalindrome(number));
    }

    @Test
    void checkPalindromeFalse() {
        int number = 11221;
        assertFalse(Main.checkPalindrome(number));
    }

    @Test
    void checkPalindromeNegative() {
        int number = -123;
        assertFalse(Main.checkPalindrome(number));
    }
}