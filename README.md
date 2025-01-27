# Atividade #1 - Implementando Listas
## ListaPurificada

Este projeto remove elementos duplicados de uma lista fornecida pelo usuário, mantendo a ordem original dos elementos. Ele também identifica e exibe os elementos duplicados encontrados na lista. O projeto é dividido em quatro classes para melhor organização e modularidade.


## Como usar
1. Execute o arquivo `Main`
2. O programa solicitará que o usuário digite os elementos da lista separados por espaço.
3. Após digitar os elementos e pressionar Enter, o programa exibirá a lista original, a lista sem duplicatas e a lista de duplicatas encontradas.


## Funcionalidades

- **Obtém uma lista de elementos (números e/ou letras) do usuário via linha de comando.**
- **Remove elementos duplicados da lista, mantendo a ordem original.**
- **Identifica e exibe os elementos duplicados da lista.**
- **Utiliza HashSet para garantir a eficiência na remoção de duplicatas.**
- **Estrutura modular com classes separadas para entrada de dados, remoção de duplicatas, utilitários de lista e execução principal.**


## Fluxograma

O fluxograma ilustra o fluxo de execução do programa e a interação entre as quatro classes: `Main`, `EntradaDeDados`, `RemovedorDeDuplicatas` e `ListaPurificada`.

![Fluxograma - ListaPurificada - Mermaid.png](Fluxograma%20-%20ListaPurificada%20-%20Mermaid.png)

**Código Mermaid**
```
graph TD

subgraph EntradaDeDados
    A[obterEntrada] --> B{Ler entrada do usuário}
    B --> C[Dividir entrada em elementos]
    C --> D[Retornar lista de elementos]
end

subgraph RemovedorDeDuplicatas
    E[remover] --> F{Criar HashSet a partir da entrada}
    F --> G[Criar nova lista a partir do HashSet]
    G --> H[Retornar lista sem duplicatas]
end

subgraph ListaPurificada
    I[encontrarDuplicatas] --> J{Criar lista e HashSet vazios}
    J --> K{Iterar sobre a entrada}
    K --> |Se elemento não está no HashSet| L[Adicionar elemento ao HashSet e à lista de resultado]
    K --> |Se elemento já está no HashSet| M[Adicionar elemento à lista de duplicatas]
    M --> K
    L --> K
    K --> N[Retornar lista de duplicatas]
end

subgraph Main
    O[main] --> P[Obter entrada do usuário]
    P --> Q[Remover duplicatas da entrada]
    Q --> R[Encontrar duplicatas na entrada]
    R --> S[Imprimir resultados]
end

P --> A
Q --> E
R --> I
```


## Explicação do Fluxograma

**Main**

- O método `main()` inicia a execução do programa.
- Chama `obterEntrada()` da classe `EntradaDeDados` para obter a lista do usuário.
- Chama `remover()` da classe `RemovedorDeDuplicatas` para obter a lista sem duplicatas.
- Chama `encontrarDuplicatas()` da classe `ListaPurificada` para obter as duplicatas.
- Imprime os resultados (entrada original, lista sem duplicatas e duplicatas).

**EntradaDeDados**

- O método `obterEntrada()` lê a entrada do usuário, divide em elementos e retorna a lista.

**RemovedorDeDuplicatas**

- O método `remover()` cria um HashSet a partir da entrada (eliminando duplicatas automaticamente).
- Cria uma nova lista a partir do HashSet e a retorna.

**ListaPurificada**

- O método `encontrarDuplicatas()` itera sobre a entrada.
- Usa um HashSet para rastrear elementos únicos.
- Se um elemento já estiver no HashSet, ele é uma duplicata e é adicionado à lista de duplicatas.
- Retorna a lista de duplicatas.


## Diagrama de Classes

Esse diagrama de classes oferece uma visão geral da estrutura do projeto, mostrando as quatro classes principais (`Main`, `EntradaDeDados`, `RemovedorDeDuplicatas` e `ListaPurificada`) e como elas interagem entre si.

![Diagrama de Classes - ListaPurificada - Mermaid.png](Diagrama%20de%20Classes%20-%20ListaPurificada%20-%20Mermaid.png)

**Código Mermaid**
```
classDiagram

class EntradaDeDados {
    +obterEntrada(): List<String>
}

class RemovedorDeDuplicatas {
    +remover(List<T> entrada): List<T>
}

class ListaPurificada {
    +encontrarDuplicatas(List<T> entrada): List<T>
}

class Main {
    +main(String[] args): void
}

Main --> EntradaDeDados : usa
Main --> RemovedorDeDuplicatas : usa
Main --> ListaPurificada : usa

```


## Explicação do Diagrama

### Classes

- **EntradaDeDados:** Responsável por obter a entrada do usuário.
- **RemovedorDeDuplicatas:** Remove duplicatas de uma lista.
- **ListaPurificada:** Fornece utilitários para listas, como encontrar duplicatas.
- **Main:** Classe principal que coordena a execução do programa.

### Métodos

- `obterEntrada()`: (em EntradaDeDados) Obtém a entrada do usuário.
- `remover()`: (em RemovedorDeDuplicatas) Remove duplicatas de uma lista.
- `encontrarDuplicatas()`: (em ListaPurificada) Encontra duplicatas em uma lista.
- `main()`: (em Main) Método principal que executa o programa.

### Relacionamentos

- A classe `Main` usa as classes `EntradaDeDados`, `RemovedorDeDuplicatas` e `ListaPurificada` para realizar suas funções.


## Resultados

| Tipo de Entrada  | Entrada                                                | Resultado (sem duplicatas)                    | Duplicatas         | Observações                                                                                                                       |
|------------------|--------------------------------------------------------|-----------------------------------------------|--------------------|-----------------------------------------------------------------------------------------------------------------------------------|
| Letras           | [j, a, l, a, u, n, i, v, e, r, s, i, t, y]             | [a, e, i, j, l, n, r, s, t, u, v, y]          | [a, i]             | O resultado remove as letras repetidas 'a' e 'i', mantendo a ordem original.                                                      |
| Números          | [1, 2, 3, 4, 5, 5, 4, 9, 7, 6, 4, 2, 5, 8, 3]          | [1, 2, 3, 4, 5, 6, 7, 8, 9]                   | [5, 4, 4, 2, 5, 3] | O resultado remove os números repetidos, ordenando-os em ordem crescente.                                                         |
| Letras e Números | [j, a, l, a, 2, 0, 2, 4, u, n, i, v, e, r, s, i, t, y] | [a, e, i, j, l, n, 0, 2, r, s, 4, t, u, v, y] | [a, 2, i]          | O resultado remove as letras e números repetidos, mantendo a ordem original e tratando letras e números como elementos distintos. |



![Resultado (letra) - ListaPurificada - IntelliJ.png](Resultado%20%28letra%29%20-%20ListaPurificada%20-%20IntelliJ.png)
![Resultado (numero) - ListaPurificada - IntelliJ.png](Resultado%20%28numero%29%20-%20ListaPurificada%20-%20IntelliJ.png)
![Resultado (letra e numero) - ListaPurificada - IntelliJ.png](Resultado%20%28letra%20e%20numero%29%20-%20ListaPurificada%20-%20IntelliJ.png)