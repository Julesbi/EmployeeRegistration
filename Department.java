/*
 * Department.java
 * 
 * Code for the Department class: abstract class
 *
 * Author: Niyomwungeri Parmenide ISHIMWE
 */
public abstract class Department {

	private String deptID;
	private String deptName;
	private Employee deptHead;
	private int numberOfEmployees;

	public Department() {}

    public Department(String deptID, String deptName, Employee deptHead, int numberOfEmployees){
        this.deptID = deptID;
        this.deptName = deptName;
        this.deptHead = deptHead;
        this.numberOfEmployees = numberOfEmployees;
    }

	public String getDeptID() {
		return deptID;
	}

	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Employee getDeptHead() {
		return deptHead;
	}

	public void setDeptHead(Employee deptHead) {
		this.deptHead = deptHead;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

    public String toString(){
        return "Department created with name " + deptID;
    }

	public abstract String deptStats();
}