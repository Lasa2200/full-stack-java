package com.dojo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dojo.web.models.Roster;
import com.dojo.web.models.Team;


@WebServlet("/Teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/new_team.jsp");
        
		view.forward(request, response);
		
        
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Roster roster;
		//Obtenido la sesion
		HttpSession session = request.getSession();
		Roster rosterSesion = (Roster) session.getAttribute("roster");
		//Obtenido los campos del formulario
		String teamname = request.getParameter("teamname");
		//Crear Roster(Lista de equipos)
		//primera vez que entro
		if(rosterSesion==null) {
			roster = new Roster();
		}
		else {//la segunda vez
			roster = rosterSesion;
		}
			
	
		//Creamos equipo
		Team team = new Team();
		team.setTeam_name(teamname);
		//Agregamos el team al roster (equipo->lista de equipos)
		roster.addTeam(team);
		//Guardamos en la sesion el roster con el equipo creado
		session.setAttribute("roster", roster);
		
		
		
		//Vamos a la index
		 response.sendRedirect("Home");
		//RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		//view.forward(request, response);
		
		
		
	}

}
