# Análise da Complexidade do Método `pop`

## Código

```java
public Integer pop() {
    isEmpty();

    Integer retorno = this.pilha[0];

    this.pilha[0] = null;
    this.posicao = 0;

    // Desloca o elemento de uma posição maior para menor
    for(int i = this.posicao; i < this.pilha.length - 1; i++) {
        this.pilha[i] = this.pilha[i + 1];
    }

    this.pilha[this.pilha.length - 1] = null;
    return retorno;
}
```

## Definição da Entrada

Seja:

- `n` = quantidade de elementos armazenados na pilha.

---

## Contagem de Operações

### Verificação de pilha vazia

```java
isEmpty();
```

Assumindo que apenas verifica se a pilha está vazia:

```java
return posicao == 0;
```

Custo:

```
1
```

---

### Recuperação do elemento do topo

```java
Integer retorno = this.pilha[0];
```

Custo:

```
1
```

---

### Remoção lógica do elemento

```java
this.pilha[0] = null;
this.posicao = 0;
```

Custo:

```
2
```

---

### Laço de Deslocamento

```java
for(int i = this.posicao; i < this.pilha.length - 1; i++) {
    this.pilha[i] = this.pilha[i + 1];
}
```

O laço percorre aproximadamente `n - 1` posições.

Em cada iteração ocorre uma atribuição:

```java
this.pilha[i] = this.pilha[i + 1];
```

Custo:

```
n - 1
```

---

### Limpeza da última posição

```java
this.pilha[this.pilha.length - 1] = null;
```

Custo:

```
1
```

---

### Retorno do valor removido

```java
return retorno;
```

Custo:

```
1
```

---

## Função de Custo

Somando todas as operações:

```
f(n) = 1 + 1 + 2 + (n - 1) + 1 + 1
```

Simplificando:

```
f(n) = n + 5
```

---

## Aplicação da Definição Formal de Big-O

Escolhemos:

```
g(n) = n
```

Pela definição de Big-O, devemos encontrar constantes positivas `c` e `N₀` tais que:

```
f(n) ≤ c · g(n)
```

Substituindo:

```
n + 5 ≤ c · n
```

Escolhendo:

```
c = 2
```

Temos:

```
n + 5 ≤ 2n
```

A desigualdade é verdadeira para:

```
n ≥ 5
```

Logo:

```
c = 2
N₀ = 5
```

---

## Conclusão

Como existem constantes positivas `c = 2` e `N₀ = 5` tais que:

```
f(n) ≤ c · g(n)
```

para todo `n ≥ N₀`, concluímos que:

```
f(n) ∈ O(n)
```

Portanto, a complexidade assintótica de tempo do método `pop` é:

### Tempo

```
O(n)
```

### Espaço

O método utiliza apenas variáveis auxiliares constantes (`retorno` e `i`), sem criar novas estruturas de dados.

```
O(1)
```