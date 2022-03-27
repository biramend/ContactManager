/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bir.servlets;

import com.bir.bean.Contact;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author c
 */
@WebServlet(name="ContactServlet")
public class ContactServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       try (PrintWriter out = response.getWriter()) {
            String fistname=request.getParameter("fistname");
            String lastname=request.getParameter("lastname");
            String phone=request.getParameter("phone");
            String email=request.getParameter("email");
            String address=request.getParameter("address");
            if(fistname.isEmpty() || lastname.isEmpty()|| phone.isEmpty()){
                out.println(" <h1 font-size:5px color:red>Vérifier les champs obligatoire</h1> ");}
             else{
                  request.setAttribute("fistname",request.getParameter("fistname") );
           request.setAttribute("lastname",request.getParameter("lastname") );
           request.setAttribute("phone",request.getParameter("phone") );
           request.setAttribute("email", request.getParameter("email"));
           request.setAttribute("address",request.getParameter("address") );
           request.getRequestDispatcher("/Monjsp.jsp").forward(request, response); 
             }
                 
            
           
    }

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out =response.getWriter();
        System.out.println(" Prenom :" +request.getParameter("fistname") + " Nom :"+request.getParameter("lastname") + " Numéro :"+request.getParameter("phone") + " Email :"+request.getParameter("email") +" Adresse :"+request.getParameter("address"));
       processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       processRequest(request, response);
        request.getRequestDispatcher("/Monjsp.jsp").forward(request, response);
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
