package ventanas;

import java.util.List;

import org.apache.commons.collections15.Transformer;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import domain.Asignacion;
import domain.Nota;
import view_model.NotasViewModel;

public class NotasWindow extends SimpleWindow<NotasViewModel>  {

	private static final long serialVersionUID = 1L;

	public NotasWindow(WindowOwner parent, NotasViewModel model) {
		super(parent, model);
	}
	
	@Override
	public void createFormPanel(Panel formPanel) {
		String nombre = this.getModelObject().getNombreEstudiante();
		this.setTitle("Notas de "+nombre);
		new Label(formPanel).setText("Notas de "+nombre);
		
		Table<Asignacion> tableNotas = new Table<>(formPanel, Asignacion.class);
		tableNotas.bindItemsToProperty("asignaciones");
		
		Column<Asignacion> columnaNombre = new Column<Asignacion>(tableNotas);
		columnaNombre.setTitle("Asignacion");
		columnaNombre.bindContentsToProperty("tarea.nombre");
		columnaNombre.setFixedSize(200);
		
		Column<Asignacion> columnaNota = new Column<Asignacion>(tableNotas);
		columnaNota.setTitle("Notas");
		columnaNota.bindContentsToProperty("notas").setTransformer(notas -> transformer((List<Nota>) notas));;
		columnaNota.setFixedSize(200);
		
		tableNotas.setHeight(30000);
		tableNotas.setWidth(60000);

	}
	
	private String transformer(List<Nota> notas) {
		String a = "";
		for (Nota nota : notas)
			a += nota.valor().toString() + "  ";
		return a;
	}
	
	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
		
	}

	
	
}
