package maina;




		

		import java.util.Scanner;

		public class MainA {

			//metodo (funcion) inicial
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				//variables primitivas (minusculas)
				char char1 = 1;
				String str1= "";
				int numero1=1; // 2^31
				
				Integer numero2 = 2;
				Integer numero3 = 3;
				String sNumero2 = numero2.toString();
				
				String concatenar= numero2.toString() + numero3.toString();//caracteres
				Integer suma = numero2+ numero3;
				
				System.out.println(concatenar);//"23" como String
				System.out.println(suma);//5
				
				//
				Integer numero_uno_integer = 1;
				String numero_uno_caracter = "1";
				String numero_uno_texto = "uno";

				
				//instancia a scanner
				Scanner sc = new Scanner(System.in);
				
				//crear una variable que recibira el dato ingresado por el usuario
				System.out.println("Ingrese cateto A");
				int catetoA = sc.nextInt();
				System.out.println("Ingrese cateto B");
				int catetoB = sc.nextInt();
				
				
				System.out.println("valor recibido:"+catetoA+ " "+ catetoB);
				
				//INSTANCIA DE LA CLASE
				//llamado a una clase, para acceder a sus metodos(funciones)
				//y atributos
				
				Pitagoras munrra = new Pitagoras();//nueva invocacion de la clase Pitagoras
				
				//int catetoA = 3;
				//int catetoB = 4;
				
				//llamando a la funcion sin obtener un retorno
				munrra.calculoHipotenusa(catetoA, catetoB);
				
				package cl.coding.java.ejerciciosbasicos;

				import java.util.ArrayList;
				import java.util.Collections;

				public class EjerciciosBasicos {
					/*
					Dado cualquier arreglo x, digamos [1,5,10,-2]
					escribir un método que multiplique cada valor en el arreglo por sí mismo. 
					Cuando el método haya terminado, 
					el arreglo x debe contener valores que han sido elevados al cuadrado, digamos [1,25,100,4].*/
					
					public void valoresAlCuadrado(int[] arreglo) {
						//para recorrer y asignar el nuevo valor
						for (int i = 0; i < arreglo.length; i++) {
							
							arreglo[i] = (int) Math.pow(arreglo[i], 2);
						}
						//solo se imprimira la asignacion de memoria, no se mostrará el detalle del arreglo
						System.out.println("int[] arreglo  "+arreglo);
						
						//recorrer el for para imprimir los elementos
						for (int i = 0; i < arreglo.length; i++) {
							System.out.println("elemento: "+arreglo[i]);
						}
						
					}
					
					public void valoresAlCuadrado2( ArrayList<Integer> arreglo) {
						for (int i = 0; i < arreglo.size(); i++) {
							
							arreglo.set(i, (int) Math.pow(arreglo.get(i), 2));
							//arreglo.set(index, element);
							//arreglo.get(index);
						}
						System.out.println("ArrayList<Integer> arreglo "+arreglo);
					}
					
					/*Dado un arreglo x, digamos [1,5,10,-2],
					 *  escribir un método que reemplace cualquier número negativo por 0. 
					 * Cuando el método haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].*/
					
					public void reemplazarNegativos(ArrayList<Integer> arreglo) {
						
						for (int i = 0; i < arreglo.size(); i++) {
							if(arreglo.get(i) < 0) {//validamos si es negativo
								arreglo.set(i, 0);
							}
						}
						System.out.println("resultado: "+arreglo);
						
					}
					
					/*Dado un arreglo x, digamos [1,5,10,-2], 
					 * escribir un método que devuelva un arreglo con el número máximo, 
					 * el número mínimo y el valor promedio que hay en el arreglo x. 
					 * El arreglo devuelto debe contener solo 3 valores [Max, Min, Prom].*/
					
					public void maxMinProm(ArrayList<Integer> arreglo) {
						
						ArrayList<Integer> mmp = new ArrayList<Integer>();
						Integer maximo = arreglo.get(0);
						Integer minimo = arreglo.get(0);
						Integer suma = 0;
						
						for (int i = 0; i < arreglo.size(); i++) {
							
							if(arreglo.get(i)> maximo) {
								//maximo = arreglo[i]
								maximo = arreglo.get(i);
							}
							
							if(arreglo.get(i)< minimo) {
								minimo = arreglo.get(i);
							}
							suma = suma + arreglo.get(i);
						}
						
						//promedio = suma/cantidad
						double promedio = suma / arreglo.size();
						//agregar al nuevo arreglo
						mmp.add(maximo);
						mmp.add(minimo);
						mmp.add((int) promedio);// cast por el tipo de arreglo (Integer)
						
						System.out.println("arreglo final: "+mmp);
						//Collections.max(arreglo);
						//Collections.min(arreglo);
					
					}
					
					/*Dado un arreglo x, digamos [1,5,10,7,-2], 
					 * escribir un método que cambie cada valor por el valor que sigue.
					 * Por ejemplo, cuando el método haya terminado, 
					 * un arreglo x [1,5,10,7,-2] se convertirá en [5,10,7,-2,0]. 
					 * Observe que el último número es 0. 
					 * El método no necesita ajustarse para los valores que están fuera de los límites.*/
					
					public void cambiarValorSiguiente(ArrayList<Integer> array) {
						//arreglo[arreglo.length-1]
						//array.get(array.size()-1); //ultimo elemento (5-1 = 4)
						
						for (int i = 0; i < array.size(); i++) {
							//ejemplo array.set(0, array.get(1));
							//ultima posicion(array.size()-1) == al indice (i)
							if(array.size()-1 == i) {
								array.set(i, 0); //arreglo.set(posicion,valor a agregar);
							}else {
								array.set(i, array.get(i+1));
							}
						}
						
						System.out.println("mi arreglo nuevo: "+array);
					}
					
					
				
	}

}
