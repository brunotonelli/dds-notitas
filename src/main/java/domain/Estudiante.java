package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.uqbar.commons.model.annotations.Observable;

import com.fasterxml.jackson.annotation.JsonProperty;

@Observable
public class Estudiante {
	
	@JsonProperty("first_name")
	private String nombre;
	
	@JsonProperty("last_name")
	private String apellido;
	
	@JsonProperty("code")
	private String legajo;
	
	@JsonProperty("github_user")
	private String usuario;
	private List<Asignacion> asignaciones;
	
	public Estudiante(String nombre, String apellido, String legajo, String usuario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.usuario = usuario;
		this.asignaciones = new ArrayList<Asignacion>();
	}
	
	public Estudiante() {}


	public void actualizarDatos(String nombre, String apellido, String legajo, String usuario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.usuario = usuario;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void nuevaAsignacion(Asignacion asignacion) {
		asignaciones.add(asignacion);
	}	
	
	public void evaluarlo(Asignacion asignacion, Nota nota) {
		Optional<Asignacion> asd = asignaciones.stream().filter(a -> a.esIgualA(asignacion)).findFirst();
		if (!asd.isPresent()) {
			nuevaAsignacion(asignacion);
			asignacion.evaluar(nota);
		}
		else
			asd.get().evaluar(nota);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getLegajo() {
		return legajo;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void getNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void getLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	public void getUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}
	
	public void setAsignaciones(List<Asignacion> asignaciones) {
		this.asignaciones = asignaciones;
	}

}
