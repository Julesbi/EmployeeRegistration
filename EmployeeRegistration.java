import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

public class EmployeeRegistration extends JFrame implements ActionListener {
        EmployeeDatabase db = new EmployeeDatabase();
        private JLabel fNameLabel;
        private JTextField fNameText;
        private JLabel lNameLabel;
        private JTextField lNameText;
        private JLabel addressLabel;
        private JTextField addressText;
        private JLabel contactLabel;
        private JTextField contactText;
        private JLabel salaryLabel;
        private JTextField salaryText;
        private JLabel departmentLabel;
        private JComboBox<String> departmentText;
        private JLabel positionLabel;
        private JComboBox<String> positionText;
        private JLabel profLevelLabel;
        private JComboBox<Employee.Level> profLevelText;

        private JLabel eduLevelLabel;
        private JComboBox<Employee.EducationLevel> eduLevelText;

        private JLabel employeeTypeLabel;
        private JComboBox<Employee.EmployeeType> employeeTypeText;

        private JLabel dateOfBirthLabel;
        private JComboBox<String> dateOB;
        private JComboBox<String> monthOB;
        private JComboBox<String> yearOB;

        private JLabel dateStartedLabel;
        private JComboBox<String> dateSD;
        private JComboBox<String> monthSD;
        private JComboBox<String> yearSD;

        private JLabel genderLabel;
        private JRadioButton male;
        private JRadioButton female;
        private JLabel maritalLabel;
        private JRadioButton single;
        private JRadioButton married;
        private ButtonGroup genderGroup;
        private ButtonGroup maritalGroup;
        private JButton submit;
        private JButton reset;
        private JButton buttonNew;


        String dates[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15",
                        "16",
                        "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String months[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
        String years[] = { "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970",
                        "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982",
                        "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994",
                        "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006",
                        "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018",
                        "2019", "2020", "2021", "2022" };

        String departments[] = Employee.departments.values().toArray(new String[0]);
        String positions[] = Employee.positions.values().toArray(new String[0]);
        Employee.Level profLevels[] = Employee.Level.values();
        Employee.EmployeeType empTypes[] = Employee.EmployeeType.values();
        Employee.EducationLevel eduLevels[] = Employee.EducationLevel.values();
        String selectedDepartment, selectedPosition;

        // create the reset function
        public void resetForm() {
                fNameText.setText("");
                lNameText.setText("");
                contactText.setText("");
                addressText.setText("");
                salaryText.setText("");
                eduLevelText.setSelectedIndex(-1);
                genderGroup.clearSelection();
                maritalGroup.clearSelection();
                positionText.setSelectedIndex(0);
                eduLevelText.setSelectedIndex(0);
                profLevelText.setSelectedIndex(0);
                yearOB.setSelectedIndex(0);
                monthOB.setSelectedIndex(0);
                dateOB.setSelectedIndex(0);
                yearSD.setSelectedIndex(0);
                monthSD.setSelectedIndex(0);
                dateSD.setSelectedIndex(0);
                departmentText.setSelectedIndex(0);
                departmentText.setSelectedIndex(-1);
                positionText.setSelectedIndex(-1);
                eduLevelText.setSelectedIndex(-1);
                profLevelText.setSelectedIndex(-1);
                employeeTypeText.setSelectedIndex(-1);
                dateOB.setSelectedIndex(-1);
                monthOB.setSelectedIndex(-1);
                yearOB.setSelectedIndex(-1);
                dateSD.setSelectedIndex(-1);
                monthSD.setSelectedIndex(-1);
                yearSD.setSelectedIndex(-1);
        }

        public EmployeeRegistration() {
                JPanel panel = new JPanel();
                panel.setLayout(null);
                panel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
                panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                                "REGISTER EMPLOYEE", 0, 0, new Font("Times New Roman", Font.PLAIN, 20), Color.BLUE));
                panel.setBackground(Color.WHITE);

