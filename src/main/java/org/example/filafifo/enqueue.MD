# Análise da Complexidade do Método `enqueue`

## Código

```java
public void enqueue(Integer elemento) {
    if(this.posicao < this.fila.length) {
        for(int i = this.posicao; i > 0; i--) {
            this.fila[i] = this.fila[i - 1];
        }

        this.posicao++;
        this.fila[0] = elemento;
    } else {
        System.out.println("A fila está cheia!!");
    }
}
```

## Definição da Entrada

Seja:

- `n` = quantidade de elementos armazenados na fila.

---

## Contagem de Operações

### Verificação de espaço disponível

```java
if(this.posicao < this.fila.length)
```

Realiza uma comparação.

Custo:

```
1
```

---

### Laço de Deslocamento

```java
for(int i = this.posicao; i > 0; i--) {
    this.fila[i] = this.fila[i - 1];
}
```

O laço executa aproximadamente `n` vezes.

Em cada iteração ocorre uma atribuição:

```java
this.fila[i] = this.fila[i - 1];
```

Custo:

```
n
```

---

### Inserção do Novo Elemento

```java
this.posicao++;
this.fila[0] = elemento;
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

Portanto, a complexidade assintótica de tempo do método `enqueue` é:

### Tempo

```
O(n)
```

### Espaço

O método utiliza apenas variáveis auxiliares constantes (`i` e `elemento`), sem criar novas estruturas de dados.

```
O(1)
```