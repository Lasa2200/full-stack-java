package maestrodeobjetos;


public class HumanTest {

	public static void main(String[] args) {
		
		Wizard wizard  = new Wizard();
		Ninja n1 = new Ninja();
		Samurai s1 = new Samurai();
		//System.out.println(wizard.getIntelligence());

		
		//System.out.println("Stealth:"+n1.getStealth());// atake de ninja a samurai
		s1.attack(n1);
		n1.steal(s1);
		s1.attack(n1);
		n1.steal(s1);
		s1.deathBlow(n1);
		System.out.println(n1.getHealth());
//		wizard.attack(n1);
//		System.out.println("Health:"+wizard.getHealth());
//
//		n1.steal(wizard);
//		System.out.println("Health ninja: "+n1.getHealth());
//		wizard.fireBall(n1);
//
//		System.out.println("Healt del ninja: "+n1.getHealth());
//		
//		
//		System.out.println("Samurai:"+s1.getHealth());
//		System.out.println("Ninja:"+n1.getHealth());
//		s1.deathBlow(n1);
//		System.out.println("Samurai:"+s1.getHealth());
//		System.out.println("Ninja:"+n1.getHealth());
//		

	}

}