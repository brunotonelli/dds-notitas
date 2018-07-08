package view_model;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import data.DataEstudiantes;
import domain.Estudiante;
import model.EstudianteModel;

@Observable
public class LoginViewModel {
	
	private List<EstudianteModel> estudiantes;
	private EstudianteModel seleccionado;
	
	public LoginViewModel() {
		estudiantes = new ArrayList<EstudianteModel>();
		//convierto las entidades en modelos
		DataEstudiantes.getInstancia().getEstudiantes()
			.forEach(e -> estudiantes.add(new EstudianteModel(e.nombre(), e.legajo(), e.usuario())));
	}
		
	public List<EstudianteModel> getEstudiantes() {
		return estudiantes;
	}

	public EstudianteModel getSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(EstudianteModel seleccionado) {
		this.seleccionado = seleccionado;
	}
}
