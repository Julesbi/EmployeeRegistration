// import jframe, jlabel, jtextarea, flowlayout
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.*;

public class DisplayEmployee extends JFrame implements ActionListener {
    private JButton back = new JButton("Back");
    private JPanel panel = new JPanel();

    // constructor
    public DisplayEmployee() 
    {

        // create a GUI frame to display employeeInfo()
        
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        // create a text area to display employeeInfo()
        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 50, 900, 300);
        textArea.setEditable(false);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));


        //get employee info from EmployeeDatabase
        ArrayList<String> employeeInfo = EmployeeDatabase.getEmployees();

        // display employee info in textArea
        for (int i = 0; i < employeeInfo.size(); i++) 
        {
            textArea.append(employeeInfo.get(i));
        }

       
        // // create a panel to display textArea
        
        panel.add(textArea);
        panel.setBounds(0, 0, 750, 500);
        panel.setLayout(null);
        panel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                "EMPLOYEE INFO", 0, 0, new Font("Times New Roman", Font.PLAIN, 20), Color.BLUE));
        panel.setBackground(Color.WHITE);

        // add the panel to the frame

        // add a back button
        back.setSize(100,30);
        back.setLocation(100,410);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLUE);
        back.addActionListener(this);
        panel.add(back);
        add(panel);
        
        
        // set the frame to exit when closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back ){
            dispose();
            new WelcomePage().setVisible(true);
    }
}
}
