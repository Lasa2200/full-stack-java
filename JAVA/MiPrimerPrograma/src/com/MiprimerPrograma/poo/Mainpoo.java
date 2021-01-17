package com.MiprimerPrograma.poo;
import java.util.Scanner;
public class Mainpoo {

			public static void main(String[] args) {
				//permite capturar desde teclado
				Scanner sc = new Scanner(System.in);
				//instancia
				Auto auto = new Auto();//() constructor vacio

				//acceder a atributos y metodos
				auto.metodo2();//publica
				auto.metodo3();//protected
				
				//obtener dato de mi variable
				System.out.println(auto.getMarca());
				
				//agregando a mi variable del objeto
				auto.setMarca("Audi");
				auto.setColor("Verde");
			
				
				//obtener dato de mi variable
				System.out.println("marca: "+auto.getMarca());
				System.out.println("color: "+auto.getColor());
				
				System.out.println("Ingrese color del auto");
				String color = sc.nextLine();//capturando el dato ingresado
				
				auto.setColor(color);//sobre escribiendo la variable
				System.out.println("color2: "+auto.getColor());
				
				System.out.println("Ingrese cantidad de puertas");
				Integer cantPuertas = sc.nextInt();
				auto.setPuertas(cantPuertas);
				
				System.out.println("Ingresa marca del auto");
				String marca = sc.next();
				auto.setMarca(marca);
				
				//obtener informacion con get
				System.out.println("Marca:"+auto.getMarca());
				System.out.println("Color:"+auto.getColor());
				System.out.println("cantidad puertas:"+auto.getPuertas());
			

			/****
			 * **/
			//Nueva instancia de clase
			//definiendo los valores por defecto 
			// de los atributos
			Auto auto2 = new Auto("Toyota","Blanco",5);
			
			System.out.println("Marca auto2:"+auto2.getMarca());
			
			//nueva instancia
			Auto car = new Auto("Nissan","Negro",5);
			System.out.println(car.getMarca() +" "+car.getColor());
			
			Auto car2 = new Auto();
			System.out.println("Ingrese otra marca de auto");
			car2.setMarca(sc.next());
			System.out.println(car2.getMarca());
		}
			
			
//			
//			
//			//public void remove() {
//			Node runner = this.head;
//			if(validarVacio()) {
//				System.out.println("Nodo vacio");
//				return;
//			}
//			 while(runner.next.next != null) {
//	             runner = runner.next;
//	         }
//			 runner.next = null;
//		}
//		public void printValues() {
//			if(validarVacio()) {
//				System.out.println("Nodo vacio");
//				return;
//			}
//			Node runner = this.head;
//			 while(runner.next != null) {
//				 System.out.println(runner.value);
//				 System.out.println(runner.next.value);
//	             runner = runner.next;
//	             
//	         }
//			
//		}
//		public boolean validarVacio() {
////			if(this.head == null) {
////				return true;
////			
////			}else {
////				return false;
////			}
//			
//			return this.head == null;
//			
//		}

}	
		
