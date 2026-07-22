# Design Patterns em Java

Implementação prática dos padrões de projeto **Observer**, **Strategy**, **Command** e **Composite** utilizando **Java**, com um cenário de um bar para demonstrar conceitos de orientação a objetos, desacoplamento e reutilização de código.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white)

# Sobre o projeto

Este projeto foi desenvolvido com o objetivo de estudar e aplicar alguns dos principais **Design Patterns (GoF)** utilizando Java.

Para tornar os conceitos mais intuitivos, foi utilizado o contexto de um **bar**, onde clientes fazem pedidos, aguardam promoções (Happy Hour) e bebidas passam por diferentes transformações antes de serem servidas.

Cada padrão foi implementado para resolver um problema específico de projeto, demonstrando como boas práticas de engenharia de software contribuem para aplicações mais organizadas, flexíveis e de fácil manutenção.

# Objetivos

- Aplicar padrões de projeto em um cenário prático.
- Exercitar os princípios da programação orientada a objetos.
- Demonstrar técnicas de desacoplamento entre componentes.
- Desenvolver soluções extensíveis e reutilizáveis.
- Validar o comportamento da aplicação por meio de testes automatizados.

# Padrões de Projeto Implementados

## Observer

Permite que clientes sejam notificados automaticamente quando ocorre uma mudança de estado no bar, como o início ou término do **Happy Hour**.

Classes relacionadas:

- `Bar`
- `BarObserver`
- `Client`

## Strategy

Permite alterar dinamicamente a estratégia utilizada pelos clientes ao realizar pedidos.

Estratégias implementadas:

- `ImpatientStrategy`
- `SmartStrategy`

Interface:

- `OrderingStrategy`

## Command

Cada transformação aplicada à bebida é encapsulada como um comando independente.

Exemplos:

- `StringInverter`
- `StringCaseChanger`
- `StringReplacer`

Interface:

- `StringTransformer`

## Composite

Permite agrupar diversas transformações em uma única sequência de execução.

Classe:

- `StringTransformerGroup`

# Estrutura do projeto

```text
src
├── main
│   └── java
│       ├── Bar.java
│       ├── BarObserver.java
│       ├── Client.java
│       ├── HumanClient.java
│       ├── OrderingStrategy.java
│       ├── SmartStrategy.java
│       ├── ImpatientStrategy.java
│       ├── StringBar.java
│       ├── StringDrink.java
│       ├── StringRecipe.java
│       ├── StringTransformer.java
│       ├── StringTransformerGroup.java
│       ├── StringCaseChanger.java
│       ├── StringInverter.java
│       └── StringReplacer.java
│
└── test
    └── java
        ├── HumanClientTest.java
        ├── OrderingStrategyTest.java
        ├── StringDrinkTest.java
        ├── StringRecipeTest.java
        └── ...
```

# Tecnologias utilizadas

- Java
- Gradle
- JUnit

# Conceitos praticados

Durante o desenvolvimento foram explorados conceitos como:

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Polimorfismo
- Interfaces
- Composição
- Design Patterns (GoF)
- Baixo acoplamento
- Alta coesão
- Testes automatizados
- Organização modular do código

# Como executar

## Clone o repositório

```bash
git clone https://github.com/anaalthoff/design-patterns.git
```

## Entre na pasta

```bash
cd design-patterns
```

## Executar os testes

```bash
./gradlew test
```

Windows

```bash
gradlew.bat test
```

## Compilar

```bash
./gradlew build
```

# Testes

O projeto possui testes automatizados para validar o comportamento das principais classes e garantir o correto funcionamento dos padrões implementados.

# Aprendizados

Este projeto permitiu aprofundar conhecimentos em:

- Observer Pattern
- Strategy Pattern
- Command Pattern
- Composite Pattern
- Orientação a Objetos
- Organização de software
- Boas práticas de desenvolvimento
- Testes unitários
