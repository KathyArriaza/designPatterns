package temas;

import lista.Boton;
import lista.Checkbox;

public class Ligth implements Boton {
    @Override
    public void paint() {
        System.out.println("Pintar claro el boton .");
    }
}

 class LightCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Pintar claro el Checkbo");
    }
}