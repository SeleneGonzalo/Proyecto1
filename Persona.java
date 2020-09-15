public class Persona (){
	protected String nombre;
	protected int edad;

	public Persona (String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	void setNombre (String nombre){
		this.nombre = nombre;
	}
	void setEdad (int edad){
		this.edad = edad;
	}

	String getNombre (){
		return nombre;
	}

	int getEdad (){
		return edad;
	}
}