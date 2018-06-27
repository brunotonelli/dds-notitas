package domain;

public class NotaConceptual implements Nota {
	
	private Letra letra;
	
	public NotaConceptual(Letra letra) {
		this.letra = letra;
	}
	
	public Double valor() {
		switch (letra) {
			case MB: 		return 10.0;
			case MB_menos: 	return 9.0;
			case B_mas: 	return 8.0;
			case B: 		return 7.0;
			case B_menos: 	return 6.0;
			case R_mas:		return 5.0;
			case R: 		return 4.0;
			case R_menos: 	return 3.0;
			case M_mas: 	return 2.0;
			case M: 		return 1.0;
			default:		return 0.0;
		}
	}

}
