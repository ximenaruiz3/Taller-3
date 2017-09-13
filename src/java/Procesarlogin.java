
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
@WebServlet(name = "ProcesarLogin", urlPatterns = {"/ProcesarLogin"})
public class Procesarlogin extends HttpServlet{
    

     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String usuario = req.getParameter("usuario");
            String contraseña = req.getParameter("contraseña");
            out.println((usuario.compareTo(contraseña)==0? "Bienvenido"+usuario : "Usuario o contraseña no validos"));

            out.println("</body>");
            out.println("</html>");
        }catch (Exception e){
            
        }
    }
}
