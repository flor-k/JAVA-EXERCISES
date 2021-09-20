package actividad1;

import java.util.Scanner;

public class Ej1 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese su nombre");
		String nombre = input.nextLine();
		System.out.println("¡Bienvenide " + nombre + " !");

	}

}
