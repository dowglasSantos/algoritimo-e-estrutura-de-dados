# Análise da Complexidade do Método `remove`

## Código

```java
public void remove(int index) {
    if(index <= this.lista.length) {
        this.lista[index - 1] = null;
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

### Remoção do elemento

```java
this.lista[index - 1] = null;
```

Realiza uma atribuição.

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

Portanto, a complexidade assintótica de tempo do método `remove` é:

### Tempo

```
O(1)
```

### Espaço

O método não cria estruturas auxiliares e utiliza apenas operações constantes.

```
O(1)
```