package calculadora;

public class Calculadora {
	
	private double num1;
	private double num2;
	private String signo;
	private double resultado;
	
	public Calculadora(double num1,String signo,double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.signo = signo;
	}
	
	public void performOperation() {
		if(signo=="+") {
			resultado=num1+num2;
		}
		if(signo=="-") {
			resultado=num1-num2;
		}
	}
	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
}