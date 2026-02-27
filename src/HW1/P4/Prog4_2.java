package HW1.P4;

public class Prog4_2 {
    public static void main(String[] args) {
        double sum=0;
        int n= Integer.parseInt(IO.readln("n: "));
        int top=1,bot=2;
        boolean operator = true;
        for (int i = 0; i < n; i++) {
            if (operator) {
                sum += (double) top/bot;
                operator = false;
            } else {
                sum -= (double) top/bot;
                operator = true;
            }
            top++;
            bot*=2;
        }
        System.out.printf("Sum= %.3f",sum);
    }
}
