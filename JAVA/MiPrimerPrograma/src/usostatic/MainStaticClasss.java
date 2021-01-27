package usostatic;

public class MainStaticClasss {

	

		public static void main(String[] args) {

			StaticClasss.visitantes++;
			StaticClasss.visitantes++;
			System.out.println(StaticClasss.visitantes);
			
			
			StaticClasss web = new StaticClasss();
			web.setNombre("Coding");
			//web.setVisitantes(7);
			
			System.out.println(web.getNombre());
			//System.out.println(web.getVisitantes());

			//llamado al metodo
			web.mostrarDatos();
			
			StaticClasss.visitantes++;
			web.mostrarDatos();
			
		}

	}
