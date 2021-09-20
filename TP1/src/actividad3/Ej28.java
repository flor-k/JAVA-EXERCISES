package actividad3;

import java.util.Scanner;

public class Ej28 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ingrese un numero entero: ");
		int cant = Integer.parseInt(input.nextLine());
		
		double mayor=0;
		int posicion=0;
		int x=0;
		
		while(x<cant) {
			System.out.println("ingrese un numero: ");
			double numero = Double.parseDouble(input.nextLine());
			if (numero>mayor) {
				mayor = numero;
				posicion=x+1;
			}
			x++;
		}
		
		System.out.println("El numero mayor fue el: "+mayor);
		System.out.println("Su posicion fue: "+posicion);
	}

}
