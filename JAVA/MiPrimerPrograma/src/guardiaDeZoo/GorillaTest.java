package guardiaDeZoo;

public class GorillaTest {

	public static void main(String[] args) {

		Gorilla g = new Gorilla();
		g.throwSomething();//-5
		g.throwSomething();// -5
		g.throwSomething();//-5 =-15
		g.eatBananas();// +20
		g.eatBananas();// +20
		g.climb();// -10
		g.desiplayEnergy();
		g.getEnergyLevel();
	}

}
