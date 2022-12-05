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
        private JLabel employeeIdLabel;
        private JTextField employeeIdText;
        private JLabel departmentLabel;
        private JComboBox<String> departmentText;
        private JLabel positionLabel;
        private JComboBox<String> positionText;
        private JLabel profLevelLabel;
        private JComboBox<Employee.Level> profLevelText;

        private JLabel eduLevelLabel;
        private JComboBox<Employee.EducationLevel> eduLevelText;

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
        private ButtonGroup gendeGroup;
        private JButton submit;
        private JButton reset;

        String dates[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15",
                        "16",
                        "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String months[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
        String years[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
                        "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
                        "2018", "2019" };

        String departments[] = Employee.departments.values().toArray(new String[0]);
        String positions[] = Employee.positions.values().toArray(new String[0]);
        Employee.Level profLevels[] = Employee.Level.values();
        Employee.EducationLevel eduLevels[] = Employee.EducationLevel.values();
        String selectedDepartment, selectedPosition;

        public EmployeeRegistration() {
                JPanel panel = new JPanel();
                panel.setLayout(null);
                panel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
                panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                                "REGISTER EMPLOYEE", 0, 0, new Font("Times New Roman", Font.PLAIN, 20), Color.BLUE));

                panel.setBackground(Color.WHITE);
                fNameLabel = new JLabel("First Name");
                fNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                fNameLabel.setSize(100, 20);
                fNameLabel.setLocation(30, 100);
                panel.add(fNameLabel);

                fNameText = new JTextField();
                fNameText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                fNameText.setSize(200, 20);
                fNameText.setLocation(140, 100);
                panel.add(fNameText);

                lNameLabel = new JLabel("Last Name");
                lNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                lNameLabel.setSize(100, 20);
                lNameLabel.setLocation(400, 100);
                panel.add(lNameLabel);

                lNameText = new JTextField();
                lNameText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                lNameText.setSize(200, 20);
                lNameText.setLocation(510, 100);
                panel.add(lNameText);

                addressLabel = new JLabel("Address");
                addressLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                addressLabel.setSize(100, 20);
                addressLabel.setLocation(30, 140);
                panel.add(addressLabel);

                addressText = new JTextField();
                addressText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                addressText.setSize(200, 20);
                addressText.setLocation(140, 140);
                panel.add(addressText);

                contactLabel = new JLabel("Contact");
                contactLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                contactLabel.setSize(100, 20);
                contactLabel.setLocation(400, 140);
                panel.add(contactLabel);

                contactText = new JTextField();
                contactText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                contactText.setSize(200, 20);
                contactText.setLocation(510, 140);
                panel.add(contactText);

                // SALARY
                salaryLabel = new JLabel("Salary");
                salaryLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                salaryLabel.setSize(100, 20);
                salaryLabel.setLocation(30, 180);
                panel.add(salaryLabel);

                salaryText = new JTextField();
                salaryText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                salaryText.setSize(200, 20);
                salaryText.setLocation(140, 180);
                panel.add(salaryText);

                employeeIdLabel = new JLabel("EmployeeID");
                employeeIdLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                employeeIdLabel.setSize(100, 20);
                employeeIdLabel.setLocation(400, 180);
                panel.add(employeeIdLabel);

                employeeIdText = new JTextField();
                employeeIdText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                employeeIdText.setSize(200, 20);
                employeeIdText.setLocation(510, 180);
                panel.add(employeeIdText);

                // DEPARTMENT
                departmentLabel = new JLabel("Department");
                departmentLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                departmentLabel.setSize(100, 20);
                departmentLabel.setLocation(30, 220);
                panel.add(departmentLabel);

                departmentText = new JComboBox<String>(departments);
                departmentText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                departmentText.setSize(170, 20);
                departmentText.setLocation(140, 220);
                panel.add(departmentText);

                // LEVEL
                profLevelLabel = new JLabel("Professional Level");
                profLevelLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                profLevelLabel.setSize(100, 20);
                profLevelLabel.setLocation(400, 220);
                panel.add(profLevelLabel);

                profLevelText = new JComboBox<Employee.Level>(profLevels);
                profLevelText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                profLevelText.setSize(170, 20);
                profLevelText.setLocation(510, 220);
                panel.add(profLevelText);

                // DATE OF BIRTH
                dateOfBirthLabel = new JLabel("Date of Birth");
                dateOfBirthLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                dateOfBirthLabel.setSize(100, 20);
                dateOfBirthLabel.setLocation(30, 260);
                panel.add(dateOfBirthLabel);

                dateOB = new JComboBox<String>(dates);
                dateOB.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                dateOB.setSize(45, 20);
                dateOB.setLocation(140, 260);
                panel.add(dateOB);

                monthOB = new JComboBox<String>(months);
                monthOB.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                monthOB.setSize(45, 20);
                monthOB.setLocation(195, 260);
                panel.add(monthOB);

                yearOB = new JComboBox<String>(years);
                yearOB.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                yearOB.setSize(60, 20);
                yearOB.setLocation(250, 260);
                panel.add(yearOB);

                // DATE STARTED
                dateStartedLabel = new JLabel("Date started");
                dateStartedLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                dateStartedLabel.setSize(100, 20);
                dateStartedLabel.setLocation(400, 260);
                panel.add(dateStartedLabel);

                dateSD = new JComboBox<String>(dates);
                dateSD.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                dateSD.setSize(45, 20);
                dateSD.setLocation(510, 260);
                panel.add(dateSD);

                monthSD = new JComboBox<String>(months);
                monthSD.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                monthSD.setSize(45, 20);
                monthSD.setLocation(565, 260);
                panel.add(monthSD);

                yearSD = new JComboBox<String>(years);
                yearSD.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                yearSD.setSize(60, 20);
                yearSD.setLocation(620, 260);
                panel.add(yearSD);

                // GENDER
                genderLabel = new JLabel("Gender");
                genderLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                genderLabel.setSize(100, 20);
                genderLabel.setLocation(30, 300);
                panel.add(genderLabel);

                male = new JRadioButton("Male");
                male.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                male.setSelected(true);
                male.setSize(75, 20);
                male.setLocation(140, 300);
                panel.add(male);

                female = new JRadioButton("Female");
                female.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                female.setSelected(false);
                female.setSize(80, 20);
                female.setLocation(230, 300);
                panel.add(female);

                gendeGroup = new ButtonGroup();
                gendeGroup.add(male);
                gendeGroup.add(female);

                // MARITAL STATUS
                maritalLabel = new JLabel("Marital Status");
                maritalLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                maritalLabel.setSize(100, 20);
                maritalLabel.setLocation(400, 300);
                panel.add(maritalLabel);

                single = new JRadioButton("Single");
                single.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                single.setSelected(true);
                single.setSize(75, 20);
                single.setLocation(510, 300);
                panel.add(single);

                married = new JRadioButton("Married");
                married.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                married.setSelected(false);
                married.setSize(80, 20);
                married.setLocation(600, 300);
                panel.add(married);

                // POSITION
                positionLabel = new JLabel("Position");
                positionLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                positionLabel.setSize(100, 20);
                positionLabel.setLocation(30, 340);
                panel.add(positionLabel);

                // assign positionText to new JComboBox with the Employee.positions
                // linkedHashMap as the parameter
                positionText = new JComboBox<String>(positions);
                positionText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                positionText.setSize(170, 20);
                positionText.setLocation(140, 340);
                panel.add(positionText);

                // EDUCATION LEVEL
                eduLevelLabel = new JLabel("Education");
                eduLevelLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
                eduLevelLabel.setSize(100, 20);
                eduLevelLabel.setLocation(400, 340);
                panel.add(eduLevelLabel);

                eduLevelText = new JComboBox<Employee.EducationLevel>(eduLevels);
                eduLevelText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                eduLevelText.setSize(170, 20);
                eduLevelText.setLocation(510, 340);
                panel.add(eduLevelText);

                // SUBMIT & RESET BUTTONS
                submit = new JButton("Submit");
                submit.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                submit.setSize(100, 20);
                submit.setLocation(140, 450);
                submit.setBackground(Color.GREEN);
                submit.addActionListener(this);
                panel.add(submit);

                reset = new JButton("Reset");
                reset.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                reset.setSize(100, 20);
                reset.setLocation(510, 450);
                reset.setBackground(Color.YELLOW);
                // reset.addActionListener(this);
                panel.add(reset);

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(300, 90, 770, 600);
                setResizable(false);
                setSize(770, 600);
                add(panel);
                setVisible(true);
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
                        Employee newEmployee = new Employee(
                                        Integer.toString(db.getLargestEmployeeId()),
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
                                        Employee.EducationLevel.valueOf(eduLevelText.getSelectedItem().toString()),
                                        salaryText.getText().trim().isEmpty() ? 0.0
                                                        : Double.parseDouble(salaryText.getText()),
                                        single.isSelected() ? Employee.MaritalStatus.SINGLE
                                                        : Employee.MaritalStatus.MARRIED,
                                        Employee.departments.get(selectedDepartment),
                                        Employee.positions.get(selectedPosition));

                        db.createEmployee(Integer.toString(db.getLargestEmployeeId() + 1), newEmployee);
                        System.out.println(db.getEmployeeNames());
                }
        }
}
