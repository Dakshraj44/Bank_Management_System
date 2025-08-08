package bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balanceEnquiry extends JFrame  implements  ActionListener{
    JLabel l3;
    JButton back;
    String pin;
    balanceEnquiry(String pin_no){
        this.pin = pin_no;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1450,710,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1450,710);
        add(l1);

        JLabel l2 = new JLabel("Your Current Balance is Rs ");
        l2.setForeground(Color.WHITE);
        l2.setBounds(450,160,350,30);
        l2.setFont(new Font("System",Font.BOLD,17));
        l1.add(l2);

        l3 = new JLabel();
        l3.setForeground(Color.WHITE);
        l3.setBounds(490,200,350,30);
        l3.setFont(new Font("System",Font.BOLD,24));
        l1.add(l3);


        back = new JButton("Back");
        back.setFont(new Font("Raleway",Font.BOLD,15));
        back.setBackground(Color.CYAN);
        back.setBounds(680,312,115,26);
        back.addActionListener(this);
        l1.add(back);


        int balance = 0;

        try {
            connect c = new connect();
            ResultSet resultSet = c.statement.executeQuery("select * from deposit_amount where pin_no = '"+pin+"'");
            while (resultSet.next()){
                //fetching the balance of the account
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        l3.setText(""+balance);

        setLayout(null);
        setSize(1580,1080);
        getContentPane().setBackground(Color.WHITE);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_class(pin);
    }

    public static void main(String[] args){
        new balanceEnquiry("");
    }
}
