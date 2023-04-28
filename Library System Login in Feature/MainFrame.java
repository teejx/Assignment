import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame() {

        setLayout(null);
        JLabel label = new JLabel("Test");
        label.setBounds(160,150,300,20);
        label.setText("CHOOSE YOUR LOGIN");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Segoe UI Black", Font.BOLD,25));
        
        //--------Buttons--------
        //---ADMIN---
        JButton adminButton = new JButton();
        adminButton.setText("Admin");
        adminButton.setFont(new Font("OCR A Extended", Font.BOLD,25));
        adminHandler handler = new adminHandler();
        adminButton.addActionListener(handler);
        adminButton.setLocation(320,250);
        adminButton.setSize(200,50);

        //---LIBRARIAN---
        JButton libButton = new JButton();
        libButton.setText("Librarian");
        libButton.setFont(new Font("OCR A Extended", Font.BOLD,25));
        libHandler handler1 = new libHandler();
        libButton.addActionListener(handler1);
        libButton.setLocation(75,250);
        libButton.setSize(200,50);

        this.add(label);
        this.add(adminButton);
        this.add(libButton);
        

        //Frame
        this.setLayout(null);
        this.setTitle("Choose Your Account");
        this.setSize(600,600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.darkGray);

    }
    private class adminHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            new Admin();
            dispose();
        }

        
    }
    private class libHandler implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            new Librarian();
            dispose();
        }

       
    }

}