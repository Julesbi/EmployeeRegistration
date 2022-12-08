import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WelcomePage extends JFrame implements ActionListener  {
    private JLabel welcome;
    private JLabel register;
    private JButton registerButton;
    private JLabel stats;
    private JButton viewStats;

    DisplayEmployee dispPage;

    public WelcomePage(){
    JPanel page = new JPanel();
    page.setLayout(null);
    page.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    page.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
                        "Welcome Page", 0, 0, new Font("Times New Roman", Font.PLAIN, 20), Color.BLUE));
    page.setBackground(Color.WHITE);

    
    
    welcome = new JLabel("Welcome");
    welcome.setFont(new Font("Lucida Bright",Font.PLAIN, 17));
    welcome.setSize(450, 20);
    welcome.setLocation(150, 100);
    page.add(welcome);

    register = new JLabel("Want to register a new Employee?");
    register.setFont(new Font("Big Caslon",Font.PLAIN, 17));
    register.setSize(450, 20);
    register.setLocation(80, 150);
    page.add(register);

    registerButton = new JButton("Register");
    registerButton.setFont(new Font("Big Caslon", Font.CENTER_BASELINE, 15));
    registerButton.setSize(100, 30);
    registerButton.setLocation(150, 200);
    registerButton.setBackground(Color.BLUE);
    registerButton.setForeground(Color.WHITE);
    registerButton.addActionListener(this);
    page.add(registerButton);

    stats = new JLabel("Or viewing employees' stats?");
    stats.setFont(new Font("Lucida Bright",Font.PLAIN, 17));
    stats.setSize(450, 20);
    stats.setLocation(80, 250);
    page.add(stats);

    viewStats= new JButton("Stats");
    viewStats.setFont(new Font("Big Caslon", Font.CENTER_BASELINE, 15));
    viewStats.setSize(100, 30);
    viewStats.setLocation(150, 300);
    viewStats.setBackground(Color.BLUE);
    viewStats.setForeground(Color.WHITE);
    viewStats.addActionListener(this);
    page.add(viewStats);
    
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setSize(500, 500);
    add(page);
    setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == registerButton){
            EmployeeRegistration registerEmployee = new EmployeeRegistration();
            setVisible(false);
            registerEmployee.setVisible(true);
        }
        else if(e.getSource() == viewStats){
            dispose();
            new DisplayEmployee().setVisible(true);
        }
    }
    }
