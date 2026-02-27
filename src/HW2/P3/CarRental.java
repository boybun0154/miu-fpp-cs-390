package HW2.P3;

public final class CarRental {
    private final String carModel;
    private final int days;
    private final double ratePerDay;
    private final double milesPerDay;

    public CarRental(String carModel, int days, double ratePerDay, double milesPerDay) {
        if (days <= 0 || carModel == null || carModel.isEmpty() || ratePerDay <= 0 || milesPerDay <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.carModel = carModel;
        this.days = days;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    public double totalRentalCost() {
        return this.days * this.ratePerDay;
    }

    public double totalMilesAllowed() {
        return this.milesPerDay * this.milesPerDay;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getDays() {
        return days;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }

    public double getMilesPerDay() {
        return milesPerDay;
    }
}
