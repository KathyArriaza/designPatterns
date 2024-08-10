import lista.Boton;
import lista.Checkbox;
import lista.GUIFactory;
import temas.TemaDark;
import temas.TemaLight;

public class Main {
    private Boton boton;
    private Checkbox checkbox;

    public Main(GUIFactory factory) {
        boton = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        boton.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        GUIFactory factory;

        // Se puede cambiar la fábrica según el tema deseado
        String theme = "dark"; // Cambia a "light" para el tema claro

        if (theme.equals("dark")) {
            factory = new TemaDark();
        } else {
            factory = new TemaLight();
        }

        Main app = new Main(factory);
        app.paint();
    }
}