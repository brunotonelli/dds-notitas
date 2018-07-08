package data;

import java.util.ArrayList;
import java.util.List;

import domain.Asignacion;
import domain.TareaHistoria;
import domain.TareaLengua;
import domain.TareaMatematica;


public class DataAsignaciones {
	private static DataAsignaciones instancia = new DataAsignaciones();
	private List<Asignacion> asignaciones;
	
	public DataAsignaciones() {
		asignaciones = new ArrayList<Asignacion>();
		cargarEstudiantes();
	}
	
	public static DataAsignaciones getInstancia() {
		return instancia;
	}
	
	private void cargarEstudiantes() {
		asignaciones.add(new Asignacion(new TareaHistoria()));
		asignaciones.add(new Asignacion(new TareaLengua()));
		asignaciones.add(new Asignacion(new TareaMatematica()));
	}
}
