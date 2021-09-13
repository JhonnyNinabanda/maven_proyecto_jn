package tarea.nonaccess.finall;

public class Persona {
	
public final String horarioDormir = "20:00";
public String paisNacimiento= "Ecuador";

	public Persona() {
	horarioDormir = "21:00";	// Esta variable horarioDormir no se puede reasignar porque ea un atributo final
	paisNacimiento="Guayaquil"; // Esta variable paisNacimiento sis se puede raesignar porque no es un atributofinal
}

	public final void TomarTurno() {
	
	System.out.println("Su turno de atencion tiene para la mañana");
}
	
	public void horarioSalida () {
		
		System.out.println("La salida es a las 6h00 PM");
	}


}
