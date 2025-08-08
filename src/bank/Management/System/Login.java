package bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    //Globally Declared
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;
    //created constructor
    Login(){
        super("Bank of Barodha");
        //ImageLoading
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);


    //bottom image
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("images/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel images = new JLabel(ii3);
        images.setBounds(630,350,100,100);
        add(images);
    //JLabel is used for insertion of the text
    //heading for the front page
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade",Font.BOLD,38));
        label1.setBounds(250,125,450,40);
        add(label1);

    //Card No. section
        label2 = new JLabel("Card no. : ");
        label2.setFont(new Font("Ralway",Font.BOLD,24));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

    //textField area for Card Section
        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);


    //PIN No. section
        label3 = new JLabel("PIN : ");
        label3.setFont(new Font("Ralway",Font.BOLD,24));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,235,375,30);
        add(label3);

    //Password input
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,235,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);


    //button Section
        button1 = new JButton("Sign In");
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setBounds(300,300,110,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Clear");
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setBounds(450,300,110,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("Sign Up");
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setBounds(300,350,260,30);
        button3.addActionListener(this);
        add(button3);



    //back image
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("images/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iimages = new JLabel(iii3);
        iimages.setBounds(0,0,850,480);
        add(iimages);


        setLayout(null);
        setSize(850,480);
        setLocation(260,160);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){

                //Signin buttonn used for login and redirect to the ATM machine
                connect c1 = new connect();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                //query to get the cardno and pin number in the database
                String q = "select * from login where card_no = '"+cardno+"' and pin = '"+pin+"'";
                //storing the get data from the baove query for this we use executeQuery
                ResultSet resultSet = c1.statement.executeQuery(q);
                //now we get the Data
                //it check the data is present in the database table in login table
                if(resultSet.next()){
                    setVisible(false);
                    new main_class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"InCorrect Card number or PIN");
                }

            }else if(e.getSource() == button2){
                textField2.setText("");
                passwordField3.setText("");
            }else if(e.getSource() == button3) {
                new Signup();
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //we created an object
        new Login();
    }
}
