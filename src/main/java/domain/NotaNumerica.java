package domain;

public class NotaNumerica implements Nota {
	private Double numero;
	
	public NotaNumerica(Double numero) {
		this.numero = numero;
	}

	public Double valor() {
		return numero;
	}
}
