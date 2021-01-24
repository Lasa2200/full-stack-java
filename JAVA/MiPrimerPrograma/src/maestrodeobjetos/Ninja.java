package maestrodeobjetos;


public class Ninja extends Human{
	public Ninja() {
		super(3,10,3,100D);
	}

	public void steal(Human vistima) {
		/*Ninja: Agregar un método steal(Human) que roba 
		la cantidad de puntos que tenga el Ninja en stealth 
		de la salud del otro Human 
		y los agrega a la health del Ninja.*/

		//robando al health de la victima, lo que el ninja tenga en Stealth
		vistima.setHealth(vistima.getHealth() - this.getStealth());
		vistima.energia();
		
		//sumando Stealth al Health del ninja
		this.setHealth(this.getHealth()+ this.getStealth());

	}
	//Agregar un método runAway() que reduce su salud en 10.
	public void runAway() {
		if (energia()) {// esta en human
			System.out.println("ya esta muerto");
		}
		else {
			setHealth(getHealth()-10);
			energia();
			
		}
	}
}