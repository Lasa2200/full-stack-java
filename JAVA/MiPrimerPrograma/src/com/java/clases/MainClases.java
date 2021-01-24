package com.java.clases;

	public class MainClases {

		public static void main(String[] args) {
			//instancia de la clase
			Mascota mascota = new Mascota();
			System.out.println(mascota.getNombreDuenio());
			System.out.println("**********");
			//ingresando informacion al atributo
			mascota.setNombreDuenio("Alexis");
			//consultando el contenido del atributo
			System.out.println(mascota.getNombreDuenio());
			
			System.out.println("**********");
			//nueva instancia de mascota, con ambos parametros
			Mascota otraMascota = new Mascota("Isra",987654321);
			System.out.println(otraMascota.getNombreDuenio());
			System.out.println(otraMascota.getNumeroChip());
			System.out.println("**********");
			
			//nueva instancia, solo con chip
			Mascota mascota2 = new Mascota(23475676);
			System.out.println(mascota2.getNombreDuenio());
			System.out.println(mascota2.getNumeroChip());
			
			Gato tomas = new Gato("Isra",213456,"Angora",3);
			Gato felix = new Gato("Callejero",5);
			
			
			Gato cosmico = new Gato();
			cosmico.setNombreDuenio("Novita");
			cosmico.setNumeroChip(1234567);
			cosmico.setEdad(213);
			cosmico.setColor("Azul");
			System.out.println(cosmico.getNombreDuenio());
			
			Perro boby = new Perro();
			boby.setColor("Blanco");
		System.out.println(boby.getColor());
			
			//comming soon....
			Mascota mascotaPerro = new Perro();
		}

	}

