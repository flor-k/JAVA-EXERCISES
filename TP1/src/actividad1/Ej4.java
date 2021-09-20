package actividad1;

import java.util.Scanner;
public class Ej4 {
	
	private static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Cuanto vale la hora de trabajo:");
		int valor = Integer.parseInt(input.nextLine());
		System.out.println("Cuantas horas trabaja en un dia:");
		int hora = Integer.parseInt(input.nextLine());
		System.out.println("Su sueldo semanal es: "+(((hora*5)+(hora/2))*valor));
	}

}
