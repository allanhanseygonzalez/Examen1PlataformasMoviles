package test;

import hospitales.HospitalMexico;
import hospitales.HospitalNicoya;
import modelos.Paciente;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String args[]) {
		
		List<Paciente> lista1 = new ArrayList<Paciente>();
		List<Paciente> lista2 = new ArrayList<Paciente>();
		
		Paciente p1 = new Paciente("Edgar",61,32,true);
		Paciente p2 = new Paciente("Juan",32,37,true);
		Paciente p3 = new Paciente("Karla",23,39,false);
		Paciente p4 = new Paciente("Jairo",69,38,true);
		Paciente p5 = new Paciente("Pedro",45,39,false);
		Paciente p6 = new Paciente("Maria",23,36,true);
		Paciente p7 = new Paciente("Bernardo",56,40,false);
		Paciente p8 = new Paciente("Kalimba",45,37,true);
		Paciente p9 = new Paciente("Judas",38,35,false);
		Paciente p10 = new Paciente("Karol",25,36,false);
		Paciente p11 = new Paciente("Becky",33,38,true);
		Paciente p12 = new Paciente("Fernanda",20,39,false);
		Paciente p13 = new Paciente("Carlos",46,40,true);
		Paciente p14 = new Paciente("Oscar",19,33,true);
		
		lista1.add(p1);
		lista1.add(p2);
		lista1.add(p3);
		lista1.add(p4);
		lista1.add(p5);
		lista1.add(p6);
		lista1.add(p7);
		lista2.add(p8);
		lista2.add(p9);
		lista2.add(p10);
		lista2.add(p11);
		lista2.add(p12);
		lista2.add(p13);
		lista2.add(p14);
		
		
		HospitalMexico hospitalMexico = new HospitalMexico(lista1);
		HospitalNicoya hospitalNicoya = new HospitalNicoya(lista2);
		
		
		hospitalMexico.imprimirReporte();
		hospitalNicoya.imprimirReporte();
	}
	
}
