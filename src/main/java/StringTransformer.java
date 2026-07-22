// Command Pattern
// Essa interface é o Command: representa a ação

// Composite Patterna
// Component: todos os transformadores implementam essa interface
public interface StringTransformer {
    void execute(StringDrink drink);
}

// Command Pattern
// Essa interface diz:
// Todo comando deve ser capaz de transformar uma StringDrink.
// Isso é o coração do Command Pattern.

// CLIENTE (testes)
//   ⬇ monta
// Invoker: StringRecipe
//   ⬇ executa cada comando
// Command: StringTransformer (interface)
//   ⬇ implementações concretas
// ConcreteCommands:
//        - StringInverter
//   - StringCaseChanger
//   - StringReplacer
//   ⬇ atuam sobre
// Receiver: StringDrink

// E útil, porque separa o que fazer de como fazer.
// Isso permite:
// ✔ adicionar novos comandos sem mexer nos antigos
// Ex: pode criar um StringDuplicator, StringTrimmer, etc.
// ✔ definir receitas diferentes reutilizando passos
// Ex:
// StringRecipe r1 = new StringRecipe(List.of(new StringInverter(), new StringCaseChanger()));
// StringRecipe r2 = new StringRecipe(List.of(new StringReplacer('X','Y')));
// ✔ mudar ordem das transformações
// Sem mudar uma linha dos comandos.
// ✔ expandir funcionalidades (como UNDO)
// Porque cada comando sabe o que faz e como se desfaz.
// ✔ o invoker (StringRecipe) continua simples
// Ele só roda uma lista de comandos.

// ----------------------------------------------
// Composite Pattern
// O Composite Pattern é usado quando você quer tratar objetos individuais e coleções de objetos de forma uniforme.
// Ou seja, você tem uma estrutura hierárquica de objetos (uma árvore, basicamente), e quer poder chamar métodos nos objetos “folha”
// ou nos “grupos” da mesma forma, sem se preocupar se está lidando com um único objeto ou uma coleção deles.

// Component: a interface comum que define operações que podem ser feitas tanto em objetos individuais quanto em coleções.
// Leaf (folha): objetos individuais que implementam o Component.
// Composite: um objeto que contém outros Components (folhas ou outros composites) e implementa a mesma interface,
// repassando as chamadas para seus filhos.

// Aplicação no projeto:
// Component → StringTransformer (a interface).
// Todos os transformadores implementam essa interface: StringInverter, StringCaseChanger, StringReplacer.
// Leaf → transformadores individuais (StringInverter, StringCaseChanger, StringReplacer).
// Cada um executa uma operação no StringDrink.
// Composite → StringTransformerGroup.
// Ele é um transformador, mas internamente contém uma lista de outros transformadores (que podem ser folhas ou outros grupos).
// Quando chama execute() no grupo, ele simplesmente passa o execute() para cada transformador da lista, na ordem.
// Uso final (Client) → StringRecipe.
// Ao criar receitas (StringRecipe), pode-se adicionar tanto transformadores individuais quanto grupos de transformadores.
// A receita não precisa saber se está executando uma folha ou um grupo — isso é exatamente a força do Composite.