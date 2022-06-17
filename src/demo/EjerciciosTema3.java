package demo;

public class EjerciciosTema3 {
	public static void main(String[] args) {
		/* Primera parte:

			Crear una función con tres parámetros que sean números que se suman entre sí.
			
			Llamar a la función en el main y darle valores. */		
		
		miFuncion(20,30,75);
		
		/*
		 * Segunda parte:
			
			Crear una clase coche.
			
			Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
			
			Una función que incremente el número de puertas que tiene el coche.
			
			Crear un objeto miCoche en el main y añadirle una puerta.
			
			Mostrar el número de puertas que tiene el objeto. 
		*/
		
		Coche coche1 = new Coche();
		coche1.incrementarPuertas();
		System.out.println("puertas en el coche: " + coche1.numeroDePuertas );
		
		
	}
	
	public static int miFuncion(int a, int b, int c) {
		return a + b + c;
		
	}
	
	public static class Coche {
		int numeroDePuertas = 0;
		
		public void incrementarPuertas() {
			this.numeroDePuertas++;
		}
		
	}

}
