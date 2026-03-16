package demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // User is your Database name
        String url = "jdbc:postgresql://localhost:5432/studentdb";
        String uname = "postgres"; // Username - Common
        String pass = "mysecretpassword"; // Password you created
        try {
            Connection con =
                    DriverManager.getConnection(url,uname,pass);
            System.out.println("Connection Success");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
