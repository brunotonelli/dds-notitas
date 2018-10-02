package domain;

public class NotaNumerica extends Nota {
	
	public NotaNumerica(String valor) {
		super(valor);
	}

	@Override
	public boolean aprobada() {
		double n = Double.parseDouble(valor);
		return n >= 6;
	}
}
