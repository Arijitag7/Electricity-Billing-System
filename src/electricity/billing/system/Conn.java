package electricity.billing.system;

import java.sql.*;
public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        //1.regritration of driver class. class name is "Class" which has static method forName.
        try{
            //2. creating a connection, IP, portNumber, db
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "myRoot@123");
            //3. creating a statemnt. It enable you to send SQL commands and receive data from your database. 
            s= c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        

    }
}
