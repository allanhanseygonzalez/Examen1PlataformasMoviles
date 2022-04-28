package pruebas;

import modelos.Paciente;

public final class PruebaRapida implements PruebaCovid19{ //INMUTABILIDAD, IMPLEMENTACION DE INTERFACES
	//COMPOSICION
	Paciente paciente;
	
	public PruebaRapida(Paciente paciente){
		this.paciente = paciente;
	}
	
	//ENCAPSULAMIENTO
	
	@Override //SOBREESCRITURA
	public boolean isPositiveCase() {
		return paciente.getTemperatura() >= 37 && paciente.getEdad() >= 60;
	}
	
	@Override //SOBREESCRITRURA
	public String getNombrePaciente() {
		return this.paciente.getNombre();
	}
	
}
