package ventanas;

import java.awt.Color;
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
		
		this.setMinWidth(300);
		this.setIconImage("src/main/resources/icono.png");
		NotasViewModel model = this.getModelObject();
		this.setTitle("UTN - Notas - " + model.getNombreEstudiante());
				
		Table<Asignacion> tableNotas = new Table<>(formPanel, Asignacion.class);
		tableNotas.setHeight(300);
		tableNotas.bindItemsToProperty("asignaciones");
		
		Column<Asignacion> columnaNombre = new Column<Asignacion>(tableNotas);
		columnaNombre.setTitle("Asignacion");
		columnaNombre.bindContentsToProperty("nombre");
		columnaNombre.setFixedSize(100);
		
		Column<Asignacion> columnaNota = new Column<Asignacion>(tableNotas);
		columnaNota.setTitle("Notas");
		columnaNota.bindContentsToProperty("notas").setTransformer(notas -> transformer((List<Nota>) notas));;
		columnaNota.setFixedSize(200);
		
		Column<Asignacion> columnaAprobada = new Column<Asignacion>(tableNotas);
		columnaAprobada.setTitle("Aprobado");
		columnaAprobada.bindContentsToProperty("estaAprobada");
		columnaAprobada.bindForeground("colorNota");
		columnaAprobada.setFixedSize(100);
		

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
