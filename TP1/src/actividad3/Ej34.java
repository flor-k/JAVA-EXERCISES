package actividad3;

import java.util.Scanner;

public class Ej34 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Ingresar estatura: ");
		double estatura = Double.parseDouble(input.nextLine());
		double promedio = estatura;
		int contador = 0;
		while(estatura!=0) {
			System.out.println("Ingresar estatura: ");
			estatura = Double.parseDouble(input.nextLine());
			promedio = promedio + estatura;
			contador++;
		}
		
		promedio = promedio/contador;
		System.out.println("El promedio es de "+promedio);
		

	}

}
