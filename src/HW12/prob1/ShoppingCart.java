package HW12.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            try {
                System.out.print("Enter quantity of items to add (1-50): ");
                int quantity = sc.nextInt();
                if (quantity < 1 || quantity > 50)
                    throw new IllegalArgumentException();
                System.out.println("Successfully added " + quantity + " items to your cart!");
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input type!");
                sc.nextLine();  //flush buffer
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong quantity!");
            }
        }
    }
}
