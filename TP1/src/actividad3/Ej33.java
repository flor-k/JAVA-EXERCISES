package actividad3;

import java.util.Scanner;

public class Ej33 {
	
	private static Scanner input = new Scanner(System.in);
	private static double numero;

	public static void main(String[] args) {


		System.out.println("ingrese un numero");
		numero = Double.parseDouble(input.nextLine());
		double mayor=numero;
		
		while(numero!=0) {
			System.out.println("El numero mayor es: "+mayor);
			System.out.println("ingrese un numero");
			numero = Double.parseDouble(input.nextLine());
			if(numero>mayor) {
				mayor=numero;
			}
		}
		
		

	}

}
