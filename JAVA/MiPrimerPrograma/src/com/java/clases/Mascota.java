package com.java.clases;

public class Mascota {
	//Atributos
	private String nombreDuenio;
	private Integer numeroChip;
	private String color;
	
	//Constructores
	public Mascota() {
		//super();
	}
	public Mascota( Integer numeroChip) {
		super();
		this.numeroChip = numeroChip;
	}
	public Mascota(String nombreDuenio, Integer numeroChip) {
		super();
		this.nombreDuenio = nombreDuenio;
		this.numeroChip = numeroChip;
	}
	//Metodos

	//Setter and Getters
	//get es para obtener
	//set para ingresar/agregar/poner
	public String getNombreDuenio() {
		return nombreDuenio;
	}

	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}
	public Integer getNumeroChip() {
		return numeroChip;
	}
	public void setNumeroChip(Integer numeroChip) {
		this.numeroChip = numeroChip;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