                fNameLabel = new JLabel("First Name");
                fNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                fNameLabel.setSize(100, 20);
                fNameLabel.setLocation(30, 100);
                panel.add(fNameLabel);

                fNameText = new JTextField();
                fNameText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                fNameText.setSize(200, 20);
                fNameText.setLocation(140, 100);
                panel.add(fNameText);

                lNameLabel = new JLabel("Last Name");
                lNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                lNameLabel.setSize(100, 20);
                lNameLabel.setLocation(400, 100);
                panel.add(lNameLabel);

                lNameText = new JTextField();
                lNameText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                lNameText.setSize(200, 20);
                lNameText.setLocation(510, 100);
                panel.add(lNameText);

                addressLabel = new JLabel("Address");
                addressLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                addressLabel.setSize(100, 20);
                addressLabel.setLocation(30, 140);
                panel.add(addressLabel);

                addressText = new JTextField();
                addressText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                addressText.setSize(200, 20);
                addressText.setLocation(140, 140);
                panel.add(addressText);

                contactLabel = new JLabel("Contact");
                contactLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                contactLabel.setSize(100, 20);
                contactLabel.setLocation(400, 140);
                panel.add(contactLabel);

                contactText = new JTextField();
                contactText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                contactText.setSize(200, 20);
                contactText.setLocation(510, 140);
                panel.add(contactText);

                // SALARY
                salaryLabel = new JLabel("Salary");
                salaryLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                salaryLabel.setSize(100, 20);
                salaryLabel.setLocation(30, 180);
                panel.add(salaryLabel);

                salaryText = new JTextField();
                salaryText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                salaryText.setSize(200, 20);
                salaryText.setLocation(140, 180);
                panel.add(salaryText);

                employeeTypeLabel = new JLabel("Employee Type");
                employeeTypeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                employeeTypeLabel.setSize(100, 20);
                employeeTypeLabel.setLocation(400, 180);
                panel.add(employeeTypeLabel);

                employeeTypeText = new JComboBox<Employee.EmployeeType>(empTypes);
                employeeTypeText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // employeeTypeText.setSelectedIndex(-1);
                employeeTypeText.setSize(170, 20);
                employeeTypeText.setLocation(510, 180);
                panel.add(employeeTypeText);

                // DEPARTMENT
                departmentLabel = new JLabel("Department");
                departmentLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                departmentLabel.setSize(100, 20);
                departmentLabel.setLocation(30, 220);
                panel.add(departmentLabel);

                departmentText = new JComboBox<String>(departments);
                departmentText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // departmentText.setSelectedIndex(-1);
                departmentText.setSize(170, 20);
                departmentText.setLocation(140, 220);
                panel.add(departmentText);

                // LEVEL
                profLevelLabel = new JLabel("Professional Level");
                profLevelLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                profLevelLabel.setSize(100, 20);
                profLevelLabel.setLocation(400, 220);
                panel.add(profLevelLabel);

                profLevelText = new JComboBox<Employee.Level>(profLevels);
                profLevelText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // profLevelText.setSelectedIndex(-1);
                profLevelText.setSize(170, 20);
                profLevelText.setLocation(510, 220);
                panel.add(profLevelText);

                // DATE OF BIRTH
                dateOfBirthLabel = new JLabel("Date of Birth");
                dateOfBirthLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                dateOfBirthLabel.setSize(100, 20);
                dateOfBirthLabel.setLocation(30, 260);
                panel.add(dateOfBirthLabel);

                dateOB = new JComboBox<String>(dates);
                dateOB.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // dateOB.setSelectedIndex(-1);
                dateOB.setSize(45, 20);
                dateOB.setLocation(140, 260);
                panel.add(dateOB);

                monthOB = new JComboBox<String>(months);
                monthOB.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // monthOB.setSelectedIndex(-1);
                monthOB.setSize(45, 20);
                monthOB.setLocation(195, 260);
                panel.add(monthOB);

