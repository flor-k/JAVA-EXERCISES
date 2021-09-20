package actividad3;

import java.util.Scanner;

public class Ej24 {

	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Ingrese un numero: ");
		int numA = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese otro numero: ");
		int numB = Integer.parseInt(input.nextLine());
		if (numA==numB) {
			System.out.println("Son iguales");
		} else {
		
		//Incluyendo
		while (numA <= numB) {
			System.out.println(numA);
			numA++;
		}
		//Excluyendo
		while (numA < numB-1) {
			System.out.println(numA+1);
			numA++;
		}
		
		}
		
		
	}

}
