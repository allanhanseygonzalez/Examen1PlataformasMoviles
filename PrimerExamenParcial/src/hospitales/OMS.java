package hospitales;

import java.util.ArrayList;
import java.util.List;
import modelos.Paciente;
import pruebas.PruebaPCR;
import pruebas.PruebaRapida;
import modelos.Hospital;
import pruebas.PruebaCovid19;

public abstract class OMS {

	//composicion
	private List<Paciente> pacienteList;
	private List<PruebaCovid19> resultadoList;

	public OMS() {
		
	}
	
	public OMS(List<Paciente> pacientes){  //sobrecarga de metodos
		this.pacienteList = pacientes;
		this.resultadoList = new ArrayList<PruebaCovid19>();
		diagnosticar(pacienteList);
	}
	
	//ENCAPSULAMIENTO
	protected abstract boolean isGamHospital();
	protected abstract Hospital getNombreHospital();
	private void diagnosticar(List<Paciente> pacientes) {
		for(Paciente p : pacienteList){
			if(isGamHospital()) {
				PruebaCovid19 prueba = new PruebaPCR(p);
				this.resultadoList.add(prueba);
			}else {
				PruebaCovid19 prueba = new PruebaRapida(p);
				this.resultadoList.add(prueba);
			}
		}
	}
	public final void imprimirReporte() {
		System.out.println("\n"+ getNombreHospital()+"\n");
		for(PruebaCovid19 p : resultadoList) {
			System.out.println("Nombre del Paciente: " + p.getNombrePaciente());
			System.out.println("Resultado: "+ (p.isPositiveCase() ? "Positivo" : "Negativo"));
		}
	}
	
}