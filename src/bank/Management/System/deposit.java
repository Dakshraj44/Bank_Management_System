package bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;

public class deposit extends JFrame implements ActionListener{
    String pin;
    JTextField textField;
    JButton depo,back;
    deposit(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1450,710,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1450,710);
        add(l1);

        JLabel l2 = new JLabel("Enter the amount deposit");
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

        depo = new JButton("Deposit");
        depo.setFont(new Font("Raleway",Font.BOLD,15));
        depo.setBackground(Color.CYAN);
        depo.setBounds(680,352,115,26);
        depo.addActionListener(this);
        l1.add(depo);

        setLayout(null);
        setSize(1580,1080);
        getContentPane().setBackground(Color.BLACK);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

        try{
            String amount = textField.getText();
            Date date = new Date();
            if(e.getSource() == depo){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter the Amount you want to Deposit");
                }else {
                    connect c1 =new connect();
                    String q1 = "insert into deposit_amount values('"+pin+"','"+date+"','Deposit','"+amount+"')";
                    c1.statement.executeUpdate(q1);
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    new main_class(pin);
                    setVisible(false);

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
        new  deposit("");
    }
}
