package pelicula.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Fachada {

	public Persona crearPersona(String apellido, String nombre, String nacionalidad, int anioNac, int mesNac, int diaNac) {
		Persona p1 = new Persona();
		p1.setApellido(apellido);
		p1.setNacionalidad(nacionalidad);
		p1.setNombre(nombre);
		
		Calendar c1 = Calendar.getInstance();
		c1.set(anioNac, mesNac-1, diaNac);
		
		p1.setFechaNacimiento(c1);
		
		return p1;
	}
	
	/**
	 * 
	 * @param titulo
	 * @param anio Año de lanzamiento
	 * @param sinopsis
	 * @param genero accion, comedia, drama, terror, romance, aventura, scifi
	 * @return
	 */
	public Pelicula crearPelicula(String titulo, int anio, String sinopsis, String genero, String pais) {
		Pelicula pe = new Pelicula();
		pe.setTitulo(titulo);
		pe.setAnio(anio);
		pe.setSinopsis(sinopsis);
		pe.setGenero(obtenerGeneroEnum(genero));
		pe.setPais(pais);
		
		return pe;
	}
	
	private Genero obtenerGeneroEnum(String genero) {
		
		Genero gen = null;
		
		switch(genero) {
		case "accion":
			gen = Genero.ACCION;
			break;
		case "comedia":
			gen = Genero.COMEDIA;
			break;
		case "drama":
			gen = Genero.DRAMA;
			break;
		case "terror":
			gen = Genero.TERROR;
			break;
		case "romance":
			gen = Genero.ROMANCE;
			break;
		case "aventura":
			gen = Genero.AVENTURA;
			break;
		case "scifi":
			gen = Genero.SCIFI;
			break;
		}
		
		
		return gen;
	}
	
	public String imprimirInformacionPelicula(Pelicula p) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("----------------------------------\n");
		sb.append("DESCRIPCIÓN PELÍCULA\n");
		sb.append("Titulo: "+p.getTitulo()+"\n");
		sb.append("Año: "+p.getAnio()+"\n");
		sb.append("Sinopsis: "+p.getSinopsis()+"\n");
		sb.append("Pais: "+p.getPais()+"\n");
		
		sb.append("Actores: "+obtenerNombresPersonas(p.getActores())+"\n");
		sb.append("Directores: "+obtenerNombresPersonas(p.getDirectores())+"\n");
		sb.append("Productores: "+obtenerNombresPersonas(p.getProductores())+"\n");
		sb.append("Guionistas: "+obtenerNombresPersonas(p.getGuionistas())+"\n");
		
		if(p.getTrailers()!=null && p.getTrailers().length()>0)
			sb.append("Trailers: \n"+p.getTrailers()+"\n");
		else
			sb.append("Trailers: No hay información");
		
		return sb.toString();
	}
	
	private String obtenerNombresPersonas(ArrayList<Persona> lista) {
		String nombres = "";
		
		if(lista!=null && lista.size()>0) {		
			for(Persona pers : lista) {
				nombres += pers.getNombre() + " " + pers.getApellido() + ", ";
			}		
			
			// Para quitar la coma (,) luego de la última persona
			nombres = nombres.substring(0, nombres.length() - 2);
		}else
			nombres = "No hay información";
		
		return nombres;
	}
	
}
