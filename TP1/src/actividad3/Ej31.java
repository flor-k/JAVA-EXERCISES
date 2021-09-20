package actividad3;

import java.util.Scanner;

public class Ej31 {

	private static Scanner input = new Scanner(System.in);
	private static final char NEGATIVA='N';
	private static char opcion;
	
	public static void main(String[] args) {
		do {
		System.out.println("¿Desea continuar? [S/N]");
		opcion = input.nextLine().toUpperCase().charAt(0);
		}while(opcion!=NEGATIVA);
		
		if(opcion==NEGATIVA) {
			System.out.println("Finalizado");
		}

	}

}
