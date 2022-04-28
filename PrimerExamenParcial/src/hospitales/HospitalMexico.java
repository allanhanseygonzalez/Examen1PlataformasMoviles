package hospitales;

import java.util.List;

import modelos.Hospital;
import modelos.Paciente;

public class HospitalMexico extends OMS{ //HERENCIA Y POLIMORFISMO
	
	public HospitalMexico(List<Paciente> pacienteList) { //INYECCION DE DEPENDENCIA
		super(pacienteList);
	}
	
	@Override  //SOBREESCRITURA
	public Hospital getNombreHospital() { 
		return Hospital.MEXICO;
	}
	
	@Override //SOBREESCRITURA
	public boolean isGamHospital() {
		return getNombreHospital().name().equals("MEXICO");
	}
	
}
