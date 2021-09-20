package actividad2;

import java.util.Scanner;

public class Ej11 {
	
	private static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero entero");
		int numero = Integer.parseInt(input.nextLine());
		if (numero%2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		
		
	}

}
