package ventanas;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import domain.Estudiante;
import model.EstudianteModel;

public class EstudianteWindow extends SimpleWindow<EstudianteModel> {
	
	public EstudianteWindow(WindowOwner parent, EstudianteModel model) {
		super(parent, model);
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		new Label(mainPanel).setText("Logeado como " + this.getModelObject().getNombre());
		
		new Button(mainPanel).setCaption("Ver notas");
		new Button(mainPanel).setCaption("Modificar datos");
	}

}
