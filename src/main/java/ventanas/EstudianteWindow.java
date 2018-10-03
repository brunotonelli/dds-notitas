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
		
		this.setMinWidth(200);
		this.setMinHeight(200);
		this.setIconImage("src/main/resources/icono.png");
		this.setTitle("UTN - "+ model.getNombre() + " " + model.getApellido());
		mainPanel.setWidth(200);
		
		new Button(mainPanel)
		.setCaption("Ver notas")
		.onClick(() -> new NotasWindow(this, new NotasViewModel(model)).open())
		.setWidth(200)
		.setHeight(65);		
		
		new Button(mainPanel)
		.setCaption("Modificar datos")
		.onClick(() -> new DatosWindow(this, new DatosViewModel(model)).open())
		.setWidth(200)
		.setHeight(65);
	}

}
