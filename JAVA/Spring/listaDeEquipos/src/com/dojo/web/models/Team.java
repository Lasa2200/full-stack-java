package com.dojo.web.models;

import java.util.ArrayList;

public class Team {
	private String team_name;
	private ArrayList<Player> listPlayers = new ArrayList<Player>();
	private Integer num_players;

	public Integer getNum_players() {
		return num_players;
	}
	public void setNum_players(Integer num_players) {
		this.num_players = num_players;
	}
	public Team() {

	}
	public void addPlayer(Player player) {
		this.listPlayers.add(player);
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
