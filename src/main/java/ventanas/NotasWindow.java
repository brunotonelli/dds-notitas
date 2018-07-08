package ventanas;

import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import domain.Asignacion;
import view_model.NotasViewModel;

public class NotasWindow extends SimpleWindow<NotasViewModel>  {

	private static final long serialVersionUID = 1L;

	public NotasWindow(WindowOwner parent, NotasViewModel model) {
		super(parent, model);
	}
	
	@Override
	public void createFormPanel(Panel formPanel) {
		this.setTitle("Notas de Bruno Tonelli");
		new Label(formPanel).setText("Ingrese numero de legajo");
		new Label(formPanel).bindValueToProperty("nombreEstudiante");
		new TextBox(formPanel)
			.setWidth(250)
			.bindValueToProperty("legajoBusqueda");
		
		Table<Asignacion> tableNotas = new Table<>(formPanel, Asignacion.class);
		tableNotas.bindItemsToProperty("asignaciones");
		
		Column<Asignacion> columnaNombreTarea = new Column<Asignacion>(tableNotas);
		columnaNombreTarea.setTitle("Tarea");
		columnaNombreTarea.bindContentsToProperty("tarea.descripcion");
		columnaNombreTarea.setFixedSize(250);
		
		Column<Asignacion> columnaNota = new Column<Asignacion>(tableNotas);
		columnaNota.setTitle("Nota");
		columnaNota.bindContentsToProperty("nota");
		columnaNota.setFixedSize(250);
		
		tableNotas.setHeight(30000);
		tableNotas.setWidth(60000);

	}

	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
		
	}

	
	
}
