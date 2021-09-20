package actividad3;

import java.util.Scanner;

public class Ej23 {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Ingrese un numero: ");
		int numero = Integer.parseInt(input.nextLine());
		for(int x=1;x<11;x++) {
			System.out.println(numero*x);
		}

	}

}
