package actividad3;

import java.util.Scanner;

public class Ej29 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
			
		double nota;
				
		do {
		System.out.println("Ingrese una nota: ");
		nota = Double.parseDouble(input.nextLine());
		} while (nota<1 || nota>10);
		

	}

}
