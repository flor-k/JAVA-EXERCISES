package actividad3;

import java.util.Scanner;

public class Ej38 {
	
	private static Scanner input = new Scanner(System.in);
	private static final String USUARIO = "admin";
	private static final String CONTRA = "123456";

	public static void main(String[] args) {
		
		int x=0;
		while(x<3) {
		System.out.println("ingrese usuario");
		String usuarioPrueba = input.nextLine();
		System.out.println("ingrese contraseña");
		String contraPrueba = input.nextLine();
		if(contraPrueba.equals(CONTRA) && usuarioPrueba.equals(USUARIO)) {
			System.out.println("Acceso concedido");
			x=4;
			}else{
				x++;
				}
		
		}
		if(x==3){
			System.out.println("Se ha bloqueado la cuenta");
		}
		
}
}