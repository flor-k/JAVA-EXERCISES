package actividad3;

import java.util.Scanner;

public class Ej35 {

	private static Scanner input = new Scanner(System.in);
	private static final String FINALIZAR = "*";

	
	public static void main(String[] args) {
		
		String nombreMenor="";
		int edadMenor=9999;

		
		System.out.println("Ingrese nombre: ");
		String nombre = input.nextLine();
		while (!nombre.equals(FINALIZAR)){
			System.out.println("ingrese edad:");
			int edad = Integer.parseInt(input.nextLine());
			
			if(edad<edadMenor) {
				edadMenor=edad;
				nombreMenor=nombre;
			}
			
			System.out.println("Ingrese nombre: ");
			nombre = input.nextLine();
		};
		

		System.out.println("La menor persona es "+nombreMenor+" y tiene "+edadMenor);
		
	}

}
