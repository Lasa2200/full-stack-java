package cuentadeBanco;

import java.util.ArrayList;
import java.util.Random;

//atributos: (string) número de cuenta, (double) saldo cuenta corriente, (double) saldo cuenta de ahorros.
public class BankAccount {

	// atributos
	private String numerDeCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentadeAhorro;
	private static int cuentasCreadas =0;
	private static double saldodinero=0;
	
	// constructor
	public BankAccount() {
		super();
	}
	public BankAccount(String numerDeCuenta, double saldoCuentaCorriente, double saldoCuentadeAhorro) {
		super();
		this.numerDeCuenta = numerDeCuenta;
		this.saldoCuentaCorriente = saldoCuentaCorriente;
		this.saldoCuentadeAhorro = saldoCuentadeAhorro;
	}
	//  metodo
	//Crear un método privado que retorne un número de 10 dígitos aleatorios para el número de cuenta.
	

	public void numeroAleatorioCuenta() {
		for (int i = 0; i < 10; i++) {//  obtener solo 10 numeros
			int  numeroAleatorio = (int) (Math.random()*(9))+0;
			System.out.println(numeroAleatorio);
	}
	}
	

//  pj.cadenaAleatoria(mezclarAbecedario);



		// sett y gett
		public String getNumerDeCuenta() {
			return numerDeCuenta;
		}
		public void setNumerDeCuenta(String numerDeCuenta) {
			this.numerDeCuenta = numerDeCuenta;
		}
		public double getSaldoCuentaCorriente() {
			return saldoCuentaCorriente;
		}
		public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
			this.saldoCuentaCorriente = saldoCuentaCorriente;
		}
		public double getSaldoCuentadeAhorro() {
			return saldoCuentadeAhorro;
		}
		public void setSaldoCuentadeAhorro(double saldoCuentadeAhorro) {
			this.saldoCuentadeAhorro = saldoCuentadeAhorro;
		}


	}
