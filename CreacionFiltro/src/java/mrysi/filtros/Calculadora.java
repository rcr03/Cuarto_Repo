/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package mrysi.filtros;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ReginaCR
 */
public class Calculadora extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet clacula edad</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Edad calculada </h1>" 
                    +"<P>"
                    + "En:" + request.getContextPath() 
                    + "</p>"
                    + "<p>" + this.getServletInfo() + "</p>");
            out.println ("<p>");
            if (request.getAttribute("edad")!=null){
                out.print("edad =" + request.getAttribute("edad"));
            out.println ("</p>");
            out.println ("<p>"+ this.getServletInfo()+ "</p>");
            out.println("</body>");
            out.println("</html>");
            }
                    
                    
                    
            out.println("</body>");
            out.println("</html>");
        }
    }
}