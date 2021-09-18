package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Lector = new Scanner(System.in);
		
		String opcion;
		
		do {
		
		System.out.println("Escoja una opcion: ");
		System.out.println("1. Realizar Transferencia");
		System.out.println("2. Consultar Pago");
		System.out.println("3. SALIR");
		opcion = Lector.nextLine();
		
		
		switch(opcion) { // switch hasta antes de la version 1.7 funciona para int byte, char e int;
			case "1":
				System.out.println("Ingrese un numero de cuenta");
			break;
			case "2":
				System.out.println("No existen pagos");
			break;
			case "3":
				System.out.println("Cerrando el sisitema");
			break;
			default: 
				System.out.println("No ha elelgido ninguna opcion valida");
			break;
		
		}
		
		} while(!opcion.equals("3"));
		
		System.out.println("Gracias por preferirnos");
	}


}
