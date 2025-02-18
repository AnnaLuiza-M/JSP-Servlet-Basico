package exercicioJavaWeb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProcessarNumeros")
public class ProcessarNumeros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		 
		int resultado = num1*num2;
		
		if(resultado < 50) {
			response.sendRedirect("https://www.google.com");
		}else {
			response.sendRedirect("https://www.ibahia.com");
		}
		
		
	}

}
