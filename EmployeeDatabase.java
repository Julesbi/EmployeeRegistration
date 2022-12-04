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
        System.out.println("Employee " + employee.getFirstName() + " " + employee.getLastName() + " has been created.");
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
}
