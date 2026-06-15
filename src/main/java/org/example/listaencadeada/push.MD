# Análise da Complexidade do Método `push`

## Código

```java
public void push(Integer valor) {
    if (this.posicao < this.lista.length) {
        this.lista[posicao] = new No(valor);
        this.posicao++;
    } else {
        throw new RuntimeException("Erro no ListaEncadeada: Lista cheia!!");
    }
}
```

## Definição da Entrada

Seja:

- `n` = quantidade de elementos armazenados na estrutura.

---

## Contagem de Operações

### Verificação de espaço disponível

```java
if (this.posicao < this.lista.length)
```

Realiza uma comparação.

Custo:

```
1
```

---

### Criação e inserção do novo nó

```java
this.lista[posicao] = new No(valor);
```

Consiste na criação de um objeto e em uma atribuição.

Custo:

```
1
```

---

### Atualização da posição

```java
this.posicao++;
```

Realiza uma operação de incremento.

Custo:

```
1
```

---

## Função de Custo

Somando todas as operações:

```
f(n) = 1 + 1 + 1
```

Simplificando:

```
f(n) = 3
```

---

## Aplicação da Definição Formal de Big-O

Escolhemos:

```
g(n) = 1
```

Pela definição de Big-O, devemos encontrar constantes positivas `c` e `N₀` tais que:

```
f(n) ≤ c · g(n)
```

Substituindo:

```
3 ≤ c · 1
```

Escolhendo:

```
c = 3
```

A desigualdade é verdadeira para qualquer valor de `n`.

Logo:

```
c = 3
N₀ = 1
```

---

## Conclusão

Como existem constantes positivas `c = 3` e `N₀ = 1` tais que:

```
f(n) ≤ c · g(n)
```

para todo `n ≥ N₀`, concluímos que:

```
f(n) ∈ O(1)
```

Portanto, a complexidade assintótica de tempo do método `push` é:

### Tempo

```
O(1)
```

### Espaço

O método cria apenas um novo objeto `No` para armazenar o valor inserido e não realiza alocações proporcionais ao tamanho da entrada.

```
O(1)
```