package ejercicios.variables.locales.globales;

public class Paciente {
	
	// Variables Globales y Locales
	
	private String nombre;
	private int edad;
	private int nroTurno;
	
	public static String  provincia = "Pichincha";  // VARIABLE STATIC 
	public static String  pais = "Ecuador";			// VARIABLE STATIC 
	
	
	
	public void atender () {
		
		this.nombre= "Diana";
		
		String evaluar = "Chequear paciente";
		String diagnosticar = "Diagnosticar paciente";
	}
	public void  recetar () {
		
		String Recetar = "Recetra medicamentos";
	}

}
