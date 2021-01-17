package com.javaOop;

public class MiObjeto {

		//atributos y metodos
		
		//todos los objetos tienen un constructor vacio

		//tipo(public, private, protected)
		//retorna un tipo de dato
		//nombre del metodo
		//recibe o no parametros
		
		private String createGreeting(String toBeGreeted){
		    return "Hola " + toBeGreeted;
		}
		//metodos llamados igual
		//Sobreescritura de metodos
		public String greet(){
		    return createGreeting("Mundo");
		}
		public String greet(String firstName, String lastName){
		    return createGreeting(firstName + " " + lastName);
		}
		public String greet(Integer num) {
			// TODO Auto-generated method stub
			return createGreeting(num.toString());
		}

		//desde otros package no pueden acceder
		protected void funcionDos() {
			System.out.println("protected .-..");
		}
	}

	
	
	
	

