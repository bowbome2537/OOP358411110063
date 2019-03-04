package lab10;

import java.util.List;

public class DAOApp {
    public static void main(String[] args) {
        empDAOlmpl dao = empDAOlmpl.getInstant();

        //GET ALL EMP
        showAllData(dao);



        //ADD_EMP
        Employee newEmp = new Employee(
                102,
                "bome bow",
                "System Analysis",
                30000);
        //     dao.addEmp(newEmp);
        //     showAllData(dao);

        //FIND_BY_ID
        Employee e = dao.getEmpById(100);
        System.out.println(e.toString());

        //UPDATE_EMP
        e.setSalary(30000);
        dao.updateEmp(e);
        showAllData(dao);

        //DELETE_EMP
        dao.deleteEmp(100);
        showAllData(dao);
    }


    private static void showAllData(empDAOlmpl dao) {
        List<Employee> allEmp = dao.getAllEmp();
        System.out.println("-----Data in Database-----");
        for (Employee emp: allEmp) {
            System.out.println(emp.toString());
        }
        System.out.println("--------------------------");
    }
}