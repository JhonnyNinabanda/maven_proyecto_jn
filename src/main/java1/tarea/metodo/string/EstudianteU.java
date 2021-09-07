package tarea.metodo.string;

public class EstudianteU extends Estudiante {

	public String cedula;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "EstudianteU [cedula=" + cedula + "]";
	}
	

}
