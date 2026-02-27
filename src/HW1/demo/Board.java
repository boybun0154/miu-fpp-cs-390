package HW1.demo;

public class Board {
    private double l;
    private double w;
    private String color;

    public Board(double l, double w, String color) {
        this.l = l;
        this.w = w;
        this.color = color;
    }

    public Board() {
    }

    public Board(int l, int w) {
        this(l,w,"Colors");
    }

    public void display() {
        System.out.printf("length %.2f \n", l);
        System.out.printf("width %.2f \n", w);
        System.out.printf("color %s \n", color);
        System.out.printf("area %.2f \n", this.getArea());
    }

    public double getArea() {
        return this.l*this.w;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return "Board{" +
                "l=" + l +
                ", w=" + w +
                ", color='" + color + '\'' +
                '}';
    }

    public static void getTotalArea(Board[] boards) {
        if (boards.length == 0 || boards==null) return;
        double totalArea = 0;
        for (Board b : boards) {
            totalArea += b.getArea();
        }
        IO.println("Total area "+totalArea);
    }

    public double getPerimeter() {
        return (this.l*2)+(this.w*2);
    }
}
