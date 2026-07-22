// Observer Pattern
// Observer: Define o que um observador precisa implementar.
// No caso, qualquer cliente que queira ser notificado do happy hour deve implementar esses métodos.

public interface BarObserver {
    void happyHourStarted(Bar bar);
    void happyHourEnded(Bar bar);
}


// Conceito do Observer Pattern
// O Observer Pattern é usado quando você quer que objetos sejam notificados automaticamente sobre mudanças em outro objeto,
// sem que o objeto observado precise saber quem são ou o que fazem os observadores.

// O Subject (ou Observable) mantém uma lista de observadores e notifica todos quando há uma mudança de estado importante.
// O Observer é qualquer objeto que deseja ser notificado.
// O ConcreteSubject é a implementação específica do Subject.
// O ConcreteObserver reage às notificações.

// Analogia simples
// Um usuário posta uma atualização → Subject
// Os seguidores recebem notificações → Observers
// O usuário não precisa saber quem são ou o que eles fazem com a notificação.