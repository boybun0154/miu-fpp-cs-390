package HW1.P4;

public class Prog4 {
    public static void main(String[] args) {
        double sum=0;
        int n= Integer.parseInt(IO.readln("n: "));
        int m = 1;
        boolean operator = true;
        for (int i = 0; i < n; i++) {
            if (operator) {
                sum += (double) 1/m;
                operator = false;
            } else {
                sum -= (double) 1/m;
                operator = true;
            }
            m+=2;
        }
        System.out.printf("Sum= %.3f",sum);
    }
}
