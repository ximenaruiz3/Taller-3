
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XimenaR
 */
@WebServlet(name="ProcesarFormulario", urlPatterns = {"/ProcesarFormulario"})
public class ProcesarFormulario extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html;charset-UFT-8");
        try (PrintWriter out =resp.getWriter()){
            out.println("<!DOCTYPE html");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Prueba</title>");
            out.println("</head>");
            out.println("<body>");
            String nombre=req.getParameter("nombre");
            String apellido=req.getParameter("apellido");
    
            Integer edad =Integer.parseInt(req.getParameter("edad"));
            
            out.println("Bienvenido "+ nombre+" " +apellido +", usted es" +(edad>18? "mayor" : " menor")+" de edad");
            out.println("</body>");
            out.println("</html>");
            
        } 
        
    }
    
}
