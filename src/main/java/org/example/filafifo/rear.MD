# Análise da Complexidade do Método `rear`

## Código

```java
public Integer rear() {
    isEmpty();
    return this.fila[this.posicao - 1];
}
```

## Definição da Entrada

Seja:

- `n` = quantidade de elementos armazenados na fila.

---

## Contagem de Operações

### Verificação de fila vazia

```java
isEmpty();
```

Assumindo que o método apenas verifica se a fila está vazia:

```java
return posicao == 0;
```

Custo:

```
1
```

---

### Acesso ao último elemento

```java
return this.fila[this.posicao - 1];
```

O acesso a uma posição de um array é feito diretamente pelo índice.

Custo:

```
1
```

---

## Função de Custo

Somando todas as operações:

```
f(n) = 1 + 1
```

Simplificando:

```
f(n) = 2
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
2 ≤ c · 1
```

Escolhendo:

```
c = 2
```

A desigualdade é verdadeira para qualquer valor de `n`.

Logo:

```
c = 2
N₀ = 1
```

---

## Conclusão

Como existem constantes positivas `c = 2` e `N₀ = 1` tais que:

```
f(n) ≤ c · g(n)
```

para todo `n ≥ N₀`, concluímos que:

```
f(n) ∈ O(1)
```

Portanto, a complexidade assintótica de tempo do método `rear` é:

### Tempo

```
O(1)
```

### Espaço

O método utiliza apenas operações constantes e não cria novas estruturas de dados.

```
O(1)
```