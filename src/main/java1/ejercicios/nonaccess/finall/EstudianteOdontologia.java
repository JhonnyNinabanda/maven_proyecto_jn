package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends Estudiante {
	
	@Override
	
	//No se puede sobreescribir un metodo final del padre.
	public void realizarPracticas () {
		System.out.println("Raeliza 100 horas de practicas ");
	}
	
	protected void realizarPasantias() {
		System.out.println("El estudiante realizar 200 horas de pasantias");
	
	}

}
