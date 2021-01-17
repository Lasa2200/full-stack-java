package pHerencias;

		public class Vehiculo{

		private int numRuedas;
		private String color;

		public int getNumRuedas() {
			return numRuedas;
		}

		public void setNumRuedas(int numRuedas) {
			this.numRuedas = numRuedas;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Vehiculo [numRuedas=" + numRuedas + ", color=" + color + "]";
		}
		
		
	}