package HW8.prob3;

import java.util.Objects;

public class Order {
    private String orderId;
    private String customerName;
    private double totalAmount;

    public Order(String orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // getters/setters


    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        // implement: same orderId => equal
        if (!(o instanceof Order order)) return false;
        return Objects.equals(orderId, order.orderId) && Double.compare(totalAmount, order.totalAmount) == 0 && Objects.equals(customerName, order.customerName);
    }

    @Override
    public int hashCode() {
        // consistent with equals
        return Objects.hash(orderId, customerName, totalAmount);
    }

    @Override
    public String toString() {
        return "Order{" + orderId + ", " + customerName + ", " + totalAmount + "}";
    }
}
