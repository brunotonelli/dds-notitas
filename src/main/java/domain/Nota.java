package domain;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Nota {
	
	public Nota(String valor) {
		this.valor = valor;
	}
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("value")
	protected String valor;
	
	@JsonProperty("created_at")
	private String fechaCreacion;
	
	@JsonProperty("updated_at")
	private String fechaActualizacion;
	
	public String valor() {
		return valor;
	}
	
	public abstract boolean aprobada();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
