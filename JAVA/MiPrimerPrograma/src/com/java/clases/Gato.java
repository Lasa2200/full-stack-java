package com.java.clases;


public class Gato extends Mascota{
	
	private String raza;
	private Integer edad;
	//
	
	
	public Gato() {
	
	}

	public Gato(String raza, Integer edad) {
		super();
		this.raza = raza;
		this.edad = edad;
	}

	public Gato(String nombreDuenio, Integer numeroChip, String raza, Integer edad) {
		super(nombreDuenio, numeroChip);
		this.raza = raza;
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
}
