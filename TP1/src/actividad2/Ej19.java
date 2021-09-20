package actividad2;

import java.util.Scanner;

public class Ej19 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean esDeUnSoloDigito, esImpar, noEsNinguno, esAmbos;
		int numero;
		
		System.out.println("Ingrese un numero entero");
		numero = Integer.parseInt(input.nextLine());
		esDeUnSoloDigito = (numero>-10 && numero<10);
		esImpar = (numero%2 != 0);
		noEsNinguno = (!esDeUnSoloDigito && !esImpar);
		esAmbos = (esDeUnSoloDigito && esImpar);
		
		System.out.println("Es de un solo digito: " + esDeUnSoloDigito);
		System.out.println("Es impar: "+ esImpar);
		System.out.println("No es ninguno: "+noEsNinguno);
		System.out.println("Es ambos: "+esAmbos);

	}

}
