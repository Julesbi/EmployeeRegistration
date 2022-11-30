public abstract class Department {

    private String deptID;
    private String deptName;
    private Employee deptHead;
    private int numberOfEmployees;

    public Department() {
    }

    public Department(String deptID, String deptName, Employee deptHead, int numberOfEmployees) {
        this.deptID = deptID;
        this.deptName = deptName;
        this.deptHead = deptHead;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getDeptID() {
        return this.deptID;
    }

    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }

    public String getDeptName() {
        return this.deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Employee getDeptHead() {
        return this.deptHead;
    }

    public void setDeptHead(Employee deptHead) {
        this.deptHead = deptHead;
    }

    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Department deptID(String deptID) {
        setDeptID(deptID);
        return this;
    }

    public Department deptName(String deptName) {
        setDeptName(deptName);
        return this;
    }

    public Department deptHead(Employee deptHead) {
        setDeptHead(deptHead);
        return this;
    }

    public Department numberOfEmployees(int numberOfEmployees) {
        setNumberOfEmployees(numberOfEmployees);
        return this;
    }

    // Abstract method
    // public abstract double getBudget();
    public abstract String deptStats();


    @Override
    public String toString() {
        return "{" +
            " deptID='" + getDeptID() + "'" +
            ", deptName='" + getDeptName() + "'" +
            ", deptHead='" + getDeptHead() + "'" +
            ", numberOfEmployees='" + getNumberOfEmployees() + "'" +
            "}";
    }
}