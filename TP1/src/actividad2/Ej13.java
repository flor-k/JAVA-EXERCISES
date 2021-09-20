package actividad2;

import java.util.Scanner;

public class Ej13 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese el primer número: ");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo número: ");
		int num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el tercer número: ");
		int num3 = Integer.parseInt(input.nextLine());


			
		if (num1 > num2 && num1>num3) {
			System.out.println("El mayor numero es: " + num1);
		} else if (num2 > num1 && num2>num3) {
			System.out.println("El mayor numero es: " + num2);
		} else if (num3>num1 && num3>num2){
			System.out.println("El mayor numero es: " + num3);
			
		} else{
			System.out.println("Hay iguales");
		
		}
		
	}

}
