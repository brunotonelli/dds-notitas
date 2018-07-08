package model;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class EstudianteModel {
	
	private String nombre;
	private String legajo;
	private String usuario;
	
	public EstudianteModel(String nombre, String legajo, String usuario) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.usuario = usuario;
	}
	
	public EstudianteModel() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLegajo() {
		return legajo;
	}


	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
