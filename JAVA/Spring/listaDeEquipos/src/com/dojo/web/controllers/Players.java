package com.dojo.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dojo.web.models.Player;
import com.dojo.web.models.Roster;
import com.dojo.web.models.Team;

@WebServlet("/Players")
public class Players extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/new_player.jsp");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String age = request.getParameter("age");
		Integer age2 = Integer.valueOf(age);

		//Creado el player
		Player player = new Player();
		player.setName(firstname);
		player.setLastname(lastname);
		player.setAge(age2);
		//Agrega player a Team (Jugador al equipo)

		HttpSession session = request.getSession();
		String team_name = (String)session.getAttribute("team_name");

		Roster rosterSesion = (Roster) session.getAttribute("roster");
		ArrayList<Team> teamList = rosterSesion.getTeams();
		//Obtener el equipo a modificar y agregar jugador
		for (Iterator iterator = teamList.iterator(); iterator.hasNext();) {
			Team team = (Team) iterator.next();
			if(team.getTeam_name().equals(team_name)) {
				team.addPlayer(player);
			}

		}

		rosterSesion.setTeams(teamList);
		session.setAttribute("roster", rosterSesion);

		response.sendRedirect("Teams?id="+team_name);





	}

}