                yearOB = new JComboBox<String>(years);
                yearOB.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // yearOB.setSelectedIndex(-1);
                yearOB.setSize(60, 20);
                yearOB.setLocation(250, 260);
                panel.add(yearOB);

                // DATE STARTED
                dateStartedLabel = new JLabel("Date started");
                dateStartedLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                dateStartedLabel.setSize(100, 20);
                dateStartedLabel.setLocation(400, 260);
                panel.add(dateStartedLabel);

                dateSD = new JComboBox<String>(dates);
                dateSD.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // dateSD.setSelectedIndex(-1);
                dateSD.setSize(45, 20);
                dateSD.setLocation(510, 260);
                panel.add(dateSD);

                monthSD = new JComboBox<String>(months);
                monthSD.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // monthSD.setSelectedIndex(-1);
                monthSD.setSize(45, 20);
                monthSD.setLocation(565, 260);
                panel.add(monthSD);

                yearSD = new JComboBox<String>(years);
                yearSD.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // yearSD.setSelectedIndex(-1);
                yearSD.setSize(60, 20);
                yearSD.setLocation(620, 260);
                panel.add(yearSD);

                // GENDER
                genderLabel = new JLabel("Gender");
                genderLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                genderLabel.setSize(100, 20);
                genderLabel.setLocation(30, 300);
                panel.add(genderLabel);

                male = new JRadioButton("Male");
                male.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // male.setSelected(false);
                male.setSize(75, 20);
                male.setLocation(140, 300);
                panel.add(male);

                female = new JRadioButton("Female");
                female.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // female.setSelected(false);
                female.setSize(80, 20);
                female.setLocation(230, 300);
                panel.add(female);

                genderGroup = new ButtonGroup();
                genderGroup.add(male);
                genderGroup.add(female);

                // MARITAL STATUS
                maritalLabel = new JLabel("Marital Status");
                maritalLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                maritalLabel.setSize(100, 20);
                maritalLabel.setLocation(400, 300);
                panel.add(maritalLabel);

                single = new JRadioButton("Single");
                single.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // single.setSelected(false);
                single.setSize(75, 20);
                single.setLocation(510, 300);
                panel.add(single);

                married = new JRadioButton("Married");
                married.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                // married.setSelected(false);
                married.setSize(80, 20);
                married.setLocation(600, 300);
                panel.add(married);

                maritalGroup = new ButtonGroup();
                maritalGroup.add(single);
                maritalGroup.add(married);

                // POSITION
                positionLabel = new JLabel("Position");
                positionLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                positionLabel.setSize(100, 20);
                positionLabel.setLocation(30, 340);
                panel.add(positionLabel);

                // assign positionText to new JComboBox with the Employee.positions
                // linkedHashMap as the parameter
                positionText = new JComboBox<String>(positions);
                // positionText.setSelectedIndex(-1);
                positionText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                positionText.setSize(170, 20);
                positionText.setLocation(140, 340);
                panel.add(positionText);

                // EDUCATION LEVEL
                eduLevelLabel = new JLabel("Education");
                eduLevelLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
                eduLevelLabel.setSize(100, 20);
                eduLevelLabel.setLocation(400, 340);
                panel.add(eduLevelLabel);

                eduLevelText = new JComboBox<Employee.EducationLevel>(eduLevels);
                eduLevelText.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                eduLevelText.setSize(170, 20);
                // eduLevelText.setSelectedIndex(-1);
                eduLevelText.setLocation(510, 340);
                panel.add(eduLevelText);

                // SUBMIT & RESET BUTTONS
                submit = new JButton("Submit");
                submit.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                submit.setSize(100, 20);
                submit.setLocation(140, 450);
                submit.setBackground(Color.GREEN);
                submit.addActionListener(this);
                panel.add(submit);

