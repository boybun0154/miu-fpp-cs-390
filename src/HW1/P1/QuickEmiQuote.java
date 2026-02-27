package HW1.P1;

import java.util.Random;

public class QuickEmiQuote {
    public static void main(String[] args) {
        Random rand = new Random();
        int p = rand.nextInt(5000,25000);
        int n = rand.nextInt(6,36);
        float apr = rand.nextFloat(3.5f,11.5f);

        double r = apr/12/100;
        double emi = p*r*(Math.pow((1+r),n))/(Math.pow((1+r),n)-1);
        double totalPayment = emi*n;
        double totalInterest = totalPayment-p;
        int castToInt = (int) emi;
        int rounded = (int) Math.round(emi);

        System.out.println("-".repeat(50));
        System.out.printf("Principal P: $%d \n", p);
        System.out.printf("Tenure n: %d\n",n);
        System.out.printf("Annual interest rate APR: %.4f%% \n",apr);
        System.out.printf("Monthly rate r: %.4f%% \n",r);
        System.out.printf("Equated Monthly Installment EMI: $%.2f\n",emi);
        System.out.printf("Total payment: $%.2f\n",totalPayment);
        System.out.printf("Total interest: $%.2f\n",totalInterest);
        System.out.printf("Cast to int: $%d\n",castToInt);
        System.out.printf("Rounded: $%d\n",rounded);
        System.out.println("-".repeat(50));
    }
}
