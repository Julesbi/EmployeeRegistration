/**
 * 
 */
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
/**
 * @author Sebastian Dakey
 *
 */
public abstract class Employee 
{
	// instance variables of Employee class
	private final int persionAge = 60;
    private String employeeID;
    private String firstName;
    private String lastName; 
    private Gender empGender;
    private String contactNumber;
    private String address;
    private Level empLevel;
    private LocalDate dateStarted;
    private LocalDate dob;
    private String position;
    private EducationLevel empEducationLevel;
    private double salary;
    private MaritalStatus empMaritalStatus;


    public Employee(String employeeID, String firstName, String lastName, Gender empGender, String constactNumber, String address,
    Level empLevel, LocalDate dateStarted, LocalDate dob, String position, EducationLevel empEducationLevel, double salary, MaritalStatus empMaritalStatus) 
    {
        this.setEmployeeID(employeeID);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmpGender(empGender);
        this.setContactNumber(constactNumber);
        this.setAddress(address);
        this.setEmpLevel(empLevel);
        this.setDateStarted(dateStarted);
        this.setDob(dob);
        this.setPosition(position);
        this.setEmpEducationLevel(empEducationLevel);
        this.setSalary(salary);
        this.setEmpMaritalStatus(empMaritalStatus);
    }

    public Employee()
    {
        this.setEmployeeID("EMP0000");
        this.setFirstName("Mark");
        this.setLastName("Cuban");
        this.setEmpGender(Gender.MALE);
        this.setContactNumber("0794352134");
        this.setAddress("KG 154 Street, Kigali");
        this.setEmpLevel(Level.MANAGER);
        this.setDateStarted(LocalDate.of(2020, Month.MAY, 19));
        this.setDob(LocalDate.of(1980, 4, 12));
        this.setPosition("Senior Finance Officer");
        this.setEmpEducationLevel(EducationLevel.MASTERS);
        this.setSalary(5000.00);
        this.setEmpMaritalStatus(MaritalStatus.SINGLE);
    }
    
    /**
	 * @return the number years worked in the company
	 */
    public int yearsInCompany()
    {
    	Period years = Period.between(LocalDate.now(),this.dateStarted);
        return years.getYears(); 
    }
    
    /**
	 * @return the age of the employee
	 */
    public int calculateAge()
    {
    	Period years = Period.between(LocalDate.now(),this.dob);
    	return years.getYears();
    }
    /**
	 * @return the age remaining for an employee to go on persion
	 */
    public int yearsToPension()
    {
    	return this.persionAge - this.calculateAge();
    }
	/**
	 * @return the employeeID
	 */
	public String getEmployeeID() 
	{
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(String employeeID) 
	{
		this.employeeID = employeeID;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the empGender
	 */
	public Gender getEmpGender() {
		return empGender;
	}

	/**
	 * @param empGender the empGender to set
	 */
	public void setEmpGender(Gender empGender) {
		this.empGender = empGender;
	}

	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the empLevel
	 */
	public Level getEmpLevel() {
		return empLevel;
	}

	/**
	 * @param empLevel the empLevel to set
	 */
	public void setEmpLevel(Level empLevel) {
		this.empLevel = empLevel;
	}

	/**
	 * @return the dateStarted
	 */
	public LocalDate getDateStarted() {
		return dateStarted;
	}

	/**
	 * @param dateStarted the dateStarted to set
	 */
	public void setDateStarted(LocalDate dateStarted) {
		this.dateStarted = dateStarted;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the empEducationLevel
	 */
	public EducationLevel getEmpEducationLevel() {
		return empEducationLevel;
	}

	/**
	 * @param empEducationLevel the empEducationLevel to set
	 */
	public void setEmpEducationLevel(EducationLevel empEducationLevel) {
		this.empEducationLevel = empEducationLevel;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the empMaritalStatus
	 */
	public MaritalStatus getEmpMaritalStatus() {
		return empMaritalStatus;
	}

	/**
	 * @param empMaritalStatus the empMaritalStatus to set
	 */
	public void setEmpMaritalStatus(MaritalStatus empMaritalStatus) {
		this.empMaritalStatus = empMaritalStatus;
	}

	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	/**
	 * @return the persionAge
	 */
	public int getPersionAge() {
		return persionAge;
	}
	
    
}

//create gender of enum type 
enum Gender {
  MALE,
  FEMALE
}

//create level of enum type
enum Level {
  CSUITE,
  DIRECTOR,
  MANAGER
}

//create education level of enum type
enum EducationLevel {
  HIGHSCHOOL,
  BACHELORS,
  MASTERS,
  PHD
}

//create marital status of enum type
enum MaritalStatus {
  SINGLE,
  MARRIED,
  DIVORCED
}
