package actividad2;

import java.util.Scanner;

public class Ej17 {

	private static Scanner input = new Scanner(System.in);
	private static final int EDAD_MIN = 0, EDAD_MAX = 121, JUB_FEM = 60, JUB_MASC = 65;
	
	
	public static void main(String[] args) {
	
		
		System.out.println("Ingrese edad: ");
		int edad = Integer.parseInt(input.nextLine());
		if (edad>EDAD_MIN && edad<EDAD_MAX) {
			if(edad<JUB_FEM) {
				System.out.println("No se puede jubilar");
			} else {
				System.out.println("Ingrese genero (M/F): ");
				String genero = input.nextLine().toUpperCase();
				switch(genero) {
					case "M":
						if(edad>=JUB_MASC) {
							System.out.println("Se puede jubilar");
						}else {
							System.out.println("No se puede jubilar");
						}
						break;
					case "F":
						System.out.println("Se puede jubilar");
						break;
					default:
						System.out.println("Genero invalido");
						
					}
				}

		} else {
			System.out.println("Edad invalida");
		}
		

	}

}
