package Cadenas;

public class StringManipulatorTesting {
	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();// creando un nuevo StringManipulator
//		manipulator.trimAndConcat(" Hola  ","  Mundo    ");
		//System.out.println(manipulator.trimAndConcat(" Hola ", " Mundo   "));
//		
//		char letter = 'n';
//		int a = manipulator.getIndexOrNull("Coding", letter);
//		int b = manipulator.getIndexOrNull("Hola Mundo", letter);
//		int c = manipulator.getIndexOrNull("Saludar", letter);
//		System.out.println(a); // 4
//		System.out.println(b); // 7
//		System.out.println(c); // -1
	
	
	StringManipulator manipulator1 = new StringManipulator();
	String word = "Hola";
	String subString = "la";
	String notSubString = "mundo";
	int d = manipulator.getIndexOrNull2(word,subString);
	int e = manipulator.getIndexOrNull2(word,notSubString);
		System.out.println(d);// 2
		System.out.println(e); // -1


		//StringManipulator manipulator2 = new StringManipulator();
		String f = "Hola";
		int g = 1;
		int h= 3;
		String i ="Mundo";
		   String word1 = manipulator.concatSubstring(f,g,h,i);
		   System.out.println(word1 +i); // olmundo
		   
		   
	}//no borrar llave de main
		
}// no borrar
