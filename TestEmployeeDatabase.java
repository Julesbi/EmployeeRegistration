// import java.time.LocalDate;

public class TestEmployeeDatabase {

	public static void main(String[] args) {
		// EmployeeRegistration form = new EmployeeRegistration();
		EmployeeDatabase dbs = new EmployeeDatabase();

		// instantiate employee
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();

		dbs.createEmployee("1", employee1);
		dbs.createEmployee("2", employee2);
		//System.out.println("Testing");
		//System.out.println(dbs.getDepartments());
		//System.out.println(dbs.getNumberOfEmployees());
		//dbs.getDepartmentListAndNumberOfEmployees();
		//System.out.println(dbs.getNumberOfEmployeesInDepartment("Human Resources"));
		//System.out.println(dbs.getDepartments());
		dbs.getEmployeeDetails();
	}

}
