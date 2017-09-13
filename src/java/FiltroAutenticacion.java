
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
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
@WebFilter(filterName = "filtroAutenticacion",urlPatterns = {"/index.html","/ProcesarFormulario"})
public class FiltroAutenticacion implements Filter{
    
    
    
    @Override
    public void init(FilterConfig filterConfig)throws ServletException{
    
    }
    
   
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       
        HttpServletRequest req= (HttpServletRequest) request;
        HttpServletResponse resp= (HttpServletResponse) response;
        if(req.getSession().getAttribute("usuario")==null){
            resp.sendRedirect("./login.html");
            
        }
        else{
            if (req.getSession().getAttribute("usuario")==req.getSession().getAttribute("contraseña")) {
               resp.sendRedirect("./index.html");
            }
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
    }
    
}
