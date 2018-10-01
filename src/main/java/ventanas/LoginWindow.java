package ventanas;

import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.widgets.Button;
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
		
		new Label(mainPanel).setText("Legajo:");
        new TextBox(mainPanel).bindValueToProperty("legajo");
				
		new Button(mainPanel)
	    .setCaption("Log in")
	    .onClick(() -> new EstudianteWindow(this, this.getModelObject().getSeleccionado()).open())
	    .setAsDefault()
	    .disableOnError();
		
	}

}
