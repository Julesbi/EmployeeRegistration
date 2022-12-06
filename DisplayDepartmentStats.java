import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayDepartmentStats extends JFrame implements ActionListener {

    public DisplayDepartmentStats() {

        super("Display Department Stats");
        setSize(400, 400);

        EmployeeDatabase dbs = new EmployeeDatabase();
        // dbs.getDepartmentListAndNumberOfEmployees();

        JPanel panel = new JPanel();

        JTextField textField = new JTextField();
        textField.setBounds(10, 10, 300, 40);
        textField.setEditable(false);
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        textField.setText("Number of Single employees: " + dbs.getNumberOfSingleEmployees());
        textField.setLocation(50, 50);

        // add the text area to the panel
        panel.add(textField);
        panel.setLayout(null);
        panel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "EMPLOYEE STATS", 0, 0, new Font("Times New Roman", Font.PLAIN, 20), Color.BLUE));
        panel.setBackground(Color.WHITE);

        // add the panel to the frame
        add(panel);

        // set the frame to exit when closed
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}