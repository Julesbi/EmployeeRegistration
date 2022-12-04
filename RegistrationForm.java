import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

public class RegistrationForm extends JFrame implements ActionListener {
        // Bring up the employee database
        EmployeeDatabase db = new EmployeeDatabase();

        private JLabel fNameLabel;
        private JTextField fNameText;
        private JLabel lNameLabel;
        private JTextField lNameText;
        private JLabel gender;
        private JRadioButton male;
        private JRadioButton female;
        private ButtonGroup gendeGroup;
        private JLabel dateOfBirth;
        private JComboBox<String> date;
        private JComboBox<String> month;
        private JComboBox<String> year;
        private JLabel addressLabel;
        private JTextArea addressText;
        private JButton submit;
        private JButton reset;
        private JTextArea submittedData;

        String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                        "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

        String months[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };

        String years[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
                        "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
                        "2018", "2019" };

        // THE CONSTRUCTOR FOR THE FORM
        public RegistrationForm() {

                JPanel panel = new JPanel();
                panel.setLayout(null);
                panel.setFont(new Font("Times New Roman", Font.PLAIN, 30));

                // set the font name for all the elements of the panel
                panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                                "REGISTER EMPLOYEE", 0, 0, new Font("Times New Roman", Font.PLAIN, 20), Color.BLUE));
                panel.setBackground(Color.WHITE);

                fNameLabel = new JLabel("First Name");
                fNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                fNameLabel.setSize(100, 20);
                fNameLabel.setLocation(100, 100);
                panel.add(fNameLabel);

                fNameText = new JTextField();
                fNameText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                fNameText.setSize(200, 20);
                fNameText.setLocation(200, 100);
                panel.add(fNameText);

                lNameLabel = new JLabel("Last Name");
                lNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                lNameLabel.setSize(100, 20);
                lNameLabel.setLocation(100, 150);
                panel.add(lNameLabel);

                lNameText = new JTextField();
                lNameText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                lNameText.setSize(200, 20);
                lNameText.setLocation(200, 150);
                panel.add(lNameText);

                gender = new JLabel("Gender");
                gender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                gender.setSize(100, 20);
                gender.setLocation(100, 200);
                panel.add(gender);

                male = new JRadioButton("Male");
                male.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                male.setSelected(true);
                male.setSize(75, 20);
                male.setLocation(200, 200);
                panel.add(male);

                female = new JRadioButton("Female");
                female.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                female.setSelected(false);
                female.setSize(80, 20);
                female.setLocation(275, 200);
                panel.add(female);

                gendeGroup = new ButtonGroup();
                gendeGroup.add(male);
                gendeGroup.add(female);

                dateOfBirth = new JLabel("Date of Birth");
                dateOfBirth.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                dateOfBirth.setSize(100, 20);
                dateOfBirth.setLocation(100, 250);
                panel.add(dateOfBirth);

                date = new JComboBox<String>(dates);
                date.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                date.setSize(50, 20);
                date.setLocation(200, 250);
                panel.add(date);

                month = new JComboBox<String>(months);
                month.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                month.setSize(60, 20);
                month.setLocation(270, 250);
                panel.add(month);

                year = new JComboBox<String>(years);
                year.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                year.setSize(60, 20);
                year.setLocation(350, 250);
                panel.add(year);

                addressLabel = new JLabel("Address");
                addressLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                addressLabel.setSize(100, 20);
                addressLabel.setLocation(100, 300);
                panel.add(addressLabel);

                addressText = new JTextArea();
                addressText.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                addressText.setSize(220, 25);
                addressText.setLocation(200, 300);
                addressText.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 1, true));
                addressText.setLineWrap(true);
                panel.add(addressText);

                submit = new JButton("Submit");
                submit.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                submit.setSize(100, 20);
                submit.setLocation(150, 450);
                submit.setBackground(Color.GREEN);
                submit.addActionListener(this);
                panel.add(submit);

                reset = new JButton("Reset");
                reset.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                reset.setSize(100, 20);
                reset.setLocation(270, 450);
                reset.setBackground(Color.YELLOW);
                reset.addActionListener(this);
                panel.add(reset);

                submittedData = new JTextArea();
                submittedData.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                submittedData.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 1, true));
                submittedData.setSize(320, 80);
                submittedData.setLocation(100, 340);
                submittedData.setLineWrap(true);
                submittedData.setEditable(false);
                panel.add(submittedData);

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(300, 90, 1200, 600);
                setResizable(false);
                setSize(600, 600);
                add(panel);
                setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                // WHEN SUBMIT BUTTON IS CLICKED, DISPLAY THE DATA IN THE TEXT AREA
                // if (e.getSource() == submit) {
                // String data = "First Name : " + fNameText.getText();
                // submittedData.setText(data);
                // }

                if (e.getSource() == submit) {
                        Employee employee = new Employee();
                        String id = "06";
                        String firstName = "John";
                        String lastName = "Doe";
                        Employee.Gender gender = Employee.Gender.MALE;
                        String number = "0700000000";
                        String address = "Nairobi";
                        Employee.EducationLevel empEducationLevel = Employee.EducationLevel.BACHELORS;
                        Employee.MaritalStatus empMaritalStatus = Employee.MaritalStatus.MARRIED;
                        String empDepartment = Employee.departments.get("1");
                        Employee.Level empLevel = Employee.Level.MANAGER;
                        LocalDate dateStarted = LocalDate.now();
                        LocalDate dob = (LocalDate.of(2020, 05, 19));
                        double salary = 1000000.00;
                        String position = Employee.positions.get("7");

                        LocalDate dob1 = LocalDate.of(Integer.parseInt(year.getSelectedItem().toString()),
                                        Integer.parseInt(month.getSelectedItem().toString()),
                                        Integer.parseInt(date.getSelectedItem().toString()));

                        Employee newEmployee = new Employee(id,
                                        fNameText.getText(),
                                        lNameText.getText(),
                                        male.isSelected() ? Employee.Gender.MALE : Employee.Gender.FEMALE,
                                        number,
                                        addressText.getText(),
                                        empLevel,
                                        dateStarted,
                                        dob1,
                                        empEducationLevel, salary, empMaritalStatus, empDepartment, position);

                        db.createEmployee("05", employee);
                        db.createEmployee("06", newEmployee);
                        System.out.println(db.getEmployeeNames());
                }
        }
}
