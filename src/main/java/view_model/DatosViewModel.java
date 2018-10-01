package view_model;

import org.uqbar.commons.model.annotations.Observable;

import domain.Estudiante;

@Observable
public class DatosViewModel {

    private final Estudiante estudiante;
    private String nombre;
    private String apellido;
	private String legajo;
    private String usuario;

    public DatosViewModel(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.nombre = this.estudiante.getNombre();
        this.legajo = this.estudiante.getLegajo();
        this.usuario = this.estudiante.getUsuario();
    }

    public void actualizar() {
        this.estudiante.actualizarDatos(this.nombre, this.apellido, this.legajo, this.usuario);
        System.out.print("La actualizacion se ha realizado de manera correcta");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
