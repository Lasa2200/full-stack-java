package calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora act1=new Calculadora(10.5, "+", 5.2);
		act1.performOperation();
		System.out.println(act1.getResultado());
		
		Calculadora act2=new Calculadora(27, "-", 26);
		act2.performOperation();
		System.out.println(act2.getResultado());
	}
}





