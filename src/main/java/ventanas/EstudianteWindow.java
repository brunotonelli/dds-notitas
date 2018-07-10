package ventanas;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import domain.Estudiante;
import view_model.DatosViewModel;
import view_model.NotasViewModel;

public class EstudianteWindow extends SimpleWindow<Estudiante> {
	
	public EstudianteWindow(WindowOwner parent, Estudiante model) {
		super(parent, model);
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		Estudiante model = this.getModelObject();
		new Label(mainPanel).setText("Logeado como " + model.getNombre());
		
		new Button(mainPanel)
		.setCaption("Ver notas")
		.onClick(() -> new NotasWindow(this, new NotasViewModel(model)).open());
		
		new Button(mainPanel)
		.setCaption("Modificar datos")
		.onClick(() -> new DatosWindow(this, new DatosViewModel(model)).open());
	}

}
