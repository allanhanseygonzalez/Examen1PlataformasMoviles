package pruebas;

import modelos.Paciente;

public final class PruebaPCR implements PruebaCovid19{ //PROGRAMACION HACIA INTERFACES, INMUTABILIDAD

	//COMPOSICION
	Paciente paciente;
	
	public PruebaPCR(Paciente paciente){
		this.paciente = paciente;
	}
	
	//ENCAPSULAMIENTO
	
	@Override //SOBREESCRITURA
	public boolean isPositiveCase() {
		return paciente.getTemperatura() >= 39 && paciente.getVomito() == true;
	}
	
	@Override //SOBREESCRITURA
	public String getNombrePaciente() {
		return this.paciente.getNombre();
	}
	
}
