package actividad3;

import java.util.Scanner;

public class Ej26 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
			
		System.out.println("ingrese un numero natural");
		int numero = Integer.parseInt(input.nextLine());
		
		int x=0;
		int contador = 0;
		while (contador<numero) {
			x++;
			if(x%3==0 && x%5!=0) {
				System.out.println(x);
				contador++;
			}
		}
		
		
		
		
		
	}

}
