package guardiaDeZoo;

public class Gorilla extends Mamma1{
//hacer que imprima un mensaje en pantalla indicando que el gorila ha lanzado algo,
	//al mismo tiempo que disminuye su nivel de energía en 5.
	public void throwSomething() {
		setEnergyLevel(getEnergyLevel()-5);
		System.out.println("ha lanzado algo" + getEnergyLevel());
	}
	public void eatBananas() {
		setEnergyLevel(getEnergyLevel()+10);
		System.out.println(" Estoy satisfecho" + getEnergyLevel());
	}
	public void climb() {
		setEnergyLevel(getEnergyLevel()-10);
		System.out.println("el gorila ha trepado a la cima de un árbol" + getEnergyLevel());
		
		
	}
	
}
