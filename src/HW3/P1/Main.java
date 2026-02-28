package HW3.P1;

public class Main {
    static void main(String[] args) {
        String input = IO.readln("Input: ");
        minChar(input);
    }

    static void minChar(String string) {
        if (string == null || string.isEmpty())
            return;
        minChar(string, string.charAt(0));
    }

    static void minChar(String string, char ch) {
        if (string.isEmpty()) {
            System.out.println("Min char: "+ch);
        } else if (string.charAt(0) < ch) {
            minChar(string.substring(1), string.charAt(0));
        }  else {
            minChar(string.substring(1), ch);
        }
    }
}
