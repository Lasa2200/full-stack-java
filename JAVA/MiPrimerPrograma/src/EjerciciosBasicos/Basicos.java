package EjerciciosBasicos;
import java.util.ArrayList;
import java.util.Iterator;
public class Basicos {

//1.-Escriba un método que imprima todos los número del 1 al 255.
	void Imprim() {
		for (int a=1;a<=255;a++) {
			System.out.println(a);
			//return Imprim;
		}

	}
//2.-Imprimir los Números Impares Entre 1 - 255
	void Impar() {
		for (int a=1;a<=255;a+=2) {
			System.out.println(a);
			//return Impar;
		}
}
//3.-Escriba un método que imprima los números desde el 0 hasta el 255, 
//pero esta vez muestre también las suma de los números que ha mostrado 
//en pantalla hasta ahora. Por ejemplo, su salida debe ser algo como esto:
	void  ImpSum() {
		int sum =0 ;
		for (int a=0;a<=255;a++) {
			  sum+=a;// resumido sum =sum +a
			System.out.println("nuevo numero :" +a+" "+ "Suma:" +sum);//return suma;
		}
	}
			
//4.-Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un método que
//recorra cada uno de los elementos del arreglo e imprima cada valor.
//Ser capaz de recorrer cada elemento de un arreglo es extremadamente importante.
	
	void Arreglo() {
		int Arr[] ={1,3,5,7,9,13};
		for (int a=0; a < Arr.length; a++) {
			System.out.println(Arr[a]);
		}
	}
//5.-Escribir un método que tome un arreglo e imprima el valor máximo en el arreglo.
//Su método debería funcionar también con todos los números en negativo 
	//(ejemplo [-3,-5,-7]), o incluso una mezcla de números positivos,
	//números negativos y cero.
	void arrImprim() {// int para crear un return, siempre comienza con minuscula
		int max= 0;
		int arreglo[]= {-3,-5,-7};
		max=arreglo[0];// asignando valor al arreglo, primer numero del arreglo
		for ( int a=0; a < arreglo.length; a++) {
			if (max  < arreglo[a]) {
				max= arreglo[a];
			}
		}
		System.out.println(max);
	}
	
//6.-Obtener el Promedio
//Escribir un método que tome un arreglo e imprima el promedio de los valores en el arreglo. 
//Por ejemplo en un arreglo hay [2,10,3], su método debería Imprimir “Promedio de 5”. 
//Nuevamente, asegúrese de crear un caso simple y escriba las instrucciones para resolver 
//ese caso primero, luego pruebe sus instrucciones con casos más complicados.
	
	int promedio() {// nombre de la clase "promedio"
	int prom=0;
	int sum=0;
	int arreglo[]={2,10,3};
	prom= arreglo[0];
	for(int a=0; a < arreglo.length; a++) {
		sum= sum + arreglo[a];
	}
	prom =sum/arreglo.length;
	//System.out.println(prom);
	return prom;
	
	}
//7.-Arreglo con Números Impares
//Escribir un método que cree un arreglo ‘y’ que contenga todos los números 
//impares entre 1 - 255. Cuando el método haya terminado, ‘y’
//debe tener los valores de [1,3,5,7…255].
	
	int[] arregloImpar() {// uso de primitivo "int"
	int[]arreglo_y = new int[255];
	int indice=0;
	for (int a=1;a<=255;a++) {
		if(a%2!=0){ 
            arreglo_y[indice]= a;
            indice++;
        }
	}
	return arreglo_y;
	}
	
	ArrayList<Integer> arregloImpar_v2() {// uso de  objetos "Integer"
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int a=1;a<=255;a++) {
			if(a%2!=0){ 
				list.add(a);
	        }
		}
		return list;
		}
