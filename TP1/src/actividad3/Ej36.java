package actividad3;

import java.util.Scanner;

public class Ej36 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		double promedio = 0;
		int contador=0;

		do {
		System.out.println("Ingrese un numero: ");
		double numero = Double.parseDouble(input.nextLine());
		promedio = promedio+numero;
		contador++;
		} while(promedio<20);
		
		System.out.println("se leyo un total de "+contador+"valores");
		
	}

}
