package com.javaFun.ejercicio;

public class MiMain {

	public static void main(String[] args) {
		//variables primitivas
		char letra = 'a';
		int numero = 1;
		double dDouble = 1.1d;
		
		Integer iNumero = 4;
		String sLetra = "UnString";
		String sUno_texto ="uno";
		String sUno_numero ="1";
		Integer iUno_numero = 1;
		
		String sNumeros_1a5 = "12345";
		String sVocales = "aeiou";
	
		//instancia de la clase
		Funciones fun = new Funciones();

		fun.mesclarArreglo(sNumeros_1a5);
		
		String [] listas = {"dato1","dato2","dato3"};
		System.out.println(listas[0]);
		System.out.println(listas.length);
	}

}
