package lab8;

public class Employee extends Person {

    private String position;
    private double salary;

    //constructor
    public Employee(String pID, String name, String position, double salary) {
        super(pID, name);
        this.position = position;
        this.salary = salary;
    }

    //toString
    @Override
    public String toString() {
        return super.toString()+ "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    //getter and setter
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}//class
