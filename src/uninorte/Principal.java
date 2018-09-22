package uninorte;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Victor", "Peralta");
		Persona persona2 = new Persona("Manuel", "Martinez");
		Persona persona3 = new Persona("Juan", "Perez");
		
		LinkedList<Persona> listaPersonas = new LinkedList<Persona>();
		
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		
		Scanner sc = new Scanner(System.in);
		
		for (Persona persona : listaPersonas) {
			System.out.println("De:");
			System.out.println(persona.getNombreCompleto());
			System.out.println("Digite la dirección: ");
			persona.setDireccion(sc.nextLine());
			
			System.out.println("Digite el telefono: ");
			persona.setTelefono(sc.nextLine());
			
			System.out.println("Digite el correo: ");
			persona.setCorreo(sc.nextLine());
		}
		sc.close();
		
		System.out.println("");
		System.out.println("--- Información Modificada ---");
		for (Persona persona : listaPersonas) {
			System.out.println(persona.getNombreCompleto()+" | "+persona.getDireccion()+" | "+persona.getCorreo()+" | "+persona.getTelefono());
		}
	}

}
