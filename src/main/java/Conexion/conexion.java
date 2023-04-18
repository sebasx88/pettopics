/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author dadim
 */
public class conexion {
    
    Connection con;

    public conexion() {
        try {
            System.out.println("COnexion establecida");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pettopics","root","admin");
        } catch (Exception e) {
            System.out.println("Error -> "+e.getLocalizedMessage());
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
}
