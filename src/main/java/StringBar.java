// Observer Pattern
// ConcreteSubject: StringBar mantém o estado interno happyHour.
// Quando o happy hour começa ou termina, ele chama notifyObservers().
// Ele não precisa saber quem está observando ou o que eles fazem.

public class StringBar extends Bar {
    private boolean happyHour = false;

    public boolean isHappyHour() {
        return happyHour;
    }

    public void startHappyHour() {
        happyHour = true;
        notifyObservers();
    }

    public void endHappyHour() {
        happyHour = false;
        notifyObservers();
    }

    // Novo método do Strategy Pattern
    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}

// [ StringBar (Subject) ] --------------------------+
//   - happyHour                                    |
//   - observers []                                 |
//   - startHappyHour()                             |
//   - endHappyHour()                               |
//                                                  |
//                                                  v
//               +-------------------+   +-------------------+
//               | HumanClient       |   | HumanClient       |
//               | happyHourStarted()|   | happyHourStarted()|
//               | happyHourEnded()  |   | happyHourEnded()  |
//               +-------------------+   +-------------------+

// StringBar notifica todos os HumanClients.
// Os clientes reagem de forma independente.
// StringBar não precisa conhecer os clientes.
