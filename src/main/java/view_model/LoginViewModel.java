package view_model;
import org.uqbar.commons.model.annotations.Observable;
import data.ServiceNotitas;
import domain.Estudiante;

@Observable
public class LoginViewModel {

    private String legajo;

    public LoginViewModel() {
    	
    }

    public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public Estudiante getSeleccionado() {
    	return new ServiceNotitas().getEstudiante(legajo);
    }
	
	public String getImagePath() {
	    return "logo.png";
	}

}
