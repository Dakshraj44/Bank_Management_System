package bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Signup2 extends JFrame implements ActionListener {
    String formno;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPAN,textAadhar;
    JRadioButton button1,button2,ex1,ex2;
    JButton bnext;


    Signup2(String first) {
        //Heading Content
        super("Additional Detail");
        this.formno = first;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(35,15,70,70);
        add(image);

        JLabel l1 = new JLabel("Additional Information");
        l1.setFont(new Font("Ralway",Font.BOLD,36));
        l1.setBounds(240,15,500,100);
        add(l1);

        JLabel l2 = new JLabel("Page 2");
        l2.setFont(new Font("Ralway",Font.BOLD,13));
        l2.setBounds(450,15,55,15);
        add(l2);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(780,10,60,30);
        add(l13);


        //Main Content
        JLabel lrelegion = new JLabel("Relegion :");
        lrelegion.setBounds(115,130,600,40);
        lrelegion.setFont(new Font("Raleway",Font.BOLD,21));
        add(lrelegion);

        String [] relegion = {"HINDU","Muslim","Sikh","Christan","Others"};
        comboBox = new JComboBox(relegion);
        comboBox.setFont(new Font("Ralway",Font.BOLD,18));
        comboBox.setBounds(300,135,350,30);
        comboBox.setBackground(new Color(225, 240, 245));
        add(comboBox);

        JLabel lcategory = new JLabel("Category :");
        lcategory.setBounds(115,180,600,40);
        lcategory.setFont(new Font("Raleway",Font.BOLD,21));
        add(lcategory);

        String [] category = {"General","OBC","SC","ST","Others"};
        comboBox2 = new JComboBox(category);
        comboBox2.setFont(new Font("Ralway",Font.BOLD,18));
        comboBox2.setBounds(300,185,350,30);
        comboBox2.setBackground(Color.WHITE);
        add(comboBox2);

        JLabel lIncome = new JLabel("Category :");
        lIncome.setBounds(115,230,600,40);
        lIncome.setFont(new Font("Raleway",Font.BOLD,21));
        add(lIncome);

        String [] income = {"NULL","<1,50,000","<4,50,000","<7,50,000","<12,00,000","more than 12lakh"};
        comboBox3 = new JComboBox(income);
        comboBox3.setFont(new Font("Ralway",Font.BOLD,18));
        comboBox3.setBounds(300,235,350,30);
        comboBox3.setBackground(Color.WHITE);
        add(comboBox3);

        JLabel leducation = new JLabel("Educational :");
        leducation.setBounds(115,280,600,40);
        leducation.setFont(new Font("Raleway",Font.BOLD,21));
        add(leducation);

        String [] educate = {"Non-Graduate","Graduate","Under-Graduate","Post-Graduate"};
        comboBox4 = new JComboBox(educate);
        comboBox4.setFont(new Font("Ralway",Font.BOLD,18));
        comboBox4.setBounds(300,285,350,30);
        comboBox4.setBackground(Color.WHITE);
        add(comboBox4);

        JLabel lOccupation = new JLabel("Occupation :");
        lOccupation.setBounds(115,330,600,40);
        lOccupation.setFont(new Font("Raleway",Font.BOLD,21));
        add(lOccupation);

        String [] occupation = {"Salaried","Unemployed","Businessman","Doctor"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setFont(new Font("Ralway",Font.BOLD,18));
        comboBox5.setBounds(300,335,350,30);
        comboBox5.setBackground(Color.WHITE);
        add(comboBox5);

        JLabel lPAN = new JLabel("PAN number :");
        lPAN.setBounds(115,380,600,40);
        lPAN.setFont(new Font("Raleway",Font.BOLD,21));
        add(lPAN);

        textPAN = new JTextField();
        textPAN.setFont(new Font("Ralway",Font.BOLD,18));
        textPAN.setBounds(300,385,350,30);
        add(textPAN);


        JLabel laadhar = new JLabel("Aadhar number :");
        laadhar.setBounds(115,430,600,40);
        laadhar.setFont(new Font("Raleway",Font.BOLD,21));
        add(laadhar);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Ralway",Font.BOLD,18));
        textAadhar.setBounds(300,435,350,30);
        add(textAadhar);

        JLabel lcitizen = new JLabel("Senior Citizen :");
        lcitizen.setBounds(115,490,600,40);
        lcitizen.setFont(new Font("Raleway",Font.BOLD,21));
        add(lcitizen);

        button1 = new JRadioButton("Yes");
        button1.setBackground(new Color(225, 240, 245));
        button1.setFont(new Font("Ralway",Font.BOLD,20));
        button1.setBounds(350,500,110,25);
        add(button1);

        button2 = new JRadioButton("No");
        button2.setBackground(new Color(225, 240, 245));
        button2.setFont(new Font("Ralway",Font.BOLD,20));
        button2.setBounds(490,500,150,25);
        add(button2);

        ButtonGroup buttonGroupms = new ButtonGroup();
        buttonGroupms.add(button1);
        buttonGroupms.add(button2);


        JLabel lexistaccount = new JLabel("Existing Account :");
        lexistaccount.setBounds(115,550,600,40);
        lexistaccount.setFont(new Font("Raleway",Font.BOLD,21));
        add(lexistaccount);

        ex1 = new JRadioButton("Yes");
        ex1.setBackground(new Color(225, 240, 245));
        ex1.setFont(new Font("Ralway",Font.BOLD,20));
        ex1.setBounds(350,560,110,25);
        add(ex1);

        ex2 = new JRadioButton("No");
        ex2.setBackground(new Color(225, 240, 245));
        ex2.setFont(new Font("Ralway",Font.BOLD,20));
        ex2.setBounds(490,560,120,25);
        add(ex2);

        ButtonGroup buttonGroupex = new ButtonGroup();
        buttonGroupex.add(ex1);
        buttonGroupex.add(ex2);

        bnext = new JButton("Next");
        bnext.setFont(new Font("Ralway",Font.BOLD,14));
        bnext.setBackground(Color.BLACK);
        bnext.setForeground(Color.WHITE);
        bnext.setBounds(540,623,90,28);
        bnext.addActionListener(this);
        add(bnext);


        setLayout(null);
        setSize(850,750);
        setLocation(350,20);
        getContentPane().setBackground(new Color(225, 240, 245));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String relegion = (String)comboBox.getSelectedItem();
        String category = (String)comboBox2.getSelectedItem();
        String income = (String)comboBox3.getSelectedItem();
        String education = (String) comboBox4.getSelectedItem();
        String occupation = (String) comboBox5.getSelectedItem();
        String PAN = textPAN.getText();
        String Aadhar = textAadhar.getText();
        String senior_citizen = null;
        if(button1.isSelected()){
            senior_citizen = "Yes";
        } else if (button2.isSelected()) {
            senior_citizen = "No";
        }
        String existAccount = null;
        if(ex1.isSelected()){
            existAccount = "Yes";
        } else if (ex2.isSelected()) {
            existAccount = "No";
        }

        try{
            if(textAadhar.getText().equals("") || textPAN.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the required fields");
            }else{
                //making a connection with the database
                connect c1 = new connect();
                String q = "insert into signup2 values('"+formno+"','"+relegion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+PAN+"','"+Aadhar+"','"+senior_citizen+"','"+existAccount+"')";
                //this below statement is used to execute the query q
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Signup2("");
    }
}
