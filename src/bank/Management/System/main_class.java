package bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    String pin;


    main_class(String pinno){
        this.pin = pinno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1450,710,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1500,710);
        add(l1);

        JLabel l2 = new JLabel("Please Select your Transiction");
        l2.setFont(new Font("System",Font.BOLD,22));
        l2.setForeground(Color.WHITE);
        l2.setBounds(460,160,350,30);
        l1.add(l2);

        b1 = new JButton("CASH WITHDRAWL");
        b1.setFont(new Font("Raleway",Font.BOLD,17));
        b1.setContentAreaFilled(false);
        b1.setForeground(Color.WHITE);
        b1.setBorderPainted(false);
        b1.setOpaque(false);
        b1.setBounds(630,230,200,30);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("MINI STATEMENT");
        b2.setFont(new Font("Raleway",Font.BOLD,17));
//        b2.setBackground(Color.CYAN);
        b2.setContentAreaFilled(false);
        b2.setForeground(Color.WHITE);
        b2.setBorderPainted(false);
        b2.setOpaque(false);
        b2.setBounds(640,270,200,30);
        b2.addActionListener(this);
        l1.add(b2);

        b3 = new JButton("BALANCE ENQUIRY");
        b3.setFont(new Font("Raleway",Font.BOLD,17));
        b3.setContentAreaFilled(false);
        b3.setForeground(Color.WHITE);
        b3.setBorderPainted(false);
        b3.setOpaque(false);
        b3.setBounds(625,310,210,30);
        b3.addActionListener(this);
        l1.add(b3);


        b4 = new JButton("EXIT");
        b4.setFont(new Font("Raleway",Font.BOLD,17));
        b4.setContentAreaFilled(false);
        b4.setForeground(Color.WHITE);
        b4.setBorderPainted(false);
        b4.setOpaque(false);
        b4.setBounds(720,350,120,30);
        b4.addActionListener(this);
        l1.add(b4);



        b5 = new JButton("DEPOSIT");
        b5.setFont(new Font("Raleway",Font.BOLD,17));
        b5.setContentAreaFilled(false);
        b5.setForeground(Color.WHITE);
        b5.setBorderPainted(false);
        b5.setOpaque(false);
        b5.setBounds(395,230,120,30);
        b5.addActionListener(this);
        l1.add(b5);

        b6 = new JButton("FAST CASH");
        b6.setFont(new Font("Raleway",Font.BOLD,17));
        b6.setContentAreaFilled(false);
        b6.setForeground(Color.WHITE);
        b6.setBorderPainted(false);
        b6.setOpaque(false);
        b6.setBounds(392,270,150,30);
        b6.addActionListener(this);
        l1.add(b6);

        b7 = new JButton("PIN CHANGE");
        b7.setFont(new Font("Raleway",Font.BOLD,17));
        b7.setContentAreaFilled(false);
        b7.setForeground(Color.WHITE);
        b7.setBorderPainted(false);
        b7.setOpaque(false);
        b7.setBounds(395,310,150,30);
        b7.addActionListener(this);
        l1.add(b7);




        setLayout(null);
        setSize(1580,1080);
        getContentPane().setBackground(Color.WHITE);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == b1){
                new Withdrawl(pin);
                setVisible(false);
            } else if (e.getSource() == b2) {
                new mini(pin);
                setVisible(false);
            }else if (e.getSource() == b3){
                new balanceEnquiry(pin);
                setVisible(false);
            } else if (e.getSource() == b4) {
                System.exit(0);
            } else if (e.getSource() == b5) {
                new deposit(pin);
                setVisible(false);
            } else if (e.getSource() == b6) {
                new FastCash(pin);
                setVisible(false);
            } else if (e.getSource() == b7) {
                new PinChange(pin);
                dispose();
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new main_class("");
    }
}