                reset = new JButton("Reset");
                reset.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                reset.setSize(100, 20);
                reset.setLocation(510, 450);
                reset.setBackground(Color.YELLOW);
                reset.addActionListener(this);
                panel.add(reset);

                // add a button to the panel
                buttonNew = new JButton("Show Stats");
                buttonNew.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                buttonNew.setSize(100, 20);
                buttonNew.setLocation(510, 500);
                buttonNew.setBackground(Color.BLUE);
                buttonNew.setForeground(Color.WHITE);
                buttonNew.addActionListener(this);
                panel.add(buttonNew);

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(300, 90, 770, 600);
                setResizable(false);
                setSize(770, 600);
                add(panel);
                setVisible(true);
                EmployeeDatabase dbs = new EmployeeDatabase();

		// ADMINISTRATIVE
		dbs.createEmployee("1",
				new Employee("1", Employee.EmployeeType.PERMANENT, "John", "Smith", Employee.Gender.MALE, "0799522433",
						"123 Main St",
						Employee.Level.CSUITE,
						LocalDate.of(2012, 1, 1), LocalDate.of(1959, 1, 1), Employee.EducationLevel.PHD, 10000.00,
						Employee.MaritalStatus.MARRIED, Employee.departments.get("6"), Employee.positions.get("0")));

		dbs.createEmployee("2",
				new Employee("2", Employee.EmployeeType.PERMANENT,
						"Jane", "Doe", Employee.Gender.FEMALE, "0786662454", "123 Main St",
						Employee.Level.OFFICER,
						LocalDate.of(2014, 1, 1), LocalDate.of(1978, 1, 1), Employee.EducationLevel.BACHELORS, 1000.00,
						Employee.MaritalStatus.DIVORCED, Employee.departments.get("6"), Employee.positions.get("16")));

		// DIRECTORS
		dbs.createEmployee("3",
				new Employee("3", Employee.EmployeeType.PERMANENT,
						"Tim", "Howard", Employee.Gender.MALE, "0785552588", "04 St",
						Employee.Level.DIRECTOR,
						LocalDate.of(2015, 1, 1), LocalDate.of(1965, 1, 1), Employee.EducationLevel.MASTERS, 6000.00,
						Employee.MaritalStatus.SINGLE, Employee.departments.get("2"), Employee.positions.get("1")));

		dbs.createEmployee("4",
				new Employee("4", Employee.EmployeeType.PERMANENT,
						"Joe", "Emmanuel", Employee.Gender.MALE, "07855452588", "03 St",
						Employee.Level.DIRECTOR,
						LocalDate.of(2015, 1, 1), LocalDate.of(1968, 1, 1), Employee.EducationLevel.MASTERS,
						6000.00,
						Employee.MaritalStatus.MARRIED, Employee.departments.get("2"), Employee.positions.get("2")));

		dbs.createEmployee("5",
				new Employee("5", Employee.EmployeeType.PERMANENT,
						"Mary", "Kellen", Employee.Gender.FEMALE, "0785552588", "07 St",
						Employee.Level.DIRECTOR,
						LocalDate.of(2015, 1, 1), LocalDate.of(1964, 1, 1), Employee.EducationLevel.PHD,
						6000.00,
						Employee.MaritalStatus.MARRIED, Employee.departments.get("3"), Employee.positions.get("3")));

		dbs.createEmployee("6",
				new Employee("6", Employee.EmployeeType.PERMANENT,
						"Moses", "Huddlestone", Employee.Gender.MALE, "0785552588", "04 St",
						Employee.Level.DIRECTOR,
						LocalDate.of(2015, 1, 1), LocalDate.of(1970, 1, 1), Employee.EducationLevel.BACHELORS,
						6000.00,
						Employee.MaritalStatus.MARRIED, Employee.departments.get("4"), Employee.positions.get("4")));

