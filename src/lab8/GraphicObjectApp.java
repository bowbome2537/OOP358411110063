package lab8;

public class GraphicObjectApp {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle(10.0,5.0);
        rec.setColor("Red");
        rec.draw();
        rec.findArea();
        System.out.println(rec.findArea());
        System.out.println(rec.getColor());
        System.out.println(rec.getHigh());
        System.out.println(rec.getWidth());

        Circle cr = new Circle(20.0);
        cr.setColor("Blue");
        System.out.println("The area of my circle is : "+cr.findArea());
        System.out.println(cr.getColor());

    }//main
}//class
