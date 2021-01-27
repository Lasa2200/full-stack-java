package com.codingdojo.web.simpleproject;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Principal
 */
@WebServlet("/Principal")
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Principal() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");	
		String apellido = request.getParameter("apellido");	
		//System.out.println(nombre);
		if(nombre ==null || nombre == "") {
			nombre ="Unknown";
			
		}
			if ( apellido == null|| nombre=="") {
				apellido="Unknown";
			
			//System.out.println("Unknown");
		}
		response.getWriter().append("nombre="+nombre+" apellido="+apellido);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
