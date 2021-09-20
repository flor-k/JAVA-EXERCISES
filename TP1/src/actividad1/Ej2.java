package actividad1;

import java.util.Scanner;

public class Ej2 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Ingrese la primer nota:");
		double nota1 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese la segunda nota:");
		double nota2 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese la tercer nota:");
		double nota3 = Double.parseDouble(input.nextLine());
		double promedio = Math.round(((nota1 + nota2 + nota3)/3)*100)/100.0;
		System.out.println("Su promedio es: "+promedio);

	}

}
