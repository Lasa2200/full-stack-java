package guardiaDeZoo;

public class Murcielago extends Mamma1 {
	
	public void fly() {
		setEnergyLevel(getEnergyLevel()-50);
		System.out.println("hiiiiiiiiiiiiiiiiii");
		
	}
	public void eatHumans() {
		setEnergyLevel(getEnergyLevel()-25);
		System.out.println("bueno, no importa");
		
	}
	public void attackTown() {
		
		System.out.println("Se quema la ciudadddddddd");
		setEnergyLevel(getEnergyLevel()-100);
	}
	
}