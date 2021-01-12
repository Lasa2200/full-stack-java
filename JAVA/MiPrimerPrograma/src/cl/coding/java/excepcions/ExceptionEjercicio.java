package cl.coding.java.excepcions;

import java.util.ArrayList;

public class ExceptionEjercicio {

	public void manejoExcepciones(ArrayList<Object> myList) {
		
		for(int i = 0; i < myList.size(); i++) {
			try {
				 int castedValue = (int) myList.get(i);//(tipoDato) -> castear o convertir a
				 System.out.println(castedValue);
			} catch (Exception e) {
				System.out.println("mensaje de error: "+e);
			}
		   
		    //int cast2 = (int) Integer.parseInt((String) myList.get(i));
		   
		}
	}

}