package temas;

import lista.Boton;
import lista.Checkbox;
import lista.GUIFactory;

public class TemaDark implements GUIFactory {
    @Override
    public Boton createButton() {
        return new Dark();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
