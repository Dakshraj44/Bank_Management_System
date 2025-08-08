package bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2;
    JPasswordField p1,p2;
    PinChange(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1450,710,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1500,710);
        add(l1);

        JLabel l2 = new JLabel("NEW PIN :");
        l2.setForeground(Color.WHITE);
        l2.setBounds(430,170,320,30);
        l2.setFont(new Font("System",Font.BOLD,14));
        l1.add(l2);

        p1 = new JPasswordField();
        p1.setFont(new Font("System",Font.BOLD,14));
        p1.setBounds(570,170,240,26);
        l1.add(p1);

        JLabel l3 = new JLabel("Re-ENTER PIN :");
        l3.setForeground(Color.WHITE);
        l3.setBounds(430,230,320,30);
        l3.setFont(new Font("System",Font.BOLD,14));
        l1.add(l3);

        p2 = new JPasswordField();
        p2.setFont(new Font("System",Font.BOLD,14));
        p2.setBounds(570,230,240,26);
        l1.add(p2);

        b1 = new JButton("CHANGE");
        b1.setFont(new Font("Raleway",Font.BOLD,15));
        b1.setBackground(Color.CYAN);
        b1.setBounds(680,312,115,26);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Raleway",Font.BOLD,15));
        b2.setBackground(Color.CYAN);
        b2.setBounds(680,352,115,26);
        b2.addActionListener(this);
        l1.add(b2);

        setLayout(null);
        setSize(1580,1080);
        getContentPane().setBackground(Color.WHITE);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            try{
                String pin1 = p1.getText();
                String pin2 = p2.getText();
                if(!pin1.equals(pin2)){
                    JOptionPane.showMessageDialog(null,"Entered PIN doesn't match");
                    return;
                }
                if(e.getSource() == b1){
                    if(pin1.equals("")){
                        JOptionPane.showMessageDialog(null,"Entered PIN ");
                        return;
                    }
                    if(pin2.equals("")){
                        JOptionPane.showMessageDialog(null,"Entered PIN ");
                        return;
                    }

                    connect c = new connect();
                    String q1 = "update deposit_amount set pin_no = '"+pin1+"' where pin_no = '"+pin+"'";
                    String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                    String q3 = "update signup3 set PIN = '"+pin1+"' where PIN = '"+pin+"'";

                    c.statement.executeUpdate(q1);
                    c.statement.executeUpdate(q2);
                    c.statement.executeUpdate(q3);

                    JOptionPane.showMessageDialog(null,"PIN CHANGE SUCCESSFULLY");
                    setVisible(false);
                    new main_class(pin);
                } else if (e.getSource() == b2) {
                    new main_class(pin);

                }
            }catch (Exception E){
                E.printStackTrace();
            }
    }

    public static void main(String[] args){
        new PinChange("");
    }
}
