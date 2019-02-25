package lab9;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class Employee{
    private int id;
    private String name;
    private String position;
    private double salary;
        //constructor
    public Employee(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

     //toString
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
}//employee

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 1 : load driver
        Class.forName("org.sqlite.JDBC");
        System.out.println("Load Driver successfully.");

        //step 2 : create Connection
        String SQCONN = "jdbc:sqlite:D:/OOP358411110063/src/company.sqlite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(SQCONN);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (conn == null){
            System.out.println("Could not connect to DB.");
        }else {
            System.out.println("Could to DB.");
        }

        //step 3 : create Statement, result set
        Statement stmt = conn.createStatement();
        String sql = "select * from employee";
        ResultSet rs = stmt.executeQuery(sql);

        //step 4 : viewing data
        List<Employee> emp = new ArrayList<>();
        while (rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String position = rs.getString(3);
            Double salary = rs.getDouble(4);
//            System.out.println("ID :"+id);
//            System.out.println("name :"+name);
//            System.out.println("position :"+position);
//            System.out.println("salary :"+salary);
//            System.out.println("---------------------------");
            emp.add(new Employee(id,name,position,salary));
        }

        //step 5 : close connection
        rs.close();
        stmt.close();
        conn.close();

        //viewing data via object
        for (Employee e:emp) {
            System.out.println("ID:"+e.getId());
            System.out.println("name:"+e.getName());
            System.out.println(emp.toString());

        }

    }//main
    }//class
