package HW4.P1;

public class TestClass {
    static void main(String[] args) {
        Product[] products = {
                new Furniture("Table",29,"Wood",10),
                new Clothing("T-Shirt",19,"Zada",15),
                new Electronics("TV",39,24,50),
                new Furniture("Chair",9,"Steel",4),
                new Clothing("Trouser",15,"LV",10)
        };
        for (Product product : products) {
            if (product == null)
                continue;
            System.out.println(product.toString());
        }
        System.out.printf("Total sum: %.2f", sumProducts(products));
    }
    public static double sumProducts(Product[] col) {
        double sum = 0;
        for (Product product : col) {
            if (product == null)
                continue;
            sum += product.getPrice();
        }
        return sum;
    }
}
