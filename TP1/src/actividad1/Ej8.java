package actividad1;

import java.util.Scanner;

public class Ej8 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("ingrese el primer numero:");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.println("ingrese el segundo numero:");
		int num2 = Integer.parseInt(input.nextLine());
		System.out.println("Suma:"+(num1+num2));
		System.out.println("Resta:"+(num1-num2));
		System.out.println("Multiplicación:"+(num1*num2));
		System.out.println("División:"+(num1/num2));
	}

}
