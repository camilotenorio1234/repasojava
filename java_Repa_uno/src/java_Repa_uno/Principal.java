package java_Repa_uno;

import java.util.Scanner;

public class Principal {

	
	
	public static void main(String[] args) {
	System.out.println("okkkks");

	Scanner se = new Scanner(System.in);
	System.out.println("ingrese el los datos de las persona");
	System.out.println("ingrese el nombre de la persona");
	Persona Per= new Persona();
	Per.setNombre(se.next());
	
	System.out.println("ingrese el altura de la persona en metros");
	Per.setAltura(se.nextDouble());
	System.out.println("ingrese el peso de la persona");
	Per.setPeso(se.nextDouble());
	
	Operaciones o=new Operaciones();
	o.CalcularIMC(Per);
	
	
	
	
	}
}
