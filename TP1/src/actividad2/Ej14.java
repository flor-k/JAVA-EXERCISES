package actividad2;

import java.util.Scanner;

public class Ej14 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese su edad");
		int edad = Integer.parseInt(input.nextLine());
		if (edad<7) {
			System.out.println("Muy chico apra ingresar");
		} else {
			System.out.println("Ingrese su altura");
			double altura = Double.parseDouble(input.nextLine());
			if (altura<1.50) {
				System.out.println("Muy bajo para ingresar");
			} else {
				System.out.println("Puede ingresar");
			}
		}

	}

}
