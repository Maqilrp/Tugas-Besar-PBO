/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author AqilR
 */
public class Config {
    private static Connection MySqlConfig;
    
    public static Connection configDB() throws SQLException{
        try {
            String url = "jdbc.mysql://localhost:3306/hotel";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySqlConfig = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("Database Connection Failed " + e.getMessage());
        }
        return  MySqlConfig;
    }
}
