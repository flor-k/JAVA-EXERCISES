package actividad2;

import java.util.Scanner;

public class Ej21 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String[] semana = {"Domingo", "Lunes", "Martes", "Miercoles", "Juves", "Viernes", "Sabado"};
		
		System.out.println("ingresar un numero entre el 1 y el 7: ");
		int numero = Integer.parseInt(input.nextLine());
		
			if (numero<1 || numero>7) {
				System.out.println("Dia incorrecto");
			} else {
				String dia = semana[numero-1];
				System.out.println("El dia de la semana es: "+dia);
			}

	}

}
