package com.dojo.web.models;

import java.util.ArrayList;

public class Roster {
	private ArrayList<Team> teams = new ArrayList<Team> ();

	public Roster() {
	}

	public Roster(ArrayList<Team> teams) {
		this.teams = teams;

	}

	public void addTeam(Team team) {
		this.teams.add(team);
	}

	public ArrayList<Team> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}

}
