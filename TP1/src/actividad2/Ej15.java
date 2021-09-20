package actividad2;

import java.util.Scanner;

public class Ej15 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese su edad");
		int edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese su altura");
		double altura = Double.parseDouble(input.nextLine());
		if(edad>6 || altura>1.5) {
			System.out.println("Puede ingresar");
		} else {
			System.out.println("No puede ingresar");
		}

	}

}
