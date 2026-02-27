package HW2.P3;

public record HotelBooking(String hotelName, int nights, double pricePerNight) {
    public HotelBooking {
        if (hotelName == null || hotelName.isEmpty() || nights <= 0 || pricePerNight <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
    }
    public double totalCost() {
        return pricePerNight * nights;
    }
}
