package lab8;

public class Circle extends GraphicObject {
    private double r;
    final double PI = 3.14;
    @Override
    void draw() {
        System.out.println("Drawing Circle...");
    }

    @Override
    double findArea() {
        return PI*(r*r);
    }

    //constructor

    public Circle(double r) {
        this.r = r;
    }

    //getter and setter
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }
}//class
