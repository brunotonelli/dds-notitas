package data;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import domain.Asignacion;
import domain.Estudiante;
import domain.ResponseAsignaciones;

public class MapperNotitas {
	
	public MapperNotitas() {
		
	}
	
	public static Estudiante mapEstudiante(String json) {
		try {
			return new ObjectMapper().readValue(json, Estudiante.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<Asignacion> mapAsignaciones(String json) {
		try {
			ResponseAsignaciones r = new ObjectMapper().readValue(json, ResponseAsignaciones.class);
			return r.getAsignaciones();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
