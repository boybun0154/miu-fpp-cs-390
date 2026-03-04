package HW4.P1;

public class Product {
    String productName;
    double price;

    public Product(String productName, double price) {
        if (productName == null || price <= 0) {
            throw new IllegalArgumentException();
        }
        this.productName = productName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
