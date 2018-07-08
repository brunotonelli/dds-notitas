package view_model;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class NotasViewModel {
	
	private String nombreEstudiante;

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

}
