// Observer Pattern
// ConcreteObserver: HumanClient decide como reagir às notificações.
// Pode imprimir mensagens, preparar pedidos, atualizar UI, etc.
// O Bar não precisa saber nada sobre a lógica interna do HumanClient.

// Strategy Pattern
// Context
public class HumanClient implements Client {
    private OrderingStrategy strategy;

    public HumanClient(OrderingStrategy strategy) {
        this.strategy = strategy;
    }

    public void happyHourStarted(Bar bar) {
        strategy.happyHourStarted((StringBar) bar);
    }

    public void happyHourEnded(Bar bar) {
        strategy.happyHourEnded((StringBar) bar);
    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }
}

