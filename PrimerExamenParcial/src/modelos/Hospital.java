package modelos;

public enum Hospital {

	NICOYA("Hospital de Nicoya"),
	MEXICO("Hospital Mexico");
	
	private Hospital(String nombreHospital) {
	}

	
	//ENCAPSULAMIENTO
	public String getTipoEnum() {
		return this.name();
	}
	

}
