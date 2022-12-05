import java.util.ArrayList;
// import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeDatabase {

    private final Map<String, Employee> employees;

    public EmployeeDatabase() {
        employees = new LinkedHashMap<>();
    }

    public Employee getEmployee(String i) {
        return employees.get(i);
    }

    public void createEmployee(String i, Employee employee) {
        employees.put(i, employee);
        System.out.println("Employee no. " +
                employee.getEmployeeID() + ", " +
                employee.getFirstName() + ", " +
                employee.getLastName() + ", " +
                employee.getEmpDepartment() + ", " +
                employee.getEmpPosition() + ", " +
                employee.getEmpEducationLevel() + ", " +
                employee.getEmpGender() + ", " +
                employee.getEmpMaritalStatus() + ", " +
                " has been created.");
    }

    // get the the largest employee id
    public int getLargestEmployeeId() {
        String largestId = "0";
        Set<String> keys = employees.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            if (Integer.parseInt(key) > Integer.parseInt(largestId)) {
                largestId = key;
            }
        }
        return Integer.parseInt(largestId);
    }

    public ArrayList<String> getEmployeeNames() {
        ArrayList<String> names = new ArrayList<>();

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            names.add(employees.get(key).getFirstName());
        }

        return names;
    }

    // list employee information by employee id on separate lines
    public void listEmployeeInformation() {
        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            System.out.println(employees.get(key).toString());
        }
    }

    // list employee information by employee id on separate lines
    public void listEmployeeInformation(String i) {
        System.out.println(employees.get(i).toString());
    }

    // list all employees by department
    public void listEmployeesByDepartment(String department) {
        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (employees.get(key).getEmpDepartment().equals(department)) {
                System.out.println(employees.get(key).toString());
            }
        }
    }

    // return total number of employees
    public int getNumberOfEmployees() {
        return employees.size();
    }

    // 
    
    
    
    
}
