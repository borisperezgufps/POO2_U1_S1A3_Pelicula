package pelicula.model;

import java.util.ArrayList;

public class Pelicula {
	
	private String titulo, sinopsis, pais;
	private int anio;
	private Genero genero;
	private ArrayList<Trailer> trailers;
	private ArrayList<Persona> actores;	
	private ArrayList<Persona> directores;
	private ArrayList<Persona> productores;
	private ArrayList<Persona> guionistas;
	
	public Pelicula() {
		trailers = new ArrayList<Trailer>();
		actores = new ArrayList<Persona>();
		directores = new ArrayList<Persona>();
		productores = new ArrayList<Persona>();
		guionistas = new ArrayList<Persona>();
	}
	
	
	public String getTrailers() {
		
		StringBuffer lista = new StringBuffer();
		
		for(Trailer t : trailers) {
			lista.append("- URL: " + t.getUrl() + " ::: Duración: "+t.getDuracion()+" mins \n");
		}
		
		return lista.toString();
	}
	public void setTrailer(String url, int duracion) {		
		Trailer t = new Trailer();
		t.setDuracion(duracion);
		t.setUrl(url);
		trailers.add(t);
	}
	
	public ArrayList<Persona> getActores() {
		return actores;
	}
	public void setActor(Persona actor) {
		actores.add(actor);
	}
	
	public ArrayList<Persona> getDirectores() {
		return directores;
	}	
	public void setDirector(Persona director) {
		directores.add(director);
	}
	
	public ArrayList<Persona> getProductores() {
		return productores;
	}	
	public void setProductor(Persona productor) {
		productores.add(productor);
	}
	
	public ArrayList<Persona> getGuionistas() {
		return guionistas;
	}	
	public void setGuionista(Persona guionista) {
		guionistas.add(guionista);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	

}
