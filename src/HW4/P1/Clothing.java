package HW4.P1;

public class Clothing extends Product{
    String brand;
    double discount;

    public Clothing(String productName, double price, String brand, double discount) {
        if (brand == null || discount < 0) {
            throw new IllegalArgumentException();
        }
        super(productName, price);
        this.brand = brand;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        double orgPrice = super.getPrice();
        return orgPrice - (orgPrice * (this.discount/100));
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "brand='" + brand + '\'' +
                ", discount=" + discount +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
