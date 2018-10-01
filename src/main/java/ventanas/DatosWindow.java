package ventanas;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MessageBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import view_model.DatosViewModel;
import view_model.NotasViewModel;

public class DatosWindow extends SimpleWindow<DatosViewModel> {

    public DatosWindow(WindowOwner parent, DatosViewModel model) {
        super(parent, model);
    }

    @Override
    protected void addActions(Panel actionsPanel) {
    }

    @Override
    protected void createFormPanel(Panel mainPanel) {

        new Label(mainPanel).setText("Nombre y Apellido:");
        new TextBox(mainPanel).bindValueToProperty("nombre");

        new Label(mainPanel).setText("Legajo:");
        new TextBox(mainPanel).bindValueToProperty("legajo");

        new Label(mainPanel).setText("Usuario:");
        new TextBox(mainPanel).bindValueToProperty("usuario");

        new Button(mainPanel)
                .setCaption("Actualizar")
                .onClick(() -> this.actualizar());
    }

    private void actualizar() {
        this.getModelObject().actualizar();
        MessageBox messageBox = new MessageBox(this, MessageBox.Type.Information);
        messageBox.setMessage("Se han actualizado los datos de manera correcta");
        messageBox.open();
    }

}
