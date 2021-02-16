package com.dojo.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dojo.web.models.Player;
import com.dojo.web.models.Roster;
import com.dojo.web.models.Team;

@WebServlet("/DeletePlayers")
public class DeletePlayers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String name_player = request.getParameter("id");
		String team_name = request.getParameter("team_name");


		Roster rosterSesion = (Roster) session.getAttribute("roster");
		ArrayList<Team> teamList = rosterSesion.getTeams();
		ArrayList<Player> playersList = new ArrayList<Player>();
		int posicion;
		//Obtener el equipo a modificar y agregar jugador
		for (Iterator iterator = teamList.iterator(); iterator.hasNext();) {
			Team team = (Team) iterator.next();
			if(team.getTeam_name().equals(team_name)) {
				playersList = team.getPlayer();
				for(int i = 0;i<playersList.size();i++) {
					Player player = (Player)playersList.get(i);
					if(player.getName().equals(name_player)) {

						playersList.remove(i);

					}
				}
				team.setPlayer(playersList);


			}


		}
		rosterSesion.setTeams(teamList);
		session.setAttribute("roster", rosterSesion);
		response.sendRedirect("Teams?id="+team_name);



	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
