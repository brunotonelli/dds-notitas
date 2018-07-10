package domain;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Asignacion {
	private Tarea tarea;
	private List<Nota> notas;
	
	public Asignacion(Tarea tarea) {
		this.tarea = tarea;
		this.notas = new ArrayList<Nota>();
	}
	
	public void evaluar(Nota nota) {
		notas.add(nota);
	}
	
	public Double ultimaNota() {
		if (notas != null && !notas.isEmpty())
			return notas.get(notas.size() - 1).valor();
		return 0.0;
	}
	
	public boolean aprobada() {
		return ultimaNota() >= 6;
	}
	
	public Tarea getTarea() {
		return tarea;
	}
	
	public List<Nota> getNotas() {
		return notas;
	}
	
	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
	public void tarea(Tarea tarea) {
		this.tarea = tarea;
	}	

	public boolean esIgualA(Asignacion otra) {
		return otra.tarea.getNombre() == this.tarea.getNombre(); 
	}
}
