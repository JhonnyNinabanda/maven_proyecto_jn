package consultorio.medico;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Lector = new Scanner (System.in);
		
	     int numPaciente = 5;
	     Paciente arrayPaciente[] = new Paciente[numPaciente];
		
		int opcion = 0;
		
		System.out.println("BIENVENIDOS AL CONSULTORIO MEDICO QUITO");
		System.out.println("---------------------------------------");
		System.out.println("");

		do {
			System.out.println("**************************");
			System.out.println("  Menu de Opciones ");
			System.out.println("1. Ingresar Paciente");
			System.out.println("2. Imprimir Reporte");
			System.out.println("3. SALIR");
			System.out.println("Porfavor escoga una opcion");
			System.out.println("**************************");
			
			opcion = Lector.nextInt();
			if(opcion == 1) {
			
			      for (int i = 0; i < numPaciente; i++) {
			         Paciente persona = new Paciente();
			         arrayPaciente[i] = persona;
			         
			 		Scanner Lector1 = new Scanner (System.in);
			 		Scanner Lector2 = new Scanner (System.in);
			         
			         System.out.print("Ingrese nombre del paciente: ");
						String nombre = Lector1.nextLine();
						
						System.out.print("Ingrese apellido del paciente: ");
						String apellido = Lector1.nextLine();
						
						System.out.print("Ingrese edad del paciente: ");
						int edad = Lector1.nextInt();
						
						System.out.print("Ingrese sintoma del paciente: ");
						String sintoma = Lector2.nextLine();
						System.out.println("====================================");
						
			            persona.setNombre(nombre);
			            persona.setApellido(apellido);
			            persona.setEdad(edad);
			            persona.setSintoma(sintoma);
			         
			      }

			} else if  (opcion== 2) {
				
				System.out.println("	        	Reporte de los Pacientes		");
				System.out.println("===========================================================");
				
			      for (int i = 0; i < arrayPaciente.length; i++) {
				        System.out.println(arrayPaciente[i]);
				         
			      }
			        System.out.println("");
					System.out.println("           Pacientes Ordenados por Edad    ");
					System.out.println("=========================================================");
					
					Arrays.sort(arrayPaciente, Collections.reverseOrder());
					System.out.println(Arrays.toString(arrayPaciente));
	
			}
		} while (opcion !=3);
		
				System.out.println("HASTA PRONTO!!!!");
	}

}
