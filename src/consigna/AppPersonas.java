package consigna;

import java.io.IOException;
import java.util.List;

public class AppPersonas {

	public static void main(String[] args) throws IOException {
		List<Persona> personas = LeerYEscibirPersonas.getPersonas("personas.in");
		LeerYEscibirPersonas.escribirMayoresDeEdadOrdenadasPorEdad(personas, 30);
		LeerYEscibirPersonas.escribirMayoresDeEdadOrdenadasPorDNI(personas, 35);
		
	}

}
