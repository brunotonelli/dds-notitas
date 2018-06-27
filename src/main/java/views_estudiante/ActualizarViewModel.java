package views_estudiante;

import org.uqbar.commons.model.annotations.Observable;

import domain.Estudiante;

public class ActualizarViewModel {
	
	private String nombre;
	private String legajo;
	private String usuario;
	
	public ActualizarViewModel(Estudiante estudiante) {
		this.nombre = estudiante.nombre();
		this.legajo = estudiante.legajo();
		this.usuario = estudiante.usuario();
	}
	
}
