package com.MiprimerPrograma.poo;

public class Auto {

	
	//Atributos
		private String marca;
		private String color;
		private Integer puertas;
	//Constructores
		
			//constructor vacio
		public Auto() {}
		
		//constructor con parametros
		public Auto(String marca, String color, Integer puertas) {
			super();
			this.marca = marca;
			this.color = color;
			this.puertas = puertas;
		}
	//Metodos
		private void metodo1() {
			//solo pudo acceder desde mi objeto
		}
		public void metodo2() {
			//cualquiera puede acceder
			this.metodo1();
		}
		protected void metodo3() {
			//Solo aquellas clases dentro 
			//del mismo package
		}
	//Getters and Setters
		
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public Integer getPuertas() {
			return puertas;
		}
		public void setPuertas(Integer puertas) {
			this.puertas = puertas;
		}
		
	}