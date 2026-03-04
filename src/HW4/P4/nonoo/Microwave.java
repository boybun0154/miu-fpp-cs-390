package HW4.P4.nonoo;

public class Microwave implements Appliance{
    private int powerLevel;

    public Microwave(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String heatFood() {
        return "Heating food at power level: " + powerLevel + ".";
    }
    public void performFunction() {
        System.out.println("Heating food at power level: " + powerLevel + ".");
    }
}
