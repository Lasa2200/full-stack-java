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

import com.dojo.web.models.Roster;
import com.dojo.web.models.Team;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Obtenemos la sesion
		HttpSession session = request.getSession();
		//Obtenermos el roster(lista de equipos)
		Roster roster = (Roster) session.getAttribute("roster");
		//Creamos una lista de equipos
		ArrayList<Team> teamList = new ArrayList<Team> ();
		if(roster!=null) {
			teamList = roster.getTeams();
			for (Iterator iterator = teamList.iterator(); iterator.hasNext();) {
				Team team = (Team) iterator.next();
				team.setNum_players(team.getPlayer().size());

			}
			request.setAttribute("teamList",teamList);

		}
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
