// import jframe, jlabel, jtextarea, flowlayout
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.FlowLayout;

public class DisplayEmployee extends EmployeeDatabase
{
    // Create a Graphical User Interface and display the employee details
    public static void main(String[] args) 
    {

        // Create a new JFrame container
        JFrame jfrm = new JFrame("Employee Details");
        // Specify FlowLayout for the layout manager
        jfrm.setLayout(new FlowLayout());
        // Give the frame an initial size
        jfrm.setSize(400, 400);
        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a label
        JLabel jlab = new JLabel(getEmployeeDetails());
        // Add the label to the content pane
        jfrm.add(jlab);
        // Display the frame
        jfrm.setVisible(true);
    }
     
    
}
