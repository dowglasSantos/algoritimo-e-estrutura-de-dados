# Análise da Complexidade do Método `insert`

## Código

```java
public void insert(int index, Integer valor) {
    if(index <= this.lista.length) {
        this.lista[index - 1] = null;
        this.lista[index - 1] = new No(valor);
    } else {
        throw new RuntimeException(
            "Erro: valor do indice é maior que: "
            + this.lista.length +
            " que é o numero de posições da lista: "
        );
    }
}
```

## Definição da Entrada

Seja:

- `n` = quantidade de elementos armazenados na estrutura.

---

## Contagem de Operações

### Verificação do índice

```java
if(index <= this.lista.length)
```

Realiza uma comparação.

Custo:

```
1
```

---

### Remoção da referência atual

```java
this.lista[index - 1] = null;
```

Realiza uma atribuição.

Custo:

```
1
```

---

### Inserção do novo nó

```java
this.lista[index - 1] = new No(valor);
```

Realiza a criação de um objeto e uma atribuição.

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

Portanto, a complexidade assintótica de tempo do método `insert` é:

### Tempo

```
O(1)
```

### Espaço

O método cria apenas um novo objeto `No` e não utiliza memória proporcional ao tamanho da entrada.

```
O(1)
```