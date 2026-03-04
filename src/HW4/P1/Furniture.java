package HW4.P1;

public class Furniture extends Product{
    String material;
    double shippingCost;

    public Furniture(String productName, double price, String material, double shippingCost) {
        if (material == null || shippingCost <= 0) {
            throw new IllegalArgumentException();
        }
        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.shippingCost;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", shippingCost=" + shippingCost +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
