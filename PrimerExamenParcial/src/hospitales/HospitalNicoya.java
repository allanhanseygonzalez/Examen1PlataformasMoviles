package hospitales;

import java.util.List;

import modelos.Hospital;
import modelos.Paciente;

public class HospitalNicoya extends OMS{ //HERENCIA Y POLIMORFISMO
	
	public HospitalNicoya(List<Paciente> pacienteList) { //INYECCION DE DEPENDENCIA
		super(pacienteList);
	}
	
	
	//SOBREESCRIUTA Y ENCAPSULAMIENTO
	@Override
	public Hospital getNombreHospital() {
		return Hospital.NICOYA;
	}
	
	@Override
	public boolean isGamHospital() {
		return getNombreHospital().name().equals("MEXICO");
	}
	
}
