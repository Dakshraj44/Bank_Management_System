package bank.Management.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    //we Declare textField globally because wwe want to get the data in the text for the futher use
    JTextField textName,textFname,textEmail,textAddress,textcity,textPIN,textState;
    JDateChooser date;
    JRadioButton rg1,rg2,rg3,ms1,ms2;
    JButton next,clear;

    //Genrating random number for Application number
    Random ran = new Random();
    long first4 = (ran.nextLong()%9000L)+1000L;
    String first = " "+ Math.abs(first4);

    Signup(){
        //for title
        super("Application Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(75,75, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30,10,75,75);
        add(image);

        JLabel label1 = new JLabel("Application number : "+first);
        label1.setBounds(160,27,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,12));
        label2.setBounds(780,10,50,17);
        add(label2);

        //Main Content
        JLabel label3 = new JLabel("Personal Information");
        label3.setFont(new Font("Ralway",Font.BOLD,27));
        label3.setBounds(280,100,500,30);
        add(label3);

        //MainContent
        JLabel labelName = new JLabel("Name   : ");
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        labelName.setBounds(115,155,200,25);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Ralway",Font.BOLD,18));
        textName.setBounds(280,155,350,30);
        add(textName);


        JLabel labelFname = new JLabel("Father name   : ");
        labelFname.setFont(new Font("Ralway",Font.BOLD,20));
        labelFname.setBounds(115,205,200,25);
        add(labelFname);

        textFname = new JTextField();
        textFname.setFont(new Font("Ralway",Font.BOLD,18));
        textFname.setBounds(280,205,350,30);
        add(textFname);

        JLabel DOB = new JLabel("D.O.B :");
        DOB.setFont(new Font("Ralway",Font.BOLD,21));
        DOB.setBounds(115,255,200,25);
        add(DOB);

        date = new JDateChooser();
        date.setForeground(new Color(105,105,105));
        date.setBounds(280,255,200,30);
        add(date);


        JLabel labelG = new JLabel("Gender  :  ");
        labelG.setBounds(115,303,200,25);
        labelG.setFont(new Font("Ralway",Font.BOLD,21));
        add(labelG);

        rg1 = new JRadioButton("Male");
        rg1.setBackground(new Color(222, 225, 228));
        rg1.setFont(new Font("Ralway",Font.BOLD,20));
        rg1.setBounds(280,303,80,25);
        add(rg1);

        rg2 = new JRadioButton("Female");
        rg2.setBackground(new Color(222, 225, 228));
        rg2.setFont(new Font("Ralway",Font.BOLD,20));
        rg2.setBounds(360,303,100,25);
        add(rg2);

        rg3 = new JRadioButton("Other");
        rg3.setBackground(new Color(222, 225, 228));
        rg3.setFont(new Font("Ralway",Font.BOLD,20));
        rg3.setBounds(470,303,90,25);
        add(rg3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rg1);
        buttonGroup.add(rg2);
        buttonGroup.add(rg3);


        JLabel labelEmail = new JLabel("Email : ");
        labelEmail.setBounds(115,350,200,25);
        labelEmail.setFont(new Font("Raleway",Font.BOLD,23));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(280,350,350,30);
        textEmail.setFont(new Font("Ralway",Font.BOLD,18));
        add(textEmail);

        JLabel labeMs = new JLabel("Martial Status  :  ");
        labeMs.setBounds(115,400,200,25);
        labeMs.setFont(new Font("Ralway",Font.BOLD,21));
        add(labeMs);

        ms1 = new JRadioButton("Married");
        ms1.setBackground(new Color(222, 225, 228));
        ms1.setFont(new Font("Ralway",Font.BOLD,20));
        ms1.setBounds(280,400,130,25);
        add(ms1);

        ms2 = new JRadioButton("Unmarried");
        ms2.setBackground(new Color(222, 225, 228));
        ms2.setFont(new Font("Ralway",Font.BOLD,20));
        ms2.setBounds(410,400,150,25);
        add(ms2);

        ButtonGroup buttonGroupms = new ButtonGroup();
        buttonGroupms.add(ms1);
        buttonGroupms.add(ms2);


        JLabel labelAddress = new JLabel("Address  : ");
        labelAddress.setBounds(115,450,200,25);
        labelAddress.setFont(new Font("Raleway",Font.BOLD,21));
        add(labelAddress);

        textAddress = new JTextField();
        textAddress.setBounds(280,450,350,30);
        textAddress.setFont(new Font("Ralway",Font.BOLD,18));
        add(textAddress);


        JLabel labelCity = new JLabel("City  : ");
        labelCity.setBounds(115,503,200,25);
        labelCity.setFont(new Font("Raleway",Font.BOLD,21));
        add(labelCity);

        textcity = new JTextField();
        textcity.setBounds(280,503,350,30);
        textcity.setFont(new Font("Ralway",Font.BOLD,18));
        add(textcity);

        JLabel labelPIN = new JLabel("PIN code  : ");
        labelPIN.setBounds(115,553,200,25);
        labelPIN.setFont(new Font("Raleway",Font.BOLD,21));
        add(labelPIN);

        textPIN = new JTextField();
        textPIN.setBounds(280,553,350,30);
        textPIN.setFont(new Font("Ralway",Font.BOLD,18));
        add(textPIN);

        JLabel labelState = new JLabel("State   : ");
        labelState.setBounds(115,603,200,25);
        labelState.setFont(new Font("Raleway",Font.BOLD,21));
        add(labelState);

        textState = new JTextField();
        textState.setBounds(280,603,350,30);
        textState.setFont(new Font("Ralway",Font.BOLD,18));
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(540,663,90,21);
        next.addActionListener(this);
        add(next);

//        clear = new JButton("Clear");
//        clear.setFont(new Font("Ralway",Font.BOLD,14));
//        clear.setBackground(Color.BLACK);
//        clear.setForeground(Color.WHITE);
//        clear.setBounds(250,663,90,21);
//        add(clear);



        //for background color
        getContentPane().setBackground(new Color(222, 225, 228));
        setLayout(null);
        setSize(850,750);
        setLocation(350,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(rg1.isSelected()){
            gender = "Male";
        }else if (rg2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital =null;
        if (ms1.isSelected()){
            marital = "Married";
        } else if (ms2.isSelected()) {
            marital = "Unmarried";
        }

        String address = textAddress.getText();
        String city = textcity.getText();
        String pincode = textPIN.getText();
        String state = textState.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                connect c = new connect();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                c.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }
    public static  void main(String[] args){
        new Signup();
    }
}
