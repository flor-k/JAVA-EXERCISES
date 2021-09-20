package actividad1;

import java.util.Scanner;

public class Ej5 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("ingrese numero A: ");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.println("ingrese numero B: ");
		int num2 = Integer.parseInt(input.nextLine());
		System.out.println("Su numero A es: "+num1+" y su numero B es: "+num2);
		int guardado = num1;
		num1 = num2;
		num2 = guardado;
		System.out.println("Su numero A es: "+num1+" y su numero B es: "+num2);
		
	}

}
