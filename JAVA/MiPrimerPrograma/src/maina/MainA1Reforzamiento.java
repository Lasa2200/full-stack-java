package maina;

public class MainA1Reforzamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package cl.coding.java.reforzamiento;

		public class Pitagoras {
			//double hipo = 0; //variable global, puede ser utilizada en todo el codigo
			static double gravedad = 9.8; //variable global estatica, no debe ser modificada
			static double pi = 3.14159;
			String nombre = "Clase Pitagoras";
			
			public void calculoHipotenusa(int catetoA, int catetoB) {
				
				double hipo= Math.sqrt(Math.pow(catetoA, 2)+ Math.pow(catetoB, 2));
				
				System.out.println("Dentro de la clase "+hipo);
			}
			
			public double calculo2Hipotenusa(int catetoA, int catetoB) {
				
				Integer numero1=12345;//variable de tipo local
				
				double hipo= Math.hypot(catetoA, catetoB);
				return hipo;
				
			}
			
			public double calculo3Hipotenusa(int catetoA, int catetoB) {
				
				return  Math.hypot(catetoA, catetoB);
				//return Math.sqrt(Math.pow(catetoA, 2)+ Math.pow(catetoB, 2));
			}
			
			EjerciciosBasicos eb = new EjerciciosBasicos();//invocacion
			
			//int[] arreglo = {1,5,10,-2};
			//eb.valoresAlCuadrado(arreglo);
			
			ArrayList<Integer> arreglo2 = new ArrayList<Integer>();
			arreglo2.add(1);
			arreglo2.add(5);
			arreglo2.add(10);
			arreglo2.add(7);
			arreglo2.add(-2);
			
			//eb.valoresAlCuadrado2(arreglo2);
			
			//eb.reemplazarNegativos(arreglo2);
			
			//eb.maxMinProm(arreglo2);
			
			eb.cambiarValorSiguiente(arreglo2);
			
		}

	}
			
		}

	}

}
