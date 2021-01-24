package guardiaDeZoo;

public class BatTest {

	public static void main(String[] args) {
		Murcielago m = new Murcielago();
		
		m.attackTown();// -50
		m.attackTown();//-50
		m.attackTown();// -50 = 150
		m.eatHumans();// +25
		m.eatHumans();// +25 =50
		m.fly();// -100
		m.fly();// -100
		m.desiplayEnergy();// 0

	}

}
