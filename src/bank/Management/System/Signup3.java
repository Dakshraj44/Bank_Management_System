package bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton submit,cancel;
    String formno;

    Signup3(String formno){
        //it is used for global deceleration
        this.formno = formno;
    //Heading Section
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(75,75,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(55,25,75,75);
        add(image);

        JLabel l1 = new JLabel("Account Details ");
        l1.setBounds(280,55,340,50);
        l1.setFont(new Font("Ralway",Font.BOLD,36));
        add(l1);

        JLabel l2 = new JLabel("Page 3");
        l2.setFont(new Font("Ralway",Font.BOLD,15));
        l2.setBounds(450,15,55,20);
        add(l2);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(780,10,60,30);
        add(l13);


        JLabel lacctype = new JLabel("Account Type :");
        lacctype.setFont(new Font("Ralway",Font.BOLD,23));
        lacctype.setBounds(90,155,235,30);
        add(lacctype);

        r1 = new JRadioButton("Saving");
        r1.setFont(new Font("Ralway",Font.BOLD,18));
        r1.setBackground(new Color(225, 240, 245));
        r1.setBounds(300,155,105,30);
        add(r1);

        r2 = new JRadioButton("Fixed");
        r2.setFont(new Font("Ralway",Font.BOLD,18));
        r2.setBackground(new Color(225, 240, 245));
        r2.setBounds(420,155,105,30);
        add(r2);

        r3 = new JRadioButton("Sharing");
        r3.setFont(new Font("Ralway",Font.BOLD,18));
        r3.setBackground(new Color(225, 240, 245));
        r3.setBounds(530,155,105,30);
        add(r3);

        r4 = new JRadioButton("Current");
        r4.setFont(new Font("Ralway",Font.BOLD,18));
        r4.setBackground(new Color(225, 240, 245));
        r4.setBounds(660,155,105,30);
        add(r4);

        ButtonGroup b1 = new ButtonGroup();
        b1.add(r1);
        b1.add(r2);
        b1.add(r3);
        b1.add(r4);

        JLabel lcardno = new JLabel("Card number :");
        lcardno.setFont(new Font("Ralway",Font.BOLD,23));
        lcardno.setBounds(90,205,235,30);
        add(lcardno);

        JLabel l3 = new JLabel("(Your 16-digit Card Number)");
        l3.setFont(new Font("Ralway",Font.BOLD,12));
        l3.setBounds(90,235,200,20);
        add(l3);

        JLabel l4 = new JLabel("XXXX-XXXX-XXXX-4268");
        l4.setFont(new Font("Ralway",Font.BOLD,18));
        l4.setBounds(300,205,245,30);
        add(l4);

        JLabel l7 = new JLabel("(It would appear in ATM card,Cheque book and Statement)");
        l7.setFont(new Font("Ralway",Font.BOLD,12));
        l7.setBounds(300,235,500,20);
        add(l7);

        JLabel l8= new JLabel("PIN :");
        l8.setFont(new Font("Ralway",Font.BOLD,23));
        l8.setBounds(90,280,235,30);
        add(l8);

        JLabel l9= new JLabel("XXXX");
        l9.setFont(new Font("Ralway",Font.BOLD,19));
        l9.setBounds(300,280,235,30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Ralway",Font.BOLD,12));
        l10.setBounds(300,307,200,20);
        add(l10);

        JLabel l11= new JLabel("Service Required :");
        l11.setFont(new Font("Ralway",Font.BOLD,23));
        l11.setBounds(90,345,235,30);
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Ralway",Font.BOLD,18));
        c1.setBackground(new Color(225, 240, 245));
        c1.setBounds(230,395,115,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,18));
        c2.setBackground(new Color(225, 240, 245));
        c2.setBounds(460,395,175,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,18));
        c3.setBackground(new Color(225, 240, 245));
        c3.setBounds(230,455,160,30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,18));
        c4.setBackground(new Color(225, 240, 245));
        c4.setBounds(460,455,160,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,18));
        c5.setBackground(new Color(225, 240, 245));
        c5.setBounds(230,515,160,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,18));
        c6.setBackground(new Color(225, 240, 245));
        c6.setBounds(460,515,160,30);
        add(c6);

        JCheckBox checkBox = new JCheckBox("I here by declare that the above entered details correct to the best of my knowledge",true);
        checkBox.setBackground(new Color(225, 240, 245));
        checkBox.setFont(new Font("Raleway",Font.ITALIC,12));
        checkBox.setBounds(90,575,835,30);
        add(checkBox);

        submit = new JButton("Submit");
        submit.setFont(new Font("Ralway",Font.BOLD,14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(260,625,90,29);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Ralway",Font.BOLD,14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(460,625,90,29);
        cancel.addActionListener(this);
        add(cancel);


        setLayout(null);
        setSize(850,750);
        setLocation(350,20);
        getContentPane().setBackground(new Color(225, 240, 245));
        setVisible(true);
    }
@Override
    public void actionPerformed(ActionEvent e){
        String accountype = null;
        if(r1.isSelected()){
            accountype = "Saving";
        } else if (r2.isSelected()) {
            accountype = "Fixed";
        } else if (r3.isSelected()) {
            accountype = "Sharing";
        } else if (r4.isSelected()) {
            accountype = "Current";
        }
        //for card number
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = ""+Math.abs(first7);
        //for PIN number
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        //facility
        String services = " ";
        if(c1.isSelected()){
            services += "ATM Card, ";
        } if(c2.isSelected()){
            services += "Internet Banking ";
        } if(c3.isSelected()){
            services += "Mobile Banking ";
        } if(c4.isSelected()){
            services += "Internet Banking ";
        } if(c5.isSelected()){
            services += "Email Alerts ";
        } if (c6.isSelected()) {
            services += "E-Statement ";
        }

    try{
            if(e.getSource() == submit){
                if(accountype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill the required Field");
                }else {
                    connect c1 = new connect();
                    String q1 = "insert into signup3 values('"+formno+"','"+accountype+"','"+cardno+"','"+pin+"','"+services+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card number : "+cardno+"\n"+"PIN : "+pin);
                    new deposit(pin);
                    setVisible(false);

                }
            } else if (e.getSource() == cancel) {
                //its Closes the system
                System.exit(0);
            }
    } catch (Exception E) {
            E.printStackTrace();
        }


}
    public static void main(String[] args){
        new Signup3("");
    }
}
