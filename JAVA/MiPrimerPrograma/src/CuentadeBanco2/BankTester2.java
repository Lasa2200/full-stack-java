package CuentadeBanco2;

public class BankTester2 {
		  
			   public static void main(String[] args) {
			        BankAccount2 cuenta1 = new BankAccount2();
			        BankAccount2 cuenta2 = new BankAccount2();
			        BankAccount2 cuenta3 = new BankAccount2();

			        cuenta1.depositarAhorro(30);
			        cuenta1.verSaldo();
			        cuenta2.retirarCorriente(5);
			        cuenta2.verSaldo();
			        cuenta3.depositarCorriente(60);
			        cuenta3.verSaldo();
			    }
			}