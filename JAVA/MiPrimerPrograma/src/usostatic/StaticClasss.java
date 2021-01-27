package usostatic;

public class StaticClasss {


//atributos
	private String nombre;
	public static Integer visitantes = 0;
	
//constructor

	public StaticClasss() {
		//visitantes= visitantes + 1;
		visitantes++;
	}
	
	public StaticClasss(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	
//metodos
	
	public void mostrarDatos() {
		System.out.println("variable nombre:"+nombre);
		System.out.println("variable visitantes:"+ visitantes );
	}
	
//get and set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}


