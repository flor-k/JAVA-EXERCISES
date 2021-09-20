package actividad3;

import java.util.Scanner;

public class Ej37 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int suma =0;
		
		for(int x=0; x<12;x++) {
			System.out.println("Ingrese un valor");
			int valor= Integer.parseInt(input.nextLine());
			if (valor<=0) {
				x=13;
			}
			suma = suma + valor;
		}
		
		System.out.println("El valor percibido por el empleado es de: "+suma);
		
		

	}

}
