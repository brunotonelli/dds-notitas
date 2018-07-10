package view_model;

import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import domain.Asignacion;
import domain.Estudiante;

@Observable
public class NotasViewModel {
	
	private String nombreEstudiante;
	private List<Asignacion> asignaciones;
	
	public NotasViewModel(Estudiante estudiante) {
		this.nombreEstudiante = estudiante.getNombre();
		this.setAsignaciones(estudiante.getAsignaciones());
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(List<Asignacion> asignaciones) {
		this.asignaciones = asignaciones;
	}

}
