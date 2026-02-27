package HW2.P3;

import java.util.Scanner;

public class Main {
    void main() {
        String text = """
                Enter F for Flight Booking
                Enter H for Hotel Booking
                Enter C for Car Rental
                """;
        Scanner scanner = new Scanner(System.in);
        do {
            String input = IO.readln(text);
            switch (input.toUpperCase()) {
                case "F" -> {
                    System.out.println("Enter origin: ");
                    String origin = scanner.nextLine();
                    System.out.println("Enter destination: ");
                    String destination = scanner.nextLine();
                    System.out.println("Enter distance in km: ");
                    int distance = scanner.nextInt();
                    System.out.println("Enter average speed (km/h): ");
                    double averageSpeed = scanner.nextDouble();
                    FlightBooking flightBooking = new FlightBooking(origin, destination, distance);
                    System.out.printf("Estimated Flight Time: %.2f hours \n", flightBooking.computeFlightTime(averageSpeed));
                }
                case "H" -> {
                    System.out.println("Enter hotel name: ");
                    String hotelName = scanner.nextLine();
                    System.out.println("Enter number of nights: ");
                    int numberOfNights = scanner.nextInt();
                    System.out.println("Enter price per night: ");
                    double pricePerNight = scanner.nextDouble();
                    HotelBooking hotelBooking = new HotelBooking(hotelName, numberOfNights, pricePerNight);
                    System.out.printf("Total Hotel Cost: %.2f \n", hotelBooking.totalCost());
                }
                case "C" -> {
                    System.out.println("Enter car model: ");
                    String carModel = scanner.nextLine();
                    System.out.println("Enter number of days: ");
                    int numberOfDays = scanner.nextInt();
                    System.out.println("Enter rate per day: ");
                    double ratePerDay = scanner.nextDouble();
                    System.out.println("Enter miles per day: ");
                    double milesPerDay = scanner.nextDouble();
                    CarRental carRental = new CarRental(carModel, numberOfDays, ratePerDay, milesPerDay);
                    System.out.printf("Total Rental Cost: %.2f \n", carRental.totalRentalCost());
                    System.out.printf("Total Miles Allowed: %.2f \n", carRental.totalMilesAllowed());
                }
                case null, default -> {
                    System.out.println("Invalid input");
                }
            }
            System.out.print("Ask: Do you want to continue (y/n)? ");
            scanner.nextLine(); //flush
        } while (!scanner.nextLine().equalsIgnoreCase("n"));
    }
}
