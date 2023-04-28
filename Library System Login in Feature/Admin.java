import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame{

    Admin(){

        setLayout(null);

        JLabel username = new JLabel("Your Name:");
        username.setBounds(100,50,100,20);
        username.setForeground(Color.WHITE);
        add(username);

        JTextField name_field = new JTextField();
        name_field.setBounds(200,50,200,20);
        add(name_field);

        JLabel password = new JLabel("Your Password:");
        password.setBounds(100,100,100,20);
        password.setForeground(Color.WHITE);
        add(password);

        JTextField pass_field = new JTextField();
        pass_field.setBounds(200,100,200,20);
        add(pass_field);

        JButton login_button = new JButton("LOGIN");
        login_button.setBounds(410, 70, 100, 30);
        add(login_button);

        login_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = name_field.getText();
                String password = pass_field.getText();

                if (name.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter your username and password.");
                }
                else if(name.equals("Admin_01") && password.equals("AdminOne")) {
                    JOptionPane.showMessageDialog(null, "Welcome to NU Library System");
                }
                else if(name.equals("Admin_02") && password.equals("AdminTwo")) {
                    JOptionPane.showMessageDialog(null, "Welcome to NU Library System");
                }
                else if(name.equals("Admin_03") && password.equals("AdminThree")) {
                    JOptionPane.showMessageDialog(null, "Welcome to NU Library System");
                }
                else if(name.equals("Admin_01") && !password.equals("AdminOne")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
                }
                else if(name.equals("Admin_02") && !password.equals("AdminTwo")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
                }
                else if(name.equals("Admin_03") && !password.equals("AdminThree")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
                }
                else if(!name.equals("Admin_01") && password.equals("AdminOne")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT USERNAME");
                }
                else if(!name.equals("Admin_02") && password.equals("AdminTwo")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT USERNAME");
                }
                else if(!name.equals("Admin_03") && password.equals("AdminThree")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT USERNAME");
                }
                else {
                    JOptionPane.showMessageDialog(null, "INCORRECT USERNAME and PASSWORD.");
                }
                
            }
        });

        //Frame
        this.setTitle("Welcome to The Library");
        this.setSize(600,200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.darkGray);

    }

}