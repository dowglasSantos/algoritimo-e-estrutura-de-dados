# Análise da Complexidade do Método `pop`

## Código

```java
public No pop() {
    if(this.lista[0] != null) {
        No no = this.lista[this.posicao - 1];

        this.lista[this.posicao - 1] = new No(null);
        this.posicao--;

        return no;
    }

    throw new RuntimeException("Lista Vazia!!");
}
```

## Definição da Entrada

Seja:

- `n` = quantidade de elementos armazenados na estrutura.

---

## Contagem de Operações

### Verificação de lista vazia

```java
if(this.lista[0] != null)
```

Realiza uma comparação.

Custo:

```
1
```

---

### Acesso ao último elemento

```java
No no = this.lista[this.posicao - 1];
```

Acesso direto por índice.

Custo:

```
1
```

---

### Substituição da posição removida

```java
this.lista[this.posicao - 1] = new No(null);
```

Criação de objeto e atribuição.

Custo:

```
1
```

---

### Atualização da posição

```java
this.posicao--;
```

Custo:

```
1
```

---

### Retorno do elemento removido

```java
return no;
```

Custo:

```
1
```

---

## Função de Custo

Somando todas as operações:

```
f(n) = 1 + 1 + 1 + 1 + 1
```

Simplificando:

```
f(n) = 5
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
5 ≤ c · 1
```

Escolhendo:

```
c = 5
```

A desigualdade é verdadeira para qualquer valor de `n`.

Logo:

```
c = 5
N₀ = 1
```

---

## Conclusão

Como existem constantes positivas `c = 5` e `N₀ = 1` tais que:

```
f(n) ≤ c · g(n)
```

para todo `n ≥ N₀`, concluímos que:

```
f(n) ∈ O(1)
```

Portanto, a complexidade assintótica de tempo do método `pop` é:

### Tempo

```
O(1)
```

### Espaço

O método utiliza apenas uma variável auxiliar (`no`) e não cria estruturas proporcionais ao tamanho da entrada.

```
O(1)
```