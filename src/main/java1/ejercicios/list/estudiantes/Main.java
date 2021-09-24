package ejercicios.list.estudiantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector = new Scanner (System.in);
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Jhonny");
		estudiante1.setApellido("Ninabanda");
		
		Estudiante listaUniversidad[] = new Estudiante[1000];
		
		listaUniversidad[0]= estudiante1;
		
		
		
		for (int i=0; i<1000; i++) {
			Estudiante estudiante = new Estudiante();
			
			System.out.println("Ingrese nombre del estudiante: " +i );
			String nombre = Lector.nextLine();
			System.out.println("Ingrese apellido del estudiante: " +i );
			String apellido = Lector.nextLine();
			
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
		
			listaUniversidad[i]= estudiante;
			
		}
		
		List<Estudiante> listUni = new ArrayList<Estudiante>();
		
		for (int i=0; i<1000; i++) {
			Estudiante estudiante = new Estudiante();
			
			System.out.println("Ingrese nombre del estudiante: " +i );
			String nombre = Lector.nextLine();
			System.out.println("Ingrese apellido del estudiante: " +i );
			String apellido = Lector.nextLine();
			
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			
			listUni.add(estudiante);
		
			listaUniversidad[i]= estudiante;
			
		}
		
		for(int i=0; i < listUni.size() ; i++) {
			Estudiante estu1 = listUni.get(i);
			System.out.println("Estuidiante: " + estu1 );
			
			
		
		}

	}

}
