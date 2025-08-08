package bank.Management.System;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    String pin;
    FastCash(String pin_no){
        this.pin = pin_no;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1450,710,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1500,710);
        add(l1);

        JLabel l2 = new JLabel("SELECT WITHDRAWAL AMOUNT");
        l2.setFont(new Font("System",Font.BOLD,22));
        l2.setForeground(Color.WHITE);
        l2.setBounds(460,160,350,30);
        l1.add(l2);

        b1 = new JButton("Rs. 2000");
        b1.setFont(new Font("Raleway",Font.BOLD,17));
        b1.setContentAreaFilled(false);
        b1.setForeground(Color.WHITE);
        b1.setBorderPainted(false);
        b1.setOpaque(false);
        b1.setBounds(670,230,200,30);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("Rs. 5000");
        b2.setFont(new Font("Raleway",Font.BOLD,17));
//        b2.setBackground(Color.CYAN);
        b2.setContentAreaFilled(false);
        b2.setForeground(Color.WHITE);
        b2.setBorderPainted(false);
        b2.setOpaque(false);
        b2.setBounds(670,270,200,30);
        b2.addActionListener(this);
        l1.add(b2);

        b3 = new JButton("Rs. 10000");
        b3.setFont(new Font("Raleway",Font.BOLD,17));
        b3.setContentAreaFilled(false);
        b3.setForeground(Color.WHITE);
        b3.setBorderPainted(false);
        b3.setOpaque(false);
        b3.setBounds(670,310,210,30);
        b3.addActionListener(this);
        l1.add(b3);


        b4 = new JButton("BACK");
        b4.setFont(new Font("Raleway",Font.BOLD,17));
        b4.setContentAreaFilled(false);
        b4.setForeground(Color.WHITE);
        b4.setBorderPainted(false);
        b4.setOpaque(false);
        b4.setBounds(720,350,120,30);
        b4.addActionListener(this);
        l1.add(b4);



        b5 = new JButton("Rs. 100");
        b5.setFont(new Font("Raleway",Font.BOLD,17));
        b5.setContentAreaFilled(false);
        b5.setForeground(Color.WHITE);
        b5.setBorderPainted(false);
        b5.setOpaque(false);
        b5.setBounds(385,230,120,30);
        b5.addActionListener(this);
        l1.add(b5);

        b6 = new JButton("Rs. 500");
        b6.setFont(new Font("Raleway",Font.BOLD,17));
        b6.setContentAreaFilled(false);
        b6.setForeground(Color.WHITE);
        b6.setBorderPainted(false);
        b6.setOpaque(false);
        b6.setBounds(385,270,120,30);
        b6.addActionListener(this);
        l1.add(b6);

        b7 = new JButton("Rs. 1000");
        b7.setFont(new Font("Raleway",Font.BOLD,17));
        b7.setContentAreaFilled(false);
        b7.setForeground(Color.WHITE);
        b7.setBorderPainted(false);
        b7.setOpaque(false);
        b7.setBounds(385,310,120,30);
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
        if(e.getSource() == b4){
            setVisible(false);
            new main_class(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            connect c =new connect();
            Date date = new Date();
            try{
                ResultSet resultSet = c.statement.executeQuery("select * from deposit_amount where pin_no = '"+pin+"'");
                int balance = 0;
                while (resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }


                if(e.getSource() != b4 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"InSufficient Balance");
                    return;
                }

                c.statement.executeUpdate("insert into deposit_amount values('"+pin+"','"+date+"','Withdraw','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs "+ amount+" Debitted Successfully");
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_class(pin);
        }
    }

    public static void main(String[] args){
        new FastCash("");
    }
}
