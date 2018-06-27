package domain;

import java.util.ArrayList;
import java.util.List;

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
	
	public Tarea tarea() {
		return tarea;
	}
	
	public List<Nota> notas() {
		return notas;
	}
	
	public void tarea(Tarea tarea) {
		this.tarea = tarea;
	}	
}
