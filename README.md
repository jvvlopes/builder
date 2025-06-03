![Builder](/Builder.jpg)

# Builder - Criação de Personagem de Jogo

## Descrição

Este projeto demonstra a aplicação do padrão de projeto Builder para a criação de personagens em um jogo. Cada personagem pode possuir atributos como nome, classe, nível, força e inteligência. O uso do builder permite que o objeto seja construído de forma flexível, com diferentes combinações de atributos, sem a necessidade de múltiplos construtores.

## Padrão Utilizado

O padrão Builder é um padrão de criação que facilita a construção de objetos complexos, separando o processo de construção da representação final. Isso é especialmente útil quando um objeto possui muitos atributos opcionais.

Neste projeto:

- A classe `Personagem` representa o objeto complexo a ser construído.
- A classe `PersonagemBuilder` é responsável por configurar os atributos desejados e construir a instância de `Personagem`.
- O padrão é aplicado através de métodos encadeáveis que permitem definir os atributos de forma fluente antes de chamar o método `construir()` para obter o objeto final.

## Aluno

- **Nome**: João Vitor Amorim Lopes
- **Matrícula**: 0900043180
- **Curso**: Sistemas de Informação

