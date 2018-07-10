package data;

import java.util.ArrayList;
import java.util.List;

import domain.Asignacion;
import domain.Estudiante;
import domain.NotaConceptual;
import domain.NotaNumerica;
import domain.Tarea;

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
		Estudiante bruno = new Estudiante("Bruno Tonelli", "159036-4", "brunotonelli");
		bruno.evaluarlo(new Asignacion(Tarea.HISTORIA), NotaConceptual.MB);
		bruno.evaluarlo(new Asignacion(Tarea.HISTORIA), NotaConceptual.B);
		bruno.evaluarlo(new Asignacion(Tarea.HISTORIA), new NotaNumerica(8.0));
		bruno.evaluarlo(new Asignacion(Tarea.LENGUA), new NotaNumerica(8.74));
		bruno.evaluarlo(new Asignacion(Tarea.LENGUA), new NotaNumerica(9.1));
		
		Estudiante rodrigo = new Estudiante("Rodrigo Bustos", "123456-7", "rbustos93");
		rodrigo.evaluarlo(new Asignacion(Tarea.MATEMATICA), new NotaNumerica(9.6));
		rodrigo.evaluarlo(new Asignacion(Tarea.MATEMATICA), new NotaNumerica(10.0));
		rodrigo.evaluarlo(new Asignacion(Tarea.MATEMATICA), NotaConceptual.B_mas);
		
		Estudiante nicolas = new Estudiante("Nicolas Gomez", "123456-7", "nicolas-m-gomez");
		nicolas.evaluarlo(new Asignacion(Tarea.HISTORIA), NotaConceptual.B_menos);
		nicolas.evaluarlo(new Asignacion(Tarea.LENGUA), new NotaNumerica(7.3));
		nicolas.evaluarlo(new Asignacion(Tarea.LENGUA), new NotaNumerica(6.5));
		nicolas.evaluarlo(new Asignacion(Tarea.MATEMATICA), NotaConceptual.R);
		nicolas.evaluarlo(new Asignacion(Tarea.MATEMATICA), NotaConceptual.M);
		estudiantes.add(bruno);
		estudiantes.add(rodrigo);
		estudiantes.add(nicolas);
	}
	
	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}
}
