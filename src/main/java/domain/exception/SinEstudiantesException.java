package domain.exception;

public class SinEstudiantesException extends RuntimeException {

    public SinEstudiantesException() {
        super("El sistema debe tener estudiantes para poder ingresar");
    }
}
