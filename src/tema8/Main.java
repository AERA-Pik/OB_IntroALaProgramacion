package tema8;

public class Main {
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		
		persona1.setEdad(27);
		persona1.setNombre("Aaron Ramirez");
		persona1.setTelefono("5512345678");
		
		System.out.println(persona1.toString());		
	}
}

class Persona {
	
	private int edad;
	private String nombre;
	private String telefono;	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	@Override
	public String toString() {
		return "Persona [nombre: " + nombre + ", edad: " + edad + ", telefono: " + telefono + "]";
	}
}
