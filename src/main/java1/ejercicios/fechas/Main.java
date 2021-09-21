package ejercicios.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();		// Deprecada y ya no se deberia utilizar
		
		LocalDate today = LocalDate.now(); // Fecha Actual
		LocalDate end = today.plusDays(15); // aumentar 15 dias
		
		System.out.println("Hoy dia es:" + today);
		
		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Volley Principante");
		curso1.setFechaInicio(today);
		curso1.setFechaFin(end);
		
		System.out.println("Nombre: " + curso1.getNombre());
		System.out.println("Fecha inicio: " + curso1.getFechaInicio());
		System.out.println("Fecha fin: " + curso1.getFechaFin());
		
		LocalDate today2 = LocalDate.now();
		LocalDate todayon = today2.minusDays(2);
		LocalDate todayend = todayon.plusDays(20);
		
		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Natacion Principante");
		curso2.setFechaInicio(todayon);
		curso2.setFechaFin(end);

		System.out.println("Nombre: " + curso2.getNombre());
		System.out.println("Fecha inicio: " + curso2.getFechaInicio());
		System.out.println("Fecha fin: " + curso2.getFechaFin());
		
		//Fechas especificas 
		
		LocalDate fechaEspecifica = LocalDate.of(2020, 2, 15);
		
		
		// Ejercicios 
		
		LocalDate FechaEspecificaIniT1 = LocalDate.of(2022, 2, 15);
		LocalDate FechaEspecificaFinT1 = LocalDate.of(2022, 7, 10);
	
		
		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(FechaEspecificaIniT1);
		curso3.setFechaFin(FechaEspecificaFinT1);
		
		Instructor instructor = new Instructor();
		
		
		LocalDate fechaVista =curso3.getFechaFin();
		LocalDate fechaVistaNueva = fechaVista.plusDays(3);
		
		curso3.setFechaFin(fechaVistaNueva);   // Practicar para setear un nuevo valor a las fechas
		
		System.out.println("Nombre: " + curso3.getNombre());
		System.out.println("Fecha inicio: " + curso3.getFechaInicio());
		System.out.println("Fecha fin: " + curso3.getFechaFin());
		
		System.out.println("Fecha fin formateada: " + curso3.getFechaFin().format(DateTimeFormatter.ofPattern("mm/dd/yyyy")));
		
		LocalDate diaHoy3 = LocalDate.now();
		System.out.println(diaHoy3.format(DateTimeFormatter.ofPattern("dd-mm-yyyy")));
		System.out.println(diaHoy3.format(DateTimeFormatter.ofPattern("yyy-mm-aa")));
	}

}
