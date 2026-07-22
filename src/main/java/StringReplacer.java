// Command Pattern
// Essa classe é um dos ConcreteCommand: implementações específicas da ação

// Composite Pattern
// Folha: objetos individuais que implementam o Component.
public class StringReplacer implements StringTransformer {

    private final char from;
    private final char to;

    public StringReplacer(char from, char to) {
        this.from = from;
        this.to = to;
    }

    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(from, to));
    }
}
