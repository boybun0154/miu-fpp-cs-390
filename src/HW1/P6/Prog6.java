package HW1.P6;

public class Prog6 {
     public static void main(String[] args) {
        do {
            String userType = IO.readln("User type: ");
            int unitConsumed = 0;
            do {
                try {
                    unitConsumed = Integer.parseInt(IO.readln("UnitConsumed: "));
                    break;
                } catch (NumberFormatException e) {
                    IO.println("Must be an integer.");
                }
            } while (true);

            float bill = switch (userType.toLowerCase()) {
                case "r" -> unitConsumed*0.12f;
                case "c" -> unitConsumed*0.20f;
                case "i" -> unitConsumed*0.35f;
                case null, default -> 0.00f;
            };

            IO.println("=".repeat(5)+" Electricity Bill "+"=".repeat(5));
            System.out.printf("User Type: %s \n",userType);
            System.out.printf("Units: %d \n",unitConsumed);
            System.out.printf("Bill Amount: $%.2f \n",bill);

            String yn;
            do {
                yn = IO.readln("Do you want to calculate another bill? (y/n):");
            } while (!yn.equalsIgnoreCase("y")&&!yn.equalsIgnoreCase("n"));
            if (yn.equalsIgnoreCase("n")) {
                IO.println("Goodbye! Thanks for using the Electricity Bill Generator.");
                break;
            }
        } while (true);
    }


}
