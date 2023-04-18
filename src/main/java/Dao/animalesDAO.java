/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Interfaces.CRUD;
import Modelo.animales;
import Conexion.conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dadim
 */
public class animalesDAO implements CRUD{
    
    

    @Override
    public List listar() {
        
        conexion cn = new conexion();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        
        ArrayList<animales> list = null;
        
        try {
            con = cn.getConnection();
            String sql = "SELECT * FROM animales_index";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            list = new ArrayList<>();
            
            while (rs.next()) { 
                animales an = new animales();
                an.setTipoAnimal(rs.getString("tipo_animales"));                
                an.setImg(rs.getString("img"));                
                list.add(an);
            }
            System.out.println("TA....." +rs.getString("tipo_animales"));
            System.out.println("IM....." +rs.getString("img"));
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("Error AnimalesDAO"+e.getMessage());
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return list;
    }

    @Override
    public animales list(int id) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return null;
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
