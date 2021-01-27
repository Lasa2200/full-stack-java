package CuentadeBanco2;

public class BankAccount2 {

	/*    La clase debe tener los siguientes atributos: (string) número de cuenta, (double) saldo cuenta corriente, 
	 (double) saldo cuenta de ahorros.
	Crear una variable (static) que contenga el número de cuentas creadas hasta el momento.
	Crear una variable (static) que rastree la cantidad de dinero almacenado en cada cuenta creada.
	Crear un método privado que retorne un número de 10 dígitos aleatorios para el número de cuenta.
	En el constructor, llamar al método privado anterior, así cada usuario tendrá un número de cuenta de 10 dígitos aleatorios.
	En el constructor, asegurarse de incrementar el contador de cuentas creadas.
	Crear un método getter para el saldo de la cuenta corriente del usuario.
	Crear un método getter para el saldo de la cuenta de ahorros del usuario.
	Crear un método que permita al usuario depositar dinero en su cuenta corriente o cuenta de ahorros, 
	asegúrese de aumentar el total de dinero almacenado.
	Crear un método para retirar dinero de una cuenta. No permita que retire dinero si tiene fondos insuficientes.
	Crear un método para ver el total de dinero en la cuenta corriente y en la cuenta de ahorros.
	Los usuarios no deberían poder configurar ningún atributo de la clase */

	private String numerocuenta;
    private double saldocorriente;
    private double saldoahorro;
    private static int cuentascreadas;
    private static int totaldinero;
    
    BankAccount2()
    {
        this.numerocuenta = generarCuenta();
        this.totaldinero += getSaldoahorro() + getSaldocorriente(); 
        this.cuentascreadas++;
    }

    private String generarCuenta()
    {
        String numero = "";

        for(int i=0; i<10;i++)
        {
            numero += Integer.toString((int) Math.random()*9);
        }

        return numero;
    }

    private double getSaldoahorro() {
        return saldoahorro;
    }
    private double getSaldocorriente() {
        return saldocorriente;
    }
    public void depositarAhorro(int cantidad)
    {
        System.out.println("cantidad a depositar: "+cantidad+" a la cuenta de Ahorro");
        saldoahorro += cantidad;
        totaldinero += cantidad;
    }

    public void depositarCorriente(int cantidad)
    {
        System.out.println("cantidad a depositar: "+cantidad+" a la cuenta Corriente");
        saldocorriente += cantidad;
        totaldinero += cantidad;
    }

    public void retirarAhorro(int cantidad)
    {
        System.out.println("cantidad a retirar: "+cantidad+" a la cuenta de Ahorro");

        if( saldoahorro - cantidad < 0 || saldoahorro == 0)
        {
            System.out.println("Saldo insuficiente para retiro");
        } 
        else
        {
            saldocorriente -= cantidad;
            totaldinero -= cantidad;
        } 
    }

    public void retirarCorriente(int cantidad)
    {
        System.out.println("cantidad a retirar: "+cantidad+" a la cuenta Corriente");

        if( saldocorriente - cantidad < 0 || saldocorriente == 0)
        {
            System.out.println("Saldo insuficiente para retiro");
        } 
        else
        {
            saldocorriente -= cantidad;
            totaldinero -= cantidad;
        } 
    }

    public void verSaldo()
    {
        System.out.println("saldo en cuenta de Ahorro: "+ getSaldoahorro());
        System.out.println("saldo en cuenta Corriente: "+ getSaldocorriente());
        System.out.println("total: "+ (getSaldoahorro() + getSaldocorriente()));

    }
}