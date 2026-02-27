package HW2.P4;

public class Pizza {
    private PizzaType type;
    private PizzaSize size;
    private int quantity;
    private double price;

    public Pizza(PizzaSize size, PizzaType type, int quantity) {
        this.type = type;
        this.size = size;
        this.quantity = quantity;
    }

    private void calculatePrice() {
        double typePrice = switch (type) {
            case PizzaType.VEGGIE -> 1;
            case PizzaType.PEPPERONI, PizzaType.BBQ_CHICKEN -> 2;
            case PizzaType.CHEEZE -> 1.5;
        };
        double sizePrice = switch (size) {
            case PizzaSize.SMALL ->  8;
            case PizzaSize.MEDIUM -> 10;
            case PizzaSize.LARGE -> 12;
        };
        this.price = typePrice*sizePrice;
    }

    public String printOrderSummary() {
        calculatePrice();
        return String.format("Pizza Order:\nSize: %s\nType: %s\nQty: %d\nPrice: $%.2f\nTax: $%.2f\nTotal Price: $%.2f\n"
                ,this.size, this.type, this.quantity, this.price, this.price*3/100, this.price+this.price*3/100);
    }
}
