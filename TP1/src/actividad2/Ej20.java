package actividad2;

import java.util.Scanner;

public class Ej20 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double resultado = 0;
		
		System.out.println("ingrese un numero: ");
		double numA = Double.parseDouble(input.nextLine());
		System.out.println("ingrese otro numero: ");
		double numB = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese una operacion: ");
		String operacion = input.nextLine();
		
		switch(operacion) {
		case "+":
			resultado = numA+numB;
			break;
		case"-":
			resultado = numA-numB;
			break;
		case"*":
			resultado = numA*numB;
			break;
		case"/":
			resultado = numA/numB;
			break;
		default:
			System.out.println("Operacion no disponible");
		}
		
		System.out.println("El resultado de "+numA+operacion+numB+" es: "+resultado);
		

	}

}
