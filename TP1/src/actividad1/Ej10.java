package actividad1;

import java.util.Scanner;

public class Ej10 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese el nombre del primer socio: ");
		String nombreA= input.nextLine();
		System.out.println("Ingrese el nombre del segundo socio: ");
		String nombreB= input.nextLine();
		System.out.println("Ingrese el nombre del tercer socio: ");
		String nombreC= input.nextLine();
		System.out.println("Ingrese el monto aportado por "+nombreA+" :");
		double capitalA= Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el monto aportado por "+nombreB+" :");
		double capitalB= Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el monto aportado por "+nombreC+" :");
		double capitalC= Double.parseDouble(input.nextLine());
		double capitalTotal = capitalA+capitalB+capitalC;
		System.out.println("El porcentaje aportado por "+nombreA+" es de "+((capitalA*100)/capitalTotal)+"%");
		System.out.println("El porcentaje aportado por "+nombreB+" es de "+((capitalB*100)/capitalTotal)+"%");
		System.out.println("El porcentaje aportado por "+nombreC+" es de "+((capitalC*100)/capitalTotal)+"%");
		
	}

}
