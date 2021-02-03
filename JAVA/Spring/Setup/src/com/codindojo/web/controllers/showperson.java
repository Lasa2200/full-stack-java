package com.codindojo.web.controllers;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.web.models.Person;

@WebServlet("/showperson")
public class showperson extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public showperson() {// no nombrar igual que el models
		super();
	}

	public class ShowPerson extends HttpServlet {
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// Procesar la solicitud
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			// Crear el modelo
			Person person = new Person(name, age);
			// Establecer el modelo para la vista
			request.setAttribute("person", person);
			// Permita que la vista maneje la solicitud 
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/showPerson.jsp");
			view.forward(request, response);
		}
	}    


}

