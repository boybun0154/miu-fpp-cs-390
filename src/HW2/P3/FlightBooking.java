package HW2.P3;

public record FlightBooking(String origin, String destination, int distanceKm) {
    public FlightBooking {
        if (distanceKm <= 0 || origin == null || destination == null || origin.isEmpty() || destination.isEmpty()) {
            throw new IllegalArgumentException("Invalid arguments");
        }
    }

    public double computeFlightTime(double avgSpeed) {
        return this.distanceKm / avgSpeed;
    }
}
