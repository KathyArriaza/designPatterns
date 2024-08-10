package temas;

import lista.Boton;
import lista.Checkbox;

import java.util.function.BiConsumer;

public class Dark implements Boton {

    @Override
    public void paint() {
        System.out.println("Pintar oscuro el boton");
    }
}

class DarkCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Pintar oscuro el checkbox");
    }
}
