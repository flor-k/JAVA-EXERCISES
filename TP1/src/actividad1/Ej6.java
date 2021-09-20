package actividad1;

import java.util.Scanner;

public class Ej6 {
	
	private static Scanner input = new Scanner(System.in);
	public static int SUELDO = 44000;
	public static double PORCENTAJE = 0.16;
	
	public static void main(String[] args) {
		
		System.out.println("ingrese el monto total vendido: ");
		int ventas = Integer.parseInt(input.nextLine());
		double comision = ventas*PORCENTAJE;
		double sueldoFinal = SUELDO+comision;
		System.out.println("Sueldo incluyendo comision es de: "+sueldoFinal);
		

	}

}
