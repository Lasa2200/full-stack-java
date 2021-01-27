package cuentadeBanco;


public class BankTester {

	public static void main(String[] args) {

		BankAccount cuenta1 =new BankAccount ();
		System.out.println("Nuemero de cuenta Corriente: " +cuenta1.getNumeroDeCuenta());
		double deposito= 100;
		System.out.println("Deposito en Cta Cte: "+ deposito);
		System.out.println("Saldo cuenta Corriente: "+cuenta1.depositoCtaCte(deposito));
		double giro=50;
		System.out.println("Giro Cta Cte: " + giro);
		//System.out.println("Saldo cuenta Corriente: "+ cuenta1.;

		System.out.println("**************");

		BankAccount cuenta2 =new BankAccount ();
		System.out.println("Nuemero de cuenta de Ahorro: " +cuenta2.getNumeroDeCuenta());
		double deposito1= 350;
		System.out.println("Deposito cuenta Ahorro: "+cuenta2.depositoCtaCte(deposito1));
		System.out.println("Saldo cuenta Ahorro: "+cuenta2.depositoCtaAhorro(deposito1));
		double giro1=450;
		System.out.println("Giro Cta Cte: " + giro1);
		System.out.println("Saldo cuenta de Ahorro: "+ cuenta2.giroCtaAhorro(giro));

		System.out.println("************");
		System.out.println("Saldo Total  en Banco: " +BankAccount.saldoEnCuenta);

	}




}
