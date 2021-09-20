package actividad2;

import java.util.Scanner;

public class Ej18 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int mayor, menor;
		
		System.out.println("Ingrese un numero");
		int numA = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un segundo numero");
		int numB = Integer.parseInt(input.nextLine());
		
		
		if (numA == 0 || numB==0) {
			System.out.println("No se puede dividir por cero");
		}else if (numA > numB) {
			mayor = numA;
			menor = numB;
			if((mayor % menor) == 0) {
				System.out.println("Son divisibles");
			} else {
				System.out.println("No son divisibles");
			}
		} else {
			mayor = numB;
			menor = numA;
			if((mayor % menor) == 0) {
				System.out.println("Son divisibles");
			} else {
				System.out.println("No son divisibles");
			}
		}
		
		
	}

}