		dbs.createEmployee("7",
				new Employee("7", Employee.EmployeeType.PERMANENT,
						"Janet", "Barry", Employee.Gender.FEMALE, "0784552588", "45 St",
						Employee.Level.DIRECTOR,
						LocalDate.of(2018, 1, 1), LocalDate.of(1995, 1, 1), Employee.EducationLevel.MASTERS,
						6000.00,
						Employee.MaritalStatus.SINGLE, Employee.departments.get("5"), Employee.positions.get("5")));

		// MANAGERS
		dbs.createEmployee("8",
				new Employee("8", Employee.EmployeeType.PERMANENT,
						"Anthony", "James", Employee.Gender.MALE, "0785552588", "78 St",
						Employee.Level.MANAGER,
						LocalDate.of(2017, 1, 1), LocalDate.of(1963, 1, 1), Employee.EducationLevel.BACHELORS,
						4000.00,
						Employee.MaritalStatus.MARRIED, Employee.departments.get("1"), Employee.positions.get("6")));

		dbs.createEmployee("9",
				new Employee("9", Employee.EmployeeType.PERMANENT,
						"Julia", "Jones", Employee.Gender.FEMALE, "0786352588", "36 St",
						Employee.Level.MANAGER,
						LocalDate.of(2015, 1, 1), LocalDate.of(1975, 1, 1), Employee.EducationLevel.BACHELORS,
						4000.00,
						Employee.MaritalStatus.MARRIED, Employee.departments.get("2"), Employee.positions.get("7")));

		dbs.createEmployee("10",
				new Employee("10", Employee.EmployeeType.PERMANENT,
						"Thomas", "Raphael", Employee.Gender.MALE, "0785552588", "04 St",
						Employee.Level.MANAGER,
						LocalDate.of(2015, 1, 1), LocalDate.of(1979, 1, 1), Employee.EducationLevel.MASTERS,
						4000.00,
						Employee.MaritalStatus.SINGLE, Employee.departments.get("3"), Employee.positions.get("8")));

		dbs.createEmployee("11",
				new Employee("11", Employee.EmployeeType.PERMANENT,
						"Emmanuel", "George", Employee.Gender.MALE, "078362588", "36 St",
						Employee.Level.MANAGER,
						LocalDate.of(2016, 1, 1), LocalDate.of(1980, 1, 1), Employee.EducationLevel.MASTERS,
						4000.00,
						Employee.MaritalStatus.MARRIED, Employee.departments.get("4"), Employee.positions.get("9")));

		dbs.createEmployee("12",
				new Employee("12", Employee.EmployeeType.PERMANENT,
						"Alice", "Jones", Employee.Gender.FEMALE, "0785552028", "45 St",
						Employee.Level.MANAGER,
						LocalDate.of(2017, 1, 1), LocalDate.of(1982, 1, 1), Employee.EducationLevel.PHD,
						4000.00,
						Employee.MaritalStatus.SINGLE, Employee.departments.get("5"), Employee.positions.get("10")));

		// OFFICERS
		dbs.createEmployee("13",
				new Employee("13", Employee.EmployeeType.PERMANENT,
						"Carine", "Annan", Employee.Gender.FEMALE, "0785552588", "32 St",
						Employee.Level.OFFICER,
						LocalDate.of(2019, 1, 1), LocalDate.of(1989, 1, 1), Employee.EducationLevel.HIGH_SCHOOL,
						1000.00,
						Employee.MaritalStatus.SINGLE, Employee.departments.get("1"), Employee.positions.get("11")));

		dbs.createEmployee("14",
				new Employee("14", Employee.EmployeeType.PERMANENT,
						"Kim", "Joe", Employee.Gender.FEMALE, "0787752588", "04 St",
						Employee.Level.OFFICER,
						LocalDate.of(2017, 1, 1), LocalDate.of(1980, 1, 1), Employee.EducationLevel.MASTERS, 1000.00,
						Employee.MaritalStatus.MARRIED, Employee.departments.get("2"), Employee.positions.get("12")));

