package actividad3;

import java.util.Scanner;

public class Ej25 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese el ancho");
		int ancho = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el alto");
		int alto = Integer.parseInt(input.nextLine());
		for (int x= 0; x<alto;x++) {
			for (int y=0;y<ancho;y++) {
				System.out.print("+");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
