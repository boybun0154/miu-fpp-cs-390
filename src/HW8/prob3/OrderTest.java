package HW8.prob3;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {
        // a) through i) here, print after each step (use for-each)
        List<Order> orders = new ArrayList<>(){
            {
                add(new Order("123","Jack",51));
                add(new Order("234","Alice",52));
                add(new Order("345","Bob",53));
                add(new Order("567","Ellie",48));
                add(new Order("678","David",49));
            }
        };
        orders.forEach(o-> System.out.println(o));
        orders.remove(new Order("123","Jack",51));
        System.out.println("Removed:");
        orders.forEach(o-> System.out.println(o));
        System.out.println("Size: "+orders.size());
        System.out.println("Order at 2: "+orders.get(2));
        orders.set(2, new Order("123","Jack",51));
        System.out.println("Order at 2 updated: "+orders.get(2));
        Collections.sort(orders, Comparator.comparing(Order::getTotalAmount)
                .thenComparing(Order::getOrderId).thenComparing(Order::getCustomerName));
        System.out.println("Orders sorted:");
        orders.forEach(o-> System.out.println(o));
        List<Order> moreThan50 = listMoreThan50(orders);
        Collections.sort(moreThan50, Comparator.comparing(Order::getCustomerName).thenComparing(Order::getOrderId).thenComparing(Order::getTotalAmount));
        System.out.println("More than 50:");
        moreThan50.forEach(o->System.out.println(o));
    }

    public static List<Order> listMoreThan50(List<Order> list) {
        // return new ArrayList<>(...) with totalAmount > 50.0
        List<Order> result = new ArrayList<>();
        Iterator<Order> it = list.iterator();
        while (it.hasNext()) {
            Order o = it.next();
            if (o.getTotalAmount()>50)
                result.add(o);
        }
        return result;
    }
}
