package data;

import java.util.ArrayList;
import java.util.List;

import domain.Estudiante;

public class DataEstudiantes {
	
	private static DataEstudiantes instancia = new DataEstudiantes();
	private List<Estudiante> estudiantes;
	
	public DataEstudiantes() {
		estudiantes = new ArrayList<Estudiante>();
		cargarEstudiantes();
	}
	
	public static DataEstudiantes getInstancia() {
		return instancia;
	}
	
	private void cargarEstudiantes() {
		estudiantes.add(new Estudiante("Bruno Tonelli", "159036-4", "brunotonelli"));
		estudiantes.add(new Estudiante("Rodrigo Bustos", "123456-7", "rbustos93"));
		estudiantes.add(new Estudiante("Nicolas Gomez", "123456-7", "nicolas-m-gomez"));
	}
	
	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}
}
