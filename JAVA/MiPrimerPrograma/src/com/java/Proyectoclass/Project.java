package com.java.Proyectoclass;

public class Project {

	//atributos
	private String nombre;
	private String descripcion;

	//constructores
	public Project() {

	}
	public Project(String nombre) {

		this.nombre = nombre;
	}

	public Project(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	// metodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public void elevatorPich () {
		System.out.println(this.nombre + ":"+ this.descripcion);
	}


}


