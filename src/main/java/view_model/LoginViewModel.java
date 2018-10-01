package view_model;

import java.util.ArrayList;
import java.util.List;

import domain.exception.SinEstudiantesException;
import org.uqbar.commons.model.annotations.Observable;

import data.DataEstudiantes;
import domain.Estudiante;

@Observable
public class LoginViewModel {

    private List<Estudiante> estudiantes;
    private Estudiante seleccionado;

    public LoginViewModel() {
        estudiantes = DataEstudiantes.getInstancia().getEstudiantes();
        seleccionado = this.estudiantes.stream().findFirst().orElseThrow(SinEstudiantesException::new);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Estudiante getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Estudiante seleccionado) {
        this.seleccionado = seleccionado;
    }
}
