package data;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import domain.Estudiante;

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
}
