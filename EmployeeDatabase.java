import java.util.ArrayList;
// import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import java.util.Formatter;

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

    // return the list of departments in the company
    public ArrayList<String> getDepartments() {
        ArrayList<String> departments = new ArrayList<>();

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            departments.add(employees.get(key).getEmpDepartment());
        }

        return departments;
    }

    // return number of employees in a department
    public int getNumberOfEmployeesInDepartment(String department) {
        int count = 0;
        System.out.println("Department: " + department);

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (employees.get(key).getEmpDepartment().equals(department)) {
                count++;
            }
        }

        return count;
    }

    // get the list of departments and the number of employees in each department on separate lines
    public void getDepartmentListAndNumberOfEmployees() {
        ArrayList<String> departments = getDepartments();
        System.out.printf("%-20s %s\n", "Department", "Number of Employees");
        for (String department : departments) {
            System.out.printf("%-20s %d\n", department, getNumberOfEmployeesInDepartment(department));
        }
    }

    // return total number of employees
    public int getNumberOfEmployees() {
        return employees.size();
    }

    // return average salary of employees
    public double getAverageSalary() {
        double totalSalary = 0;
        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            totalSalary += employees.get(key).getSalary();
        }

        return totalSalary / employees.size();
    }

    // return the list of positions in the company
    public ArrayList<String> getPositions() {
        ArrayList<String> positions = new ArrayList<>();

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            positions.add(employees.get(key).getEmpPosition());
        }

        return positions;
    }

    // return total counts of males
    public int getNumberOfMales() {
        int count = 0;

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (employees.get(key).getEmpGender().equals(Employee.Gender.MALE)) {
                count++;
            }
        }

        return count;
    }

    // return total counts of females
    public int getNumberOfFemales() {
        int count = 0;

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (employees.get(key).getEmpGender().equals(Employee.Gender.FEMALE) ) {
                count++;
            }
        }
        return count;
    }

    // return total single employees
    public int getNumberOfSingleEmployees() {
        int count = 0;

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (employees.get(key).getEmpMaritalStatus().equals(Employee.MaritalStatus.SINGLE)) {
                count++;
            }
        }

        return count;
    }

    // return total married employees
    public int getNumberOfMarriedEmployees() {
        int count = 0;

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (employees.get(key).getEmpMaritalStatus().equals(Employee.MaritalStatus.MARRIED)) {
                count++;
            }
        }

        return count;
    }

    // return total phd employees
    public int getNumberOfPhdEmployees() {
        int count = 0;

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (employees.get(key).getEmpEducationLevel().equals(Employee.EducationLevel.PHD)) {
                count++;
            }
        }

        return count;
    }

    // return total masters employees
    public int getNumberOfMastersEmployees() {
        int count = 0;

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (employees.get(key).getEmpEducationLevel().equals(Employee.EducationLevel.MASTERS)) {
                count++;
            }
        }

        return count;
    }

    // return total bachelors employees
    public int getNumberOfBachelorsEmployees() {
        int count = 0;

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (employees.get(key).getEmpEducationLevel().equals(Employee.EducationLevel.BACHELORS)) {
                count++;
            }
        }

        return count;
    }

    // return total high school employees
    public int getNumberOfHighSchoolEmployees() {
        int count = 0;

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (employees.get(key).getEmpEducationLevel().equals(Employee.EducationLevel.HIGH_SCHOOL)) {
                count++;
            }
        }

        return count;
    }

    // return average tenure of employees
    public double getAverageTenure() {
        double totalTenure = 0;
        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            totalTenure += employees.get(key).yearsInCompany();
        }

        return totalTenure / employees.size();
    }

    // return the age distribution of employees
    public void getAgeDistribution() {
        int countUnder20 = 0;
        int count20to30 = 0;
        int count30to40 = 0;
        int count40to50 = 0;
        int countOver50 = 0;

        Iterator<String> iterator = null;
        Set<String> hashMapKeys = employees.keySet();

        iterator = hashMapKeys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            int age = employees.get(key).calculateAge();
            if (age < 20) {
                countUnder20++;
            } else if (age >= 20 && age < 30) {
                count20to30++;
            } else if (age >= 30 && age < 40) {
                count30to40++;
            } else if (age >= 40 && age < 50) {
                count40to50++;
            } else {
                countOver50++;
            }
        }

        System.out.println("Age Distribution");
        System.out.println("Under 20: " + countUnder20);
        System.out.println("20 to 30: " + count20to30);
        System.out.println("30 to 40: " + count30to40);
        System.out.println("40 to 50: " + count40to50);
        System.out.println("Over 50: " + countOver50);
    }



}
