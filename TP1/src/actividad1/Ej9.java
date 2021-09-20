package actividad1;

import java.util.Scanner;

public class Ej9 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ingresar la medida del primer angulo:");
		double anguloA = Double.parseDouble(input.nextLine());
		System.out.println("ingresar la medida del segundo angulo:");
		double anguloB = Double.parseDouble(input.nextLine());
		System.out.println("El valor del tercer angulo es de "+(180-anguloA-anguloB)+"°");
		
		
		
	}

}
