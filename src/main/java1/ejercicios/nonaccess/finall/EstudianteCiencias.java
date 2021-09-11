package ejercicios.nonaccess.finall;

public final class EstudianteCiencias extends Estudiante{
	
	public final String horarioEntrada = "08:00";
	public String cuidadNacimiento= "Quito";
	
	public EstudianteCiencias() {
		horarioEntrada = "08:30";	// variable que no se puede reasignar un atributo final
		cuidadNacimiento="Guayaquil";
		
		
	}

}
