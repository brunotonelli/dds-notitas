package ventanas;

import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.graphics.Image;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.KeyWordTextArea;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.ListBuilder;
import org.uqbar.lacar.ui.model.bindings.Binding;

import domain.Estudiante;
import view_model.LoginViewModel;

public class LoginWindow extends SimpleWindow<LoginViewModel>{

	public LoginWindow(WindowOwner parent) {
		super(parent, new LoginViewModel());
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		
		this.setMinWidth(300);
		this.setMinHeight(300);
		this.setIconImage("src/main/resources/icono.png");
		this.setTitle("UTN - Notas");
		
		Panel formPanel = new Panel(mainPanel);
		formPanel.setLayout(new ColumnLayout(2));
		Panel col1 = new Panel(formPanel);
		Panel col2 = new Panel(formPanel);
		
		new Label(col1).bindImageToProperty("imagePath", imagePath -> new Image((String) imagePath)); 	

		new Label(col2).setText("Bienvenido al sistema").alignLeft();
		new Label(col2).setText("Lector de Notas. Para").alignLeft();
		new Label(col2).setText("ingresar, complete su").alignLeft();
		new Label(col2).setText("legajo y presione").alignLeft();
		new Label(col2).setText("Ingresar").alignLeft();
		new Label(col2);
		new Label(col2).setText("Legajo").alignCenter();
        new TextBox(col2).bindValueToProperty("legajo");
				
		new Button(col2)
	    .setCaption("Ingresar")
	    .onClick(() -> new EstudianteWindow(this, this.getModelObject().getSeleccionado()).open())
	    .setAsDefault()
	    .disableOnError();
		
	}

}
