package actividad1;

import java.util.Scanner;

public class Ej7 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("ingrese el valor del metro cuadrado de tiera:");
		double valorMetro = Double.parseDouble(input.nextLine());	
		System.out.println("ingrese el Ancho del terrreno:");
		double ancho = Double.parseDouble(input.nextLine());
		System.out.println("ingrese el Largo del terrreno:");
		double largo = Double.parseDouble(input.nextLine());
		System.out.println("El valor total del terreno es de: $"+((ancho*largo)*valorMetro));
		System.out.println("Necesitara "+(((ancho*2)+(largo*2))*3)+" metros de alambre para cercarlo tres veces");
		
		
		

	}

}
