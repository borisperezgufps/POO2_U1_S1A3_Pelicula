package pelicula.model;

public class ClienteFachada {

	public static void main2(String[] args) {
		
		Fachada fac = new Fachada();
		
		/* 
		 * ******************************************
		 * CREA PERSONAS
		 * ******************************************
		 */
		
		Persona p1 = fac.crearPersona("Perez", "Boris", "Colombia", 1981, 3, 20);
		Persona p2 = fac.crearPersona("Rodriguez", "Julieth", "Colombia", 1988, 9, 30);
		Persona p3 = fac.crearPersona("Vera", "Fredy", "Colombia", 1980, 5, 16);
		
		/* 
		 * ******************************************
		 * CREA PELICULA
		 * ******************************************
		 */
		
		Pelicula pe1 = fac.crearPelicula("Eternals", 2020, "Unas personas espaciales atoradas en la tierra", "accion", "USA");
		Pelicula pe2 = fac.crearPelicula("Cantinflas", 1982, "Un se�or mexicano bastante gracioso, aunque anticuado para estos tiempos", "comedia", "Mexico");
		
		// -----------------------------------
		// AGREGANDO INFORMACION A LA PELICULA
		// -----------------------------------
		
		pe1.setActor(p1);
		pe1.setActor(p2);
		pe1.setDirector(p1);
		pe1.setGuionista(p3);
		pe1.setTrailer("https://www.youtube.com/asGfs234", 3);
		pe1.setTrailer("https://www.youtube.com/uytGhbd3", 2);
		
		pe2.setGuionista(p3);
		pe2.setDirector(p2);
		pe2.setTrailer("https://www.youtube.com/asGfs234", 3);
		
		/* 
		 * ------------------------------------------
		 * OBTIENE INFORMACION
		 * ------------------------------------------
		 */
		
		System.out.println(fac.imprimirInformacionPelicula(pe1));
		System.out.println(fac.imprimirInformacionPelicula(pe2));
		
	}
	
}
