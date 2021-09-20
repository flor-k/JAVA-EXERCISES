package actividad3;

import java.util.Scanner;

public class Ej27 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ingrese 5 edades: ");
		
		double promedio = 0;
		int consigna=0;
		for (int x= 0; x<5;x++) {
			int edad=Integer.parseInt(input.nextLine());
			promedio = promedio + edad;
			if (edad<18 && edad%2!=0) {
				consigna++;
			}
		}
		
		promedio = promedio/5;
		
		System.out.println("El promedio de las edades es: "+promedio);
		System.out.println("Las edades menores de 18 e impares son: "+ consigna);
		
		
	}

}
