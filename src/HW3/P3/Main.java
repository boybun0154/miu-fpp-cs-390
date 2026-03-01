package HW3.P3;

public class Main {
    static void main(String[] args) {
        int input = Integer.parseInt(IO.readln("Input: "));
        System.out.println("isPalindrome: "+checkPalindrome(input));
    }

    public static boolean checkPalindrome(int number) {
        if (number < 0) return false;
        int digits = (int) Math.log10(number) + 1; // return the power of 10 needed to get number (how many 0)
        return checkPalindrome(number, digits);
    }

    private static boolean checkPalindrome(int number, int digits) {
        if (digits <= 1) return true;

        int firstDigit = number / (int) Math.pow(10, digits - 1);
        int lastDigit = number % 10;
        if (firstDigit != lastDigit) return false;

        // Remove first and last digits
        int dividend = number % (int) Math.pow(10, digits - 1);
        int stripped = dividend / 10;
        return checkPalindrome(stripped, digits - 2);
    }
}
