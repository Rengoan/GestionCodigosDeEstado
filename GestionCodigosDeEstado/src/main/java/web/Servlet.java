package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws IOException{
        
        //Simular el valor de usuario y password
        String usuario_ok = "JLES";
        String password_ok = "1234";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        //Realizamos las validaciones
        
        if (usuario_ok.equals(usuario) && password_ok.equals(password)) {
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("</h1>");
            out.print("<br>Usuario: "+ usuario);
            out.print("<br>Password: "+ password);
        }else{
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Las credenciales no"
            +"introducidos no son correctas, acceso denegado");
        }
            }
        
        
    
    
    
}
