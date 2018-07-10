package domain;

public enum NotaConceptual implements Nota {
	MB (10.0),
	MB_menos (9.0),
	B_mas (8.0),
	B (7.0),
	B_menos (6.0),
	R_mas (5.0),
	R (4.0),
	R_menos (3.0),
	M_mas (2.0),
	M (1.0);
	
	private Double valor;
	
	private NotaConceptual(Double valor) {
		this.valor = valor;
	}
	
	public Double valor() {
		return valor;
	}

}
