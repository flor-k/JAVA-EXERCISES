package actividad2;

import java.util.Scanner;

public class Ej12 {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Ingrese un numero entero");
		int numeroA = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero entero");
		int numeroB = Integer.parseInt(input.nextLine());

		
		if (numeroA==numeroB) {
			System.out.println("Son iguales");
		}else if (numeroA>numeroB) {
			System.out.println(numeroA + "Es el mayor");
		} else {
			System.out.println(numeroB + "Es el mayor");
		}
		
	}

}
