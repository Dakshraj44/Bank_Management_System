package bank.Management.System;


import java.sql.*;

public class connect {
    Connection connection;
    Statement statement;
    public connect(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Daksh@821");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
