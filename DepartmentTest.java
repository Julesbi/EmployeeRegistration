public class DepartmentTest {

    public static void main(String[] args) {

        Department[] departments = new Department[4];

        departments[0] = new Marketing();
        departments[1] = new Sales();
        departments[2] = new Technology();
        departments[3] = new Finance();

        for (Department department : departments) {
            System.out.println(department.deptStats());
        }

    }
}