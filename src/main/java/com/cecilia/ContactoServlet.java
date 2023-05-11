/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cecilia;

import com.cecilia.dao.ContactoDAO;
import com.cecilia.dao.ContactoDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author escob
 */

@WebServlet(urlPatterns="/ContactoServlet")
public class ContactoServlet extends HttpServlet {
    
    private ContactoDAO contactoDao;
    
    public ContactoServlet(){
        
        super();
        contactoDao = new ContactoDAOImpl();
    }
    
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String nombre= req.getParameter("nombre");
       String emailId= req.getParameter("emailId");
        String telefono= req.getParameter("telefono");
        String descripcion= req.getParameter("descripcion");
     
        
        
    }
    
   @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String email = req.getParameter("email");
        String descripcion = req.getParameter("descripcion");
        
        
        
    }
    
    protected void procesarSolicitud(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
    }
    
}
