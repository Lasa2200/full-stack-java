package com.javaOop;

public class mainOop {

	public static void main(String[] args) {
				//instancia o invocacion
				MiObjeto miObjeto = new MiObjeto();
				
				String retorno = miObjeto.greet();
				
				System.out.println(retorno);
				
				String retorno2 = miObjeto.greet("Coding", "Ninja");
				System.out.println(retorno2);
				Integer num = 7;
				String retorno3 = miObjeto.greet(num);
				System.out.println(retorno3);
				//private
				miObjeto.otraFuncion();
				
				Integer ret = miObjeto.funcionInteger();
				
				miObjeto.funcionDos();
				
	
	}

}
