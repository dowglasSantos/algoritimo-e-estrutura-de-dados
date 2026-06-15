# Análise da Complexidade do Método `dequeue`

## Código

```java
public void dequeue() {
    if (posicao == 0) {
        System.out.println("Fila vazia");
    }

    this.fila[this.posicao - 1] = null;
    posicao--;
}
```

## Definição da Entrada

Seja:

- `n` = quantidade de elementos armazenados na fila.

---

## Contagem de Operações

### Verificação de fila vazia

```java
if (posicao == 0)
```

Realiza uma comparação.

Custo:

```
1
```

---

### Remoção do elemento

```java
this.fila[this.posicao - 1] = null;
```

Realiza uma atribuição.

Custo:

```
1
```

---

### Atualização da posição

```java
posicao--;
```

Realiza uma operação de decremento.

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

Portanto, a complexidade assintótica de tempo do método `dequeue` é:

### Tempo

```
O(1)
```

### Espaço

O método utiliza apenas variáveis e operações constantes, sem criar novas estruturas de dados.

```
O(1)
```