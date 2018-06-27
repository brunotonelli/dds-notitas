package views_estudiante;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

import domain.Estudiante;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader

public class ActualizarView extends MainWindow<ActualizarViewModel> {

  private static final long serialVersionUID = 1L;

  public ActualizarView() {
	super(new ActualizarViewModel(new Estudiante("Bruno Tonelli", "1590364", "brunotonelli")));
  }

  @Override
  public void createContents(Panel mainPanel) {
	  
  }
  
  public static void main(String[] args) {
	  new ActualizarView().startApplication();
  }
  
}
