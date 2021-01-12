package cl.coding.java.excepcions;

import java.util.ArrayList;

public class MainException {

	public static void main(String[] args) {
		// Creando mi arreglo
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add(48);
		myList.add("14");
		myList.add("15");		
		myList.add(33);
		

		//instancia de la clase
		ExceptionEjercicio ee = new ExceptionEjercicio();
		//llamando o usando el metodo o funcion
		ee.manejoExcepciones(myList);
	}

}