		dbs.createEmployee("15",
				new Employee("15", Employee.EmployeeType.PERMANENT,
						"Marina", "Cole", Employee.Gender.FEMALE, "078566588", "04 St",
						Employee.Level.OFFICER,
						LocalDate.of(2015, 1, 1), LocalDate.of(1993, 1, 1), Employee.EducationLevel.HIGH_SCHOOL,
						1000.00,
						Employee.MaritalStatus.SINGLE, Employee.departments.get("3"), Employee.positions.get("13")));

		dbs.createEmployee("16",
				new Employee("16", Employee.EmployeeType.PERMANENT,
						"Joyce", "Kimanyi", Employee.Gender.FEMALE, "078566588", "04 St",
						Employee.Level.OFFICER,
						LocalDate.of(2015, 1, 1), LocalDate.of(2000, 1, 1), Employee.EducationLevel.HIGH_SCHOOL,
						1000.00,
						Employee.MaritalStatus.SINGLE, Employee.departments.get("4"), Employee.positions.get("14")));

		dbs.createEmployee("17",
				new Employee("17", Employee.EmployeeType.PERMANENT,
						"Cathy", "Jones", Employee.Gender.FEMALE, "078566588", "04 St",
						Employee.Level.OFFICER,
						LocalDate.of(2015, 1, 1), LocalDate.of(1998, 1, 1), Employee.EducationLevel.HIGH_SCHOOL,
						1000.00,
						Employee.MaritalStatus.SINGLE, Employee.departments.get("5"), Employee.positions.get("15")));

		// INTERNS
		dbs.createEmployee("18",
				new Employee("18", Employee.EmployeeType.INTERN,
						"Bayley", "Iglesias", Employee.Gender.FEMALE, "0785099588", "78 St",
						Employee.Level.OFFICER,
						LocalDate.of(2021, 1, 1), LocalDate.of(1997, 1, 1), Employee.EducationLevel.HIGH_SCHOOL,
						300.00,
						Employee.MaritalStatus.SINGLE, Employee.departments.get("1"), Employee.positions.get("11")));

		dbs.createEmployee("19",
				new Employee("19", Employee.EmployeeType.INTERN,
						"Christian", "Kingsley", Employee.Gender.MALE, "0785553365", "74 St",
						Employee.Level.OFFICER,
						LocalDate.of(2022, 1, 1), LocalDate.of(1999, 1, 1), Employee.EducationLevel.HIGH_SCHOOL,
						300.00,
						Employee.MaritalStatus.SINGLE, Employee.departments.get("2"), Employee.positions.get("12")));

		// CONTRACTUAL
		dbs.createEmployee("20",
				new Employee("20", Employee.EmployeeType.CONTRACT,
						"Allan", "Smith", Employee.Gender.MALE, "078005566", "85 St",
						Employee.Level.OFFICER,
						LocalDate.of(2021, 1, 1), LocalDate.of(1997, 1, 1), Employee.EducationLevel.BACHELORS,
						70000.00,
						Employee.MaritalStatus.MARRIED, Employee.departments.get("3"), Employee.positions.get("13")));

		dbs.createEmployee("21",
				new Employee("21", Employee.EmployeeType.CONTRACT,
						"Jane", "Cohen", Employee.Gender.FEMALE, "078566588", "04 St",
						Employee.Level.OFFICER,
						LocalDate.of(2018, 1, 1), LocalDate.of(1980, 1, 1), Employee.EducationLevel.BACHELORS,
						70000.00,
						Employee.MaritalStatus.SINGLE, Employee.departments.get("4"), Employee.positions.get("14")));

		dbs.createEmployee("22",
				new Employee("22", Employee.EmployeeType.CONTRACT,
						"Mason", "Terry", Employee.Gender.MALE, "078566588", "84 St",
						Employee.Level.OFFICER,
						LocalDate.of(2015, 1, 1), LocalDate.of(1968, 1, 1), Employee.EducationLevel.MASTERS,
						270000.00,
						Employee.MaritalStatus.DIVORCED, Employee.departments.get("5"), Employee.positions.get("15")));

