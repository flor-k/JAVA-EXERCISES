package actividad2;

import java.util.Scanner;

public class Ej16 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("¿Cuantos asientos hay disponibles?");
		int asientos = Integer.parseInt(input.nextLine());
		System.out.println("¿Cuantos asistentes hay disponibles?");
		int asistentes = Integer.parseInt(input.nextLine());
		if (asientos >= asistentes) {
			System.out.println("Alcanzan los asientos");
		} else {
			int diferencia = asistentes - asientos;
			System.out.println("Hacen falta "+ diferencia + " asientos más");
		}
		
	}

}
