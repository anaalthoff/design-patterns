// Command Pattern
// Essa classe é um dos ConcreteCommand: implementações específicas da ação

// Composite Pattern
// Folha: objetos individuais que implementam o Component.
public class StringInverter implements StringTransformer {
    public void execute(StringDrink drink) {
        StringBuilder sb = new StringBuilder(drink.getText());
        drink.setText(sb.reverse().toString());
    }
}