		// dbs.createEmployee("1", employee1);
		// dbs.createEmployee("2", employee2);
	
        }

        @Override
        public void actionPerformed(ActionEvent e) {

                if (e.getSource() == submit) {
                        // get department key from departmentText
                        for (String key : Employee.departments.keySet())
                                if (Employee.departments.get(key).equals(departmentText.getSelectedItem()))
                                        selectedDepartment = key;

                        for (String key : Employee.positions.keySet())
                                if (Employee.positions.get(key).equals(positionText.getSelectedItem()))
                                        selectedPosition = key;

                        // CREATE A NEW EMPLOYEE WITH THE DATA ENTERED
                        // check if all fields are filled
                        if (fNameText.getText().equals("") || lNameText.getText().equals("")
                                        || contactText.getText().equals("")
                                        || addressText.getText().equals("")
                                        || employeeTypeText.getSelectedItem().equals("")
                                        || profLevelText.getSelectedItem().equals("")
                                        || yearSD.getSelectedItem().equals("") || monthSD.getSelectedItem().equals("")
                                        || dateSD.getSelectedItem().equals("") || yearOB.getSelectedItem().equals("")
                                        || monthOB.getSelectedItem().equals("") || dateOB.getSelectedItem().equals("")
                                        || departmentText.getSelectedItem().equals("")
                                        || positionText.getSelectedItem().equals("")
                                        || eduLevelText.getSelectedItem().equals("")) {
                                JOptionPane.showMessageDialog(this, "Please fill all the fields");

                        } else {
                                // create a new employee
                                Employee newEmployee = new Employee(
                                                Integer.toString(db.getLargestEmployeeId() + 1),
                                                Employee.EmployeeType
                                                                .valueOf(employeeTypeText.getSelectedItem().toString()),
                                                fNameText.getText(),
                                                lNameText.getText(),
                                                male.isSelected() ? Employee.Gender.MALE : Employee.Gender.FEMALE,
                                                contactText.getText(),
                                                addressText.getText(),
                                                Employee.Level.valueOf(profLevelText.getSelectedItem().toString()),
                                                LocalDate.of(Integer.parseInt(yearSD.getSelectedItem().toString()),
                                                                Integer.parseInt(monthSD.getSelectedItem().toString()),
                                                                Integer.parseInt(dateSD.getSelectedItem().toString())),
                                                LocalDate.of(Integer.parseInt(yearOB.getSelectedItem().toString()),
                                                                Integer.parseInt(monthOB.getSelectedItem().toString()),
                                                                Integer.parseInt(dateOB.getSelectedItem().toString())),
                                                Employee.EducationLevel
                                                                .valueOf(eduLevelText.getSelectedItem().toString()),
                                                salaryText.getText().trim().isEmpty() ? 0.0
                                                                : Double.parseDouble(salaryText.getText()),
                                                single.isSelected() ? Employee.MaritalStatus.SINGLE
                                                                : Employee.MaritalStatus.MARRIED,
                                                Employee.departments.get(selectedDepartment),
                                                Employee.positions.get(selectedPosition));

                                // CREATING A NEW EMPLOYEE IN THE DATABASE
                                db.createEmployee(Integer.toString(db.getLargestEmployeeId() + 1), newEmployee);
                                System.out.println(db.getEmployeeNames());
                                JOptionPane.showMessageDialog(this, "Employee succesfully registered");
                                
                                
                                // clear the form after submission
                                resetForm();
                        }

                } else if (e.getSource() == reset) {
                        resetForm();
                }

                else if (e.getSource() == buttonNew) {
                        dispose();
                        new DisplayDepartmentStats().setVisible(true);
                }
        }
}
