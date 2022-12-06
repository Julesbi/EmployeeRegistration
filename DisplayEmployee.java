// import jframe, jlabel, jtextarea, flowlayout
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.util.ArrayList;

public class DisplayEmployee {

    // constructor
    public DisplayEmployee() 
    {
        System.out.println(EmployeeDatabase.getNumberOfEmployees());
        // create a GUI frame to display employeeInfo()
        JFrame frame = new JFrame("Employee Info");
        frame.setSize(900, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        
        // create a text area to display employeeInfo()
        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 50, 900, 500);
        textArea.setEditable(false);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));

        // System.out.println(getNumberOfEmployees());
        //get employee info from EmployeeDatabase
        ArrayList<String> employeeInfo = EmployeeDatabase.getEmployees();
        System.out.println(employeeInfo);

        // display employee info in textArea
        for (int i = 0; i < employeeInfo.size(); i++) 
        {
            textArea.append(employeeInfo.get(i));
        }
         

       
        // // create a panel to display textArea
        JPanel panel = new JPanel();
        panel.add(textArea);
        panel.setBounds(0, 0, 900, 500);
        panel.setLayout(null);
        panel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "EMPLOYEE INFO", 0, 0, new Font("Times New Roman", Font.PLAIN, 20), Color.BLUE));
        panel.setBackground(Color.WHITE);

        // add the panel to the frame
        frame.add(panel);
        
        // set the frame to exit when closed
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

}
