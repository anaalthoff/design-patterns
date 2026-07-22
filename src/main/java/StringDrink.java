// Command Pattern
// Essa classe é o Receiver: o objeto que sofre a ação

// Composite Pattern
// Receiver: representa o objeto que será transformado pelos comandos.
public class StringDrink {
    private String text;

    public StringDrink(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