//8.-Mayor que Y
//Escribir un método que tome un arreglo y devuelva el número de valores mayores a un valor Y dado.
//Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3, después de terminar 
//el proceso el método debe Imprimir el número 2 (ya que hay 2 valores en el arreglo 
//que son mayores que 3).
	
	   
	    public int retornoValor(int[] arreglo,int y) {
			int cantidadMayores = 0; //acumuladora o contadora
			
			for(int i=0 ; i < arreglo.length; i++) {
				if(arreglo[i] > y) {
					cantidadMayores = cantidadMayores + 1;
				}
			}
			
			return cantidadMayores;

	    }


	     public int retornoValor2(ArrayList<Integer>arreglo,int y){
	    	  int cantidadMayores=0;//acumuladora contadora
	    	  
	    	  for(int i=0; i<arreglo.size();i++) {
	    		 
	    		  if(arreglo.get(i) > y) {// se accede por posicion 
						cantidadMayores = cantidadMayores + 1;
					}
	    	  }
	     
	     return cantidadMayores;
}
    
	 
//9.-Valores al Cuadrado
//Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un método que multiplique
//cada valor en el arreglo por sí mismo. Cuando el método haya terminado, el arreglo x
//debe contener valores que han sido elevados al cuadrado, digamos [1,25,100,4].
	
	     public void retornoCuadrado(int[] arreglo) { // trabajar con arreglos
	    	 for (int i = 0; i < arreglo.length; i++) {
				 arreglo[i] = (int) Math.pow(arreglo[i],2);//
			}
	    	System.out.println("int[] arreglo"+arreglo);
	     
	    	for (int i = 0; i < arreglo.length; i++) {
				System.out.println("elemento: "+arreglo[i]);
			}
	     }
	     
	     public void retornoCuadrado2(ArrayList<Integer>arreglo) {
	    	 for (int i=0; i<arreglo.size();i++) {
	    		arreglo.set(i,(int)Math.pow(arreglo.get(i),2));
				
			}
	    	 System.out.println("ArrayList<Integer"+ arreglo);
	     }
	     
	     

	
//10.-Eliminar Números Negativos
//Dado un arreglo x, digamos [1,5,10,-2], escribir un método que reemplace cualquier número negativo 
//por 0. Cuando el método haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].
	
	     
	     public void reemplazarNegativos(ArrayList<Integer> arreglo) {
				
				for (int i = 0; i < arreglo.size(); i++) {
					if(arreglo.get(i) < 0) {//validamos si es negativo
						arreglo.set(i, 0);
					}
				}
				System.out.println("resultado: "+ arreglo);
				
			}
			
	
	     
	     
	     
//11.-Mínimo, Máximo y Promedio
//Dado un arreglo x, digamos [1,5,10,-2], escribir un método que devuelva un arreglo con el número máximo,
//el número mínimo y el valor promedio que hay en el arreglo x. El arreglo devuelto debe 
//	contener solo 3 valores [Max, Min, Prom].	
	
	     public void maxMinProm(ArrayList<Integer>arreglo) {
	    	 	ArrayList<Integer> mmp = new ArrayList<Integer>();
	    	 	Integer maximo = arreglo.get(0);
	    	 	Integer minimo = arreglo.get(0);
	    	 	Integer suma =0;
	    	 for (int i = 0; i < arreglo.size (); i++) {
	    		 if (arreglo.get(i)> maximo) {
	    			 maximo= arreglo.get(i);
	    		 }
				if (arreglo.get(i)< minimo) {
					minimo= arreglo.get(i);
					minimo = arreglo.get(i);
				}
				suma= suma + arreglo.get(i);
			}
	    	 double promedio= suma/ arreglo.size ();//promedio = suma/cantidad
				//agregar al nuevo arreglo
				mmp.add(maximo);
				mmp.add(minimo);
				mmp.add((int) promedio);// cast por el tipo de arreglo (Integer)
				
				System.out.println("arreglo final: "+mmp);
	    	 
	     }
	     
	   
//12.-Cambiando los Valores del Arreglo
//Dado un arreglo x, digamos [1,5,10,7,-2], escribir un método que cambie cada valor
//por el valor que sigue. Por ejemplo, cuando el método haya terminado,
//un arreglo x [1,5,10,7,-2] se convertirá en [5,10,7,-2,0]. Observe que el último número 
//es 0. El método no necesita ajustarse para los valores que están fuera de los límites.	
	     
	     public void cambiarValorSiguiente (ArrayList<Integer>arreglo) {
	    	//arreglo[arreglo.length-1]
				//array.get(array.size()-1); //ultimo elemento (5-1 = 4)
				
				for (int i = 0; i < arreglo.size(); i++) {
					//ejemplo array.set(0, array.get(1));
					//ultima posicion(array.size()-1) == al indice (i)
					if(arreglo.size()-1 == i) {
						arreglo.set(i, 0); //arreglo.set(posicion,valor a agregar);
					}else {
						arreglo.set(i, arreglo.get(i+1));
					}
				}
				
				System.out.println("mi arreglo nuevo: "+arreglo);
			}
	    	 
	     
	     
	     
	     

}//NO BORRAR





