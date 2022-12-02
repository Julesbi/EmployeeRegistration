import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
// import java.util.ArrayList;
// import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
// import java.util.Set;

public class Employee {
    private final int pensionAge = 65;
    private String employeeID;
    private String firstName;
    private String lastName;
    private Gender empGender;
    private String contactNumber;
    private String address;
    private Level empLevel;
    private LocalDate dateStarted;
    private LocalDate dob;
    private EducationLevel empEducationLevel;
    private double salary;
    private MaritalStatus empMaritalStatus;
    private String empDepartment;
    private String empPosition;

    // CONSTRUCTORS
    public Employee() {
        this.setEmployeeID("00");
        this.setFirstName("Mark");
        this.setLastName("Cuban");
        this.setEmpGender(Gender.MALE);
        this.setContactNumber("0794352134");
        this.setAddress("KG 154 Street, Kigali");
        this.setEmpLevel(Level.MANAGER);
        this.setDateStarted(LocalDate.of(2020, Month.MAY, 19));
        this.setDob(LocalDate.of(1980, 4, 12));
        this.setEmpEducationLevel(EducationLevel.MASTERS);
        this.setSalary(5000.00);
        this.setEmpMaritalStatus(MaritalStatus.SINGLE);
        this.setEmpDepartment("IT Department");
        this.setEmpPosition("Software Developer");
    }

    public Employee(String employeeID, String firstName, String lastName, Gender empGender, String contactNumber,
            String address, Level empLevel, LocalDate dateStarted, LocalDate dob, String position,
            EducationLevel empEducationLevel, double salary, MaritalStatus empMaritalStatus, String empDepartment,
            String empPosition) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.empGender = empGender;
        this.contactNumber = contactNumber;
        this.address = address;
        this.empLevel = empLevel;
        this.dateStarted = dateStarted;
        this.dob = dob;
        this.empEducationLevel = empEducationLevel;
        this.salary = salary;
        this.empMaritalStatus = empMaritalStatus;
        this.empDepartment = empDepartment;
    }

    // GETTERS AND SETTERS
    public int getPensionAge() {
        return this.pensionAge;
    }

    public String getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getEmpGender() {
        return this.empGender;
    }

    public void setEmpGender(Gender empGender) {
        this.empGender = empGender;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Level getEmpLevel() {
        return this.empLevel;
    }

    public void setEmpLevel(Level empLevel) {
        this.empLevel = empLevel;
    }

    public LocalDate getDateStarted() {
        return this.dateStarted;
    }

    public void setDateStarted(LocalDate dateStarted) {
        this.dateStarted = dateStarted;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public EducationLevel getEmpEducationLevel() {
        return this.empEducationLevel;
    }

    public void setEmpEducationLevel(EducationLevel empEducationLevel) {
        this.empEducationLevel = empEducationLevel;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MaritalStatus getEmpMaritalStatus() {
        return this.empMaritalStatus;
    }

    public void setEmpMaritalStatus(MaritalStatus empMaritalStatus) {
        this.empMaritalStatus = empMaritalStatus;
    }

    // getter and setter for department
    public String getEmpDepartment() {
        return this.empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    // getter and setter for position
    public String getEmpPosition() {
        return this.empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    // METHODS
    /**
     * @return the number years worked in the company
     */
    public int yearsInCompany() {
        Period years = Period.between(LocalDate.now(), this.dateStarted);
        return years.getYears();
    }

    /**
     * @return the age of the employee
     */
    public int calculateAge() {
        Period years = Period.between(LocalDate.now(), this.dob);
        return years.getYears();
    }

    /**
     * @return the age remaining for an employee to go on persion
     */
    public int yearsToPension() {
        return this.pensionAge - this.calculateAge();
    }

    @Override
    public String toString() {
        return "{" +
                " pensionAge='" + getPensionAge() + "'" +
                ", employeeID='" + getEmployeeID() + "'" +
                ", firstName='" + getFirstName() + "'" +
                ", lastName='" + getLastName() + "'" +
                ", empGender='" + getEmpGender() + "'" +
                ", contactNumber='" + getContactNumber() + "'" +
                ", address='" + getAddress() + "'" +
                ", empLevel='" + getEmpLevel() + "'" +
                ", dateStarted='" + getDateStarted() + "'" +
                ", dob='" + getDob() + "'" +
                ", empEducationLevel='" + getEmpEducationLevel() + "'" +
                ", salary='" + getSalary() + "'" +
                ", empMaritalStatus='" + getEmpMaritalStatus() + "'" +
                ", departments='" + getEmpDepartment() + "'" +
                ", positions='" + getEmpPosition() + "'" +
                "}";
    }

    // create gender of enum type
    enum Gender {
        MALE,
        FEMALE
    }

    // create level of enum type
    enum Level {
        CSUITE,
        DIRECTOR,
        MANAGER
    }

    // create education level of enum type
    enum EducationLevel {
        HIGHSCHOOL,
        BACHELORS,
        MASTERS,
        PHD
    }

    // create marital status of enum type
    enum MaritalStatus {
        SINGLE,
        MARRIED,
        DIVORCED
    }

    // create hashmap for departments
    public static Map<String, String> departments = new LinkedHashMap<String, String>();
    static {
        departments.put("1", "Human Resources");
        departments.put("2", "Finance");
        departments.put("3", "Sales");
        departments.put("4", "Marketing");
        departments.put("5", "IT");
        departments.put("6", "Operations");
    }

    // create hashmap for positions
    public static Map<String, String> positions = new LinkedHashMap<String, String>();

    static {
        positions.put("1", "Manager");
        positions.put("2", "Supervisor");
        positions.put("3", "Clerk");
        positions.put("4", "Sales Representative");
        positions.put("5", "Marketing Representative");
        positions.put("6", "IT Specialist");
        positions.put("7", "Operations Manager");
    }
}
