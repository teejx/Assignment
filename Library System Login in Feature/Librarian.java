import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Librarian extends JFrame{

    Librarian(){
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
                else if(name.equals("Librarian_01") && password.equals("LibOne")) {
                    JOptionPane.showMessageDialog(null, "Welcome to NU Library System");
                }
                else if(name.equals("Librarian_02") && password.equals("LibTwo")) {
                    JOptionPane.showMessageDialog(null, "Welcome to NU Library System");
                }
                else if(name.equals("Librarian_03") && password.equals("LibThree")) {
                    JOptionPane.showMessageDialog(null, "Welcome to NU Library System");
                }
                else if(name.equals("Librarian_01") && !password.equals("LibOne")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
                }
                else if(name.equals("Librarian_02") && !password.equals("LibTwo")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
                }
                else if(name.equals("Librarian_03") && !password.equals("LibThree")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
                }
                else if(!name.equals("Librarian_01") && password.equals("LibOne")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT USERNAME");
                }
                else if(!name.equals("Librarian_02") && password.equals("LibTwo")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT USERNAME");
                }
                else if(!name.equals("Librarian_03") && password.equals("LibThree")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT USERNAME");
                }
                else {
                    JOptionPane.showMessageDialog(null, "INCORRECT USERNAME and PASSWORD.");
                }
                
            }
        });

        this.setTitle("Welcome to The Library");
        this.setSize(600,200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.darkGray);
        
        JPanel panel = new JPanel(new GridLayout(0, 1));

        String[] name = {"System Analysis and Design", "Android Application", "Programming Concepts and Logic Formulation"};
        String[] author = {"Gary B. Shelly", "Corinne Hoisington", "Rosauro E. Manuel"};
        int[] copy = {1, 2, 3};

        for (int x = 0; x < name.length; x++) {
            JLabel label = new JLabel(x + " " + name[x] + ", " + author[x]);
            panel.add(label);
        }

        Scanner sc = new Scanner(System.in);
        boolean end = false;

        while (end == false) {
            String choiceString = JOptionPane.showInputDialog(null, "CHOOSE A NUMBER TO RENT A BOOK:\n 1. System Analysis and Design \n 2. Android Application \n 3. Programming Concepts and Logic Formulation");
            try {
                int choice = Integer.parseInt(choiceString);

                if (copy[choice-1] >=0) {
                    JOptionPane.showMessageDialog(null, "YOU RENTED : " + name[choice-1]);
                    copy[choice-1]-=1;
                } else {
                    JOptionPane.showMessageDialog(null, "NO COPIES AVAILABLE");
                }
                String c = JOptionPane.showInputDialog(null, "RENT AGAIN ? Y/N");
                if (!c.equals("Y")) {
                    end = true;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "INVALID CHOICE");
            }
        }
        JOptionPane.showMessageDialog(null, "PROGRAM END");
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MainFrame();
    }
}    