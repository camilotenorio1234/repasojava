package java_Repa_uno;
public class Operaciones {

	public void CalcularIMC(Persona per) {
		double operacion =per.getPeso()/ Math.pow(per.getAltura(),2);
		System.out.println("El IMC de la persona "+per.getNombre()+" es: "+operacion);
	}	
}
