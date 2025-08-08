package bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton wd,back;
    Withdrawl(String pin_n0){
        this.pin = pin_n0;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1450,710,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1450,710);
        add(l1);

        JLabel l2 = new JLabel("Enter the amount to Withdraw");
        l2.setForeground(Color.WHITE);
        l2.setBounds(490,130,350,30);
        l2.setFont(new Font("System",Font.BOLD,17));
        l1.add(l2);

        textField = new JTextField();
        textField.setFont(new Font("Raleway",Font.BOLD,17));
        textField.setBounds(440,180,300,30);
        l1.add(textField);

        back = new JButton("Back");
        back.setFont(new Font("Raleway",Font.BOLD,15));
        back.setBackground(Color.CYAN);
        back.setBounds(680,312,115,26);
        back.addActionListener(this);
        l1.add(back);

        wd = new JButton("Withdraw");
        wd.setFont(new Font("Raleway",Font.BOLD,15));
        wd.setBackground(Color.CYAN);
        wd.setBounds(680,352,115,26);
        wd.addActionListener(this);
        l1.add(wd);

        setLayout(null);
        setSize(1580,1080);
        getContentPane().setBackground(Color.BLACK);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

        try{
            String withdraw = textField.getText();
            Date date = new Date();
            if(e.getSource() == wd){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter the Amount you want to Withdraw");
                }else {
                    connect c1 =new connect();
                    ResultSet resultSet = c1.statement.executeQuery("select * from deposit_amount where pin_no = '"+pin+"'");
                    int balance = 0;
                    while (resultSet.next()){
                        //fetching the balance of the account
                        if(resultSet.getString("type").equals("Deposit")){
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        }else{
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if(balance < Integer.parseInt(withdraw)){
                        JOptionPane.showMessageDialog(null,"InSufficient Balance");
                        return;
                    }

                    c1.statement.executeUpdate("insert into deposit_amount values('"+pin+"','"+date+"','Withdrawl','"+withdraw+"')");
//                    String q1 = ;
                    JOptionPane.showMessageDialog(null,"Rs. "+withdraw+" Debited Successfully");
                    setVisible(false);
                    new main_class(pin);

                }
            } else if (e.getSource() == back) {
                setVisible(false);
                new main_class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args){
        new Withdrawl("");
    }
}
