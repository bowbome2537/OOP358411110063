package lab8;

public abstract class GraphicObject {
    private String color;
    abstract void draw ();
    abstract double findArea();

    @Override
    public String toString() {
        return "GraphicObject{" +
                "color='" + color + '\'' +
                '}';
    }

    //getter and setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}//class
