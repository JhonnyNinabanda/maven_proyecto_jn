package consultorio.medico;

public class Paciente implements Comparable <Paciente>{
	
	private String nombre;
	private String apellido;
	private int edad;
	private String sintoma;
	
		//Constructor 
	public Paciente() {

	this.nombre = "";
	this.apellido = "";
	this.edad = 0;
	this.sintoma = "";
		}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		if(this.edad > o.getEdad()) {
			return 1;
		}else if(this.edad == o.getEdad()) {
			return 0;
		}else {
		
			return -1;
		}
		
	}

	@Override
	public String toString() {
		return "\nPaciente [Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad + ", Sintoma=" + sintoma+ " ]";
	}

}
