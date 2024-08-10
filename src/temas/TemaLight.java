package temas;

import lista.Boton;
import lista.Checkbox;
import lista.GUIFactory;

public class TemaLight implements GUIFactory {
    @Override
    public Boton createButton() {
        return new Ligth();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
