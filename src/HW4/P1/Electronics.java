package HW4.P1;

public class Electronics extends Product{
    int warranty;
    double warrantyCost;

    public Electronics(String productName, double price, int warranty, double warrantyCost) {
        if (warranty <= 0 || warrantyCost <= 0) {
            throw new IllegalArgumentException();
        }
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.warrantyCost;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "warranty=" + warranty +
                ", warrantyCost=" + warrantyCost +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
