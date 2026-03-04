package HW4.P4.nonoo;

public class ApplianceTest {
    static void main(String[] args) {
        Appliance[] appliances = {
            new WashingMachine(7),
            new Refrigerator(4),
            new Microwave(800)
        };
        for (Appliance appliance : appliances) {
            switch (appliance) {
                case WashingMachine wm -> {
                    System.out.println(wm.getClass().getSimpleName());
                    wm.performFunction();
                }
                case Refrigerator fridge -> {
                    System.out.println(fridge.getClass().getSimpleName());
                    fridge.performFunction();
                }
                case Microwave mw -> {
                    System.out.println(mw.getClass().getSimpleName());
                    mw.performFunction();
                }
                case null, default -> System.out.println("Unknown type");
            }
        }
    }
}
