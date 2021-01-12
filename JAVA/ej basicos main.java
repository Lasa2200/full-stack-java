basicos ej 8



import java.util.Scanner;

public class MainB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		EjerciciosBasicos ejercicoBasico = new EjerciciosBasicos();//invocacion
		
		int[] arreglo = {1,3,5,7};

		System.out.println("ingrese el valor a comparar:");
		int y = sc.nextInt();
		//ArrayList es con []
		int resultado = ejercicoBasico.retornoValor(arreglo, y);
		System.out.println("la cantidad de mayores es: "+resultado);
		
		ArrayList<Integer> arreglo2 = new ArrayList<Integer>();
		arreglo2.add(1);
		arreglo2.add(3);
		arreglo2.add(5);
		arreglo2.add(7);
		arreglo2.clear();
		
		int resultado2 = ejercicoBasico.retornoValor2(arreglo2, y);
		System.out.println("la cantidad 2 de mayores es: "+resultado2);
		
	}

}