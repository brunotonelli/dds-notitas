package domain;

public enum Tarea {
	HISTORIA ("Tarea de historia"),
	LENGUA ("Tarea de lengua"),
	MATEMATICA ("Tarea de matematica");
	
	private String nombre;
	
	private Tarea(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
