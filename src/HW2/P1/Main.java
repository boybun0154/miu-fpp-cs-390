package HW2.P1;

public class Main {
    static void main() {
        Customer customer = new Customer("Rahul","Lama","111222333");
        Customer customer2 = new Customer("Budhil","Thijm","222333444");
        Customer customer3 = new Customer("Joao Pedro","Silva","333444555");

        Address chicago = new Address("AA","Chicago","Illinois","50000");
        Address desMoines = new Address("BB","Des Moines","Iowa","52000");

        customer.setBillingAddress(chicago);
        customer2.setBillingAddress(chicago);
        customer3.setBillingAddress(desMoines);

        customer.setShippingAddress(desMoines);
        customer2.setShippingAddress(desMoines);
        customer3.setShippingAddress(chicago);

        Customer[] customers = new Customer[]{customer,customer2,customer3};
        IO.println("Customers in Chicago:");
        for (Customer c : customers) {
            if (("Chicago").equals(c.getBillingAddress().getCity())){
                IO.println(c);
            }
        }
    }
}
