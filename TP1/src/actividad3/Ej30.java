package actividad3;

import java.util.Scanner;

public class Ej30 {
	
	private static Scanner input = new Scanner(System.in);
	
	private static final char SUMA = '+', RESTA = '-', MULTI = '*', DIVI = '/', FINALIZACION = 'F';
	private static char operacion;
	
	public static void main(String[] args) {
		
		do {
		System.out.println("Ingrese una operacion matematica: ");
		operacion = input.nextLine().toUpperCase().charAt(0);
		if(operacion==FINALIZACION) {
			System.out.println("Finalizado");
		}
		} while (operacion!=SUMA && operacion!=RESTA && operacion!=MULTI && operacion!=DIVI && operacion !=FINALIZACION);
			
		while(operacion!=FINALIZACION) {
	
		System.out.println("Ingrese un numero");
		double numeroUno = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese un numero");
		double numeroDos = Double.parseDouble(input.nextLine());
		
		
		switch(operacion) {
			
		case SUMA:
			double suma = numeroUno+numeroDos;
			System.out.println("La suma es: "+suma);
			break;
		case RESTA:
			double resta = numeroUno-numeroDos;
			System.out.println("La resta es: "+resta);
			break;
		case MULTI:
			double multi = numeroUno*numeroDos;
			System.out.println("La multiplicacion es: "+multi);
			break;
		case DIVI:
			if(numeroUno<=0) {
				System.out.println("No se puede divir por cero");
				break;
			} else {
			double divi = numeroUno/numeroDos;
			System.out.println("La division es: "+divi);
			break;
			}
		}
		
		do {
		System.out.println("Ingrese otra operacion: ");
		operacion = input.nextLine().toUpperCase().charAt(0);
		}while(operacion!=SUMA && operacion!=RESTA && operacion!=MULTI && operacion!=DIVI && operacion !=FINALIZACION);
		
		if(operacion==FINALIZACION) {
			System.out.println("Finalizado");
		}
		
		
		}
	}
}

