import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class MainFrame extends JFrame{

    final private Font mainFont = new Font("Segoe print",Font.BOLD,18);
    JTextField tfFirstName,tfLastName;
    JLabel lbWelcome;
    public void initialize() {

        /*************FORM PANEL**************/

        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);
        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName); 

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        /*********Button Panel*********/
        JButton btn1 = new JButton("OK");
        btn1.setFont(mainFont);

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Hello "+ firstName+" "+lastName);

            }

        });

        JButton btn2 = new JButton("Clear");
        btn2.setFont(mainFont);
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }

        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btn1);
        buttonsPanel.add(btn2);



        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 225));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(formPanel,BorderLayout.NORTH);
        mainPanel.add(lbWelcome,BorderLayout.CENTER);
        mainPanel.add(buttonsPanel,BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("First JFrame");
        setSize(500,600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame ob = new MainFrame();
        ob.initialize();
    }
}
