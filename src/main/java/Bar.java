// Observer Pattern
// Subject (Bar): o Bar é quem mantém o estado “happy hour” e a lista de observadores.
// Ele só sabe:
// - Que tem uma lista de observadores (observers).
// - Que deve notificar todos os observadores quando o estado mudar.

import java.util.ArrayList;
import java.util.List;

public abstract class Bar {
    protected List<BarObserver> observers;

    public Bar() {
        this.observers = new ArrayList<>();
    }

    // Métodos abstratos
    public abstract boolean isHappyHour();
    public abstract void startHappyHour();
    public abstract void endHappyHour();

    // Gerenciamento de observadores
    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    // Notificação dos observadores
    protected void notifyObservers() {
        for (BarObserver observer : observers) {
            if (isHappyHour()) {
                observer.happyHourStarted(this);
            } else {
                observer.happyHourEnded(this);
            }
        }
    }
}
