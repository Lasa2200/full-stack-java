package Rompecabeza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class PuzzleJavaMain {

	public static void main(String[] args) {
		PuzzleJava pj =new PuzzleJava();// instanciar la clase pj clase a llamar
		 ArrayList<Integer> numeros = new ArrayList<Integer>();// invocacion ej1
		 	numeros.add(3);
		 	numeros.add(5);
		 	numeros.add(1);
		 	numeros.add(2);
		 	numeros.add(7);
		 	numeros.add(9);
	        numeros.add(8);
	        numeros.add(13);
	        numeros.add(25);
	        numeros.add(32);
	        ArrayList<String> arreglo = new ArrayList<String>(); //ej2
	        arreglo.add("Nancy");
	        arreglo.add("Jinichi");
	        arreglo.add("Fujibayashi");
	        arreglo.add("Momochi");
	        arreglo.add("Ishikawa");
	       
	            ArrayList<String> mezclarAbecedario =new ArrayList<String>();// ej3.-
	            mezclarAbecedario.add("A");
	            mezclarAbecedario.add("B");
	            mezclarAbecedario.add("C");
	            mezclarAbecedario.add("D");
	            mezclarAbecedario.add("E");
	            mezclarAbecedario.add("F");
	            mezclarAbecedario.add("G");
	            mezclarAbecedario.add("H");
	            mezclarAbecedario.add("I");
	            mezclarAbecedario.add("J");
	            mezclarAbecedario.add("K");
	            mezclarAbecedario.add("L");
	            mezclarAbecedario.add("M");
	            mezclarAbecedario.add("N");
	            mezclarAbecedario.add("Ñ");
	            mezclarAbecedario.add("O");
	            mezclarAbecedario.add("P");
	            mezclarAbecedario.add("Q");
	            mezclarAbecedario.add("R");
	            mezclarAbecedario.add("S");
	            mezclarAbecedario.add("T");
	            mezclarAbecedario.add("U");
	            mezclarAbecedario.add("V");
	            mezclarAbecedario.add("W");
	            mezclarAbecedario.add("X");
	            mezclarAbecedario.add("Z");
	            
//	            ArrayList<String> abc= new ArrayList<String>(); para no ocupar .add y crear letra a letra
//	            
//	            char[] abecedario =new char[26];
//	    		for ( int i=0; i<26; i++) {
//	    			char letra = (char) ('A' + i );
//	    			abecedario[i]=letra;
//	    			String letraString = Character.toString(letra);
//	    			abc.add(letraString);
//	    		}
	           
	            //pj.mezclarLetras(mezclarAbecedario);//pj esta dentro de otra clase ej3.-
	            //pj.numeroAleatorio3(); // ej4.-
	            //pj.numeroAleatorio5(); //ej5.-
	            
	            //pj.cadenaAleatoria(mezclarAbecedario);// ej6.-
	            pj.arregloAleatoria();// ej 7.-
	         
	            
	            }
	        
	        
	       // System.out.println(pj.imprimeSuma(numeros));
	       // System.out.println(pj.imprimNombre(arreglo));

	       // Collections.shuffle(numeros);
//	        System.out.println(numeros); // [5, 4, 3, 2, 1]
//	        Collections.sort(numeros);
//	        System.out.println(numeros); // [1, 2, 3, 4, 5]
//	                
        Random r = new Random();
//	        System.out.println(r.nextInt()); // Sin límites
//	        System.out.println(r.nextInt(5)); // Con límites entre 0 y 5
	    }
	


