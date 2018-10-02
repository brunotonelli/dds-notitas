package domain;

public class NotaConceptual extends Nota {
	
	public NotaConceptual(String valor) {
		super(valor);
	}

	@Override
	public boolean aprobada() {
		return this.valor().equalsIgnoreCase("MB") ||
				this.valor().equalsIgnoreCase("B+") ||
				this.valor().equalsIgnoreCase("B") ||
				this.valor().equalsIgnoreCase("B-") || 
				this.valor().equalsIgnoreCase("R+");
	}
	

}
