package demo;

import java.util.Scanner;

public class EjerciciosTema4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int numeroif = scanner.nextInt();
		
		if (numeroif == 0) {
			System.out.println("el numero es 0");
		} else if (numeroif < 0) {
			System.out.println("el numero es negativo");
		} else if (numeroif > 0) {
			System.out.println("el numero es positivo");
		}
		
		int numeroWhile = 0;
		
		while (numeroWhile < 3) {
			numeroWhile++;
			System.out.println("bucle while ejecutado, veces que se ha ejecutado el bucle while: " + numeroWhile);			
		}
		
		do {
			numeroWhile++;
			System.out.println("bucle do while ejecutado, veces que se ha ejecutado el bucle while: " + numeroWhile);
			
		} while (numeroWhile < 3);
		
		for (int numeroFor = 0; numeroFor < 3; numeroFor++) {
			System.out.println("Se ha ejecutado el bucle For, veces que se ha ejecutado el bucle: " + (numeroFor+1) );
		}
		
		String estacion = "invierno";
		switch (estacion) {
		case "primavera":
			System.out.println("la estacion es primavera");			
			break;

		case "verano":
			System.out.println("la estacion es verano");			
			break;

		case "otoño":
			System.out.println("la estacion es otoño");			
			break;

		case "invierno":
			System.out.println("la estacion es invierno");			
			break;

		default:
			System.out.println(estacion + "no es una estacion");			
			break;
		}
	}

}
