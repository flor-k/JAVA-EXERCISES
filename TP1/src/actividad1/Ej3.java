package actividad1;

import java.util.Scanner;

public class Ej3 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese un numero entero");
		int numero = Integer.parseInt(input.nextLine());
		System.out.println("El numero "+numero+" multiplicado por 5 es "+(numero*5));
		System.out.println("El numero "+numero+" multiplicado por 2 es "+(numero*2));
	}

}
