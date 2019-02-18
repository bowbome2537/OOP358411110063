package lab8;

public class Honda implements Car {
    //properties
    private String id;
    private String color;

    //constructor
    public Honda(String id, String color) {
        this.id = id;
        this.color = color;
    }

        // getter and setter method
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        //toString()
    @Override
    public String toString() {
        return "Honda{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void startEngine() {
    }
    @Override
    public void turnRight(double x) {
    }
    @Override
    public void turnLeft(double x) {
    }
    @Override
    public void stop() {
    }
}//class
