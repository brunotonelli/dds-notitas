package domain;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import com.fasterxml.jackson.annotation.JsonProperty;

@Observable
public class Asignacion {
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("title")
	private String nombre;
	
	@JsonProperty("description")
	private String descripcion;
	
	@JsonProperty("grades")
	private List<Nota> notas;
	
	public Asignacion() {}
	
	public Asignacion(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.notas = new ArrayList<Nota>();
	}
	
	public void evaluar(Nota nota) {
		notas.add(nota);
	}
	
	public Nota ultimaNota() {
		if (notas != null && !notas.isEmpty())
			return notas.get(notas.size() - 1);
		return new NotaNumerica("0");
	}
	
	public boolean aprobada() {
		return ultimaNota().aprobada();
	}
	
	public String estaAprobada() {
		return aprobada() ? "SÍ" : "NO";
	}
	
	public Color colorNota() {
		return aprobada() ? Color.GREEN : Color.RED;
	}
	
	public List<Nota> getNotas() {
		return notas;
	}
	
	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	public boolean esIgualA(Asignacion otra) {
		return otra.getNombre() == this.getNombre(); 
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
