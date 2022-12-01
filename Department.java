
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

	public String getdeptID() {
		return deptID;
	}

	public void setdeptID(String deptID) {
		this.deptID = deptID;
	}

	public String getdeptName() {
		return deptName;
	}

	public void setdeptName(String deptName) {
		this.deptName = deptName;
	}

	public Employee getdeptHead() {
		return deptHead;
	}

	public void setdeptHead(Employee deptHead) {
		this.deptHead = deptHead;
	}

	public int getnumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setnumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

    public String toString(){
        return "Department created with name " + deptID;
    }

	public abstract String deptStats();
}