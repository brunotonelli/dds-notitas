package domain;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	private String nombre;
	private String legajo;
	private String usuario;
	private List<Asignacion> asignaciones;
	
	public Estudiante(String nombre, String legajo, String usuario) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.usuario = usuario;
		this.asignaciones = new ArrayList<Asignacion>();
	}
	
	public Estudiante() {}
	
	public void nuevaAsignacion(Asignacion asignacion) {
		asignaciones.add(asignacion);
	}	
	
	public String nombre() {
		return nombre;
	}
	
	public String legajo() {
		return legajo;
	}
	
	public String usuario() {
		return usuario;
	}
	
	public void nombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void legajo(String legajo) {
		this.legajo = legajo;
	}
	
	public void usuario(String usuario) {
		this.usuario = usuario;
	}
}
