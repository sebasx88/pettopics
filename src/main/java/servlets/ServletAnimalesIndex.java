/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dadim
 */
@WebServlet(name = "ServletAnimalesIndex", urlPatterns = {"/ServletAnimalesIndex"})
public class ServletAnimalesIndex extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        String val1 = request.getParameter("val1");
//        String val2 = request.getParameter("val2");
//        System.out.println("val1 ->"+val1+ " val2-> "+val2);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
      
        try {
            PrintWriter out = response.getWriter();
            response.setContentType("string");
            //creamos la conexion a la base de datos
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pettopics","root","admin");
            System.out.println("con "+con.toString());
            String val1 = request.getParameter("val1");
            String val2 = request.getParameter("val2");
            String val3 = request.getParameter("val3");
            String val4 = request.getParameter("val4");
            
            //setteamos el val1 al id de la consulta
            PreparedStatement ps = con.prepareStatement("SELECT tipo_animales FROM animales_index WHERE id = ?");
            System.out.println("sentencia "+ ps.toString());
            ps.setString(1, val2);
            
            //ejecutamos la senetencia con sus parametros 
            ResultSet rs = ps.executeQuery();
            
            //verificamos que el resultado de la consulta contenga informacion
            if(rs.next()){
                out.println(rs.getString("tipo_animales"));
                System.out.println("datos: " + rs.getString("tipo_animales"));
            }else{
                System.out.println("Error....");
            }
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error.. "+ ex.getMessage());
            //Logger.getLogger(ServletAnimalesIndex.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("Error mysql "+ex.getMessage());
            Logger.getLogger(ServletAnimalesIndex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
