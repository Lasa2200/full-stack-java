package pHerencias;

	public class MainHerencia {

		public static void main(String[] args) {
			Camioneta camioneta = new Camioneta();
			camioneta.setNumRuedas(6);
			camioneta.setColor("Blanco");
			camioneta.setCarga(1000);
			
			
			Auto auto = new Auto();
			auto.setNumRuedas(4);
			auto.setColor("Rojo");

			System.out.println("*********");
			System.out.println(camioneta.getNumRuedas());
			System.out.println(camioneta.getColor());
			System.out.println(camioneta.getCarga());
			System.out.println("*********");
			System.out.println(auto.getNumRuedas());
			System.out.println(auto.getColor());
			System.out.println("*********");
			System.out.println(camioneta.toString());
			System.out.println("*********");
			System.out.println(auto.toString());
		}

	}