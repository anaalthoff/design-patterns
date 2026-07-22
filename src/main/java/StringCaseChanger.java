// Command Pattern
// Essa classe é um dos ConcreteCommand: implementações específicas da ação

// Composite Pattern
// FOlha: objetos individuais que implementam o Component.
public class StringCaseChanger implements StringTransformer {
    public void execute(StringDrink drink) {
        StringBuilder sb = new StringBuilder();

        for (char c : drink.getText().toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        drink.setText(sb.toString());
    }
}
