package pelicula.model;

import java.util.ArrayList;

public class Trailer {

	private String url;
	private int duracion;
	private ArrayList<Persona> editores;
	
	public Trailer() {
		editores = new ArrayList<Persona>();
	}
	
	public ArrayList<Persona> getEditores() {
		return editores;
	}
	public void setEditor(Persona actor) {
		editores.add(actor);
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}
