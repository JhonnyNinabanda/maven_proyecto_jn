package ejercicios.nonaccess.finall;

// No se puede extender de una clase final
public class EstudianteMedicina extends EstudianteCiencias{
	
	protected final void realizarPractica() {
		System.out.println("El estudiante medicina realiza 50 horas de clases");
	}
		
	protected void realizarPasantias() {
		System.out.println("El estudiante realiza 100 horas de pasantias");

		
	}

}
