package tema9;

public class Main {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNombre("Juan Garcia");
		cliente1.setEdad(30);
		cliente1.setTelefono("9298765432");
		cliente1.setCredito(12000.99);
		
		System.out.println(cliente1.toString());
		
		Trabajador trabajador1 = new Trabajador();
		trabajador1.setNombre("Pedro Sanchez");
		trabajador1.setEdad(42);
		trabajador1.setTelefono("75738129454");
		trabajador1.setSalario(17200.00);
		
		System.out.println(trabajador1.toString());		
	}

}
