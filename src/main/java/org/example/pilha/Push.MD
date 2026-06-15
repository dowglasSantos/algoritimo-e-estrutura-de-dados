# Análise da Complexidade do Método `push`

## Código

```java
public void push(Integer valor) {
    if(this.posicao < this.pilha.length) {

        for(int i = this.posicao; i > 0; i--) {
            this.pilha[i] = this.pilha[i - 1];
        }

        this.pilha[0] = valor;
        posicao++;
    }
}
```

## Definição da Entrada

Seja:

- `n` = quantidade de elementos atualmente armazenados na pilha.

---

## Contagem de Operações

### Verificação do `if`

```java
if(this.posicao < this.pilha.length)
```

Realiza apenas uma comparação.

Custo:

```
1
```

---

### Laço de Deslocamento

```java
for(int i = this.posicao; i > 0; i--) {
    this.pilha[i] = this.pilha[i - 1];
}
```

O laço executa aproximadamente `n` vezes.

Em cada iteração ocorre uma atribuição:

```java
this.pilha[i] = this.pilha[i - 1];
```

Custo:

```
n
```

---

### Inserção do Novo Elemento

```java
this.pilha[0] = valor;
posicao++;
```

São realizadas duas operações.

Custo:

```
2
```

---

## Função de Custo

Somando todas as operações:

```
f(n) = 1 + n + 2
```

Simplificando:

```
f(n) = n + 3
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
n + 3 ≤ c · n
```

Escolhendo:

```
c = 2
```

Temos:

```
n + 3 ≤ 2n
```

A desigualdade é verdadeira para:

```
n ≥ 3
```

Logo:

```
c = 2
N₀ = 3
```

---

## Conclusão

Como existem constantes positivas `c = 2` e `N₀ = 3` tais que:

```
f(n) ≤ c · g(n)
```

para todo `n ≥ N₀`, concluímos que:

```
f(n) ∈ O(n)
```

Portanto, a complexidade assintótica de tempo do método `push` é:

### Tempo

```
O(n)
```

### Espaço

O método utiliza apenas variáveis auxiliares constantes (`i` e `valor`), sem criar novas estruturas de dados.

```
O(1)
```