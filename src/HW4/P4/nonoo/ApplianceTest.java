package HW4.P4.nonoo;

public class ApplianceTest {
    static void main(String[] args) {
        Appliance[] appliances = {
            new WashingMachine(7),
            new Refrigerator(4),
            new Microwave(800)
        };
        for (Appliance appliance : appliances) {
            if (appliance==null) continue;
            System.out.println(appliance.getClass().getSimpleName());
            appliance.performFunction();
        }
    }
}
