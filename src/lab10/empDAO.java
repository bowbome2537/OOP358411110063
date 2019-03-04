package lab10;



import java.util.List;

public interface empDAO {
    public List<Employee> getAllEmp();
    public void addEmp(Employee emp);
    public Employee getEmpById(int id);
    public void updateEmp(Employee emp);
    public void deleteEmp(int id);
}
