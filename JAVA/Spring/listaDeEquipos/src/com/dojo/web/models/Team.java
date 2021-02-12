package com.dojo.web.models;

import java.util.ArrayList;

public class Team {
	private String team_name;
	private ArrayList<Player> listPlayers;
	
	public Team() {

	}


	public Team(String team_name) {
		this.team_name = team_name;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public ArrayList<Player> getPlayer() {
		return listPlayers;
	}

	public void setPlayer(ArrayList<Player> listPlayers) {
		this.listPlayers = listPlayers;
	}

}
