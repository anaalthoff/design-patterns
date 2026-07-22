// Command Pattern
// Essa classe é o Invoker: quem chama a execução dos comandos, sem saber como funcionam
// O invoker separa orquestração da implementação da ação → isso é o padrão em ação.

// Composite Pattern
// Cliente: uso final. Pode adicionar tanto transformadores individuais quanto grupos de transformadores
import java.util.List;

public class StringRecipe {

    private final List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public void mix(StringDrink drink) {
        for (StringTransformer t : transformers) {
            t.execute(drink);
        }
    }
}
