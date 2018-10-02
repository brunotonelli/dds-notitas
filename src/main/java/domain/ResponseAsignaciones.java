package domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseAsignaciones {

	@JsonProperty("assignments")
	List<Asignacion> asignaciones;
	
	public ResponseAsignaciones() {
		
	}
	
	public ResponseAsignaciones(List<Asignacion> a) {
		this.asignaciones = a;
	}
	
	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}
}
