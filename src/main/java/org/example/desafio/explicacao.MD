# Justificativa da Função Hash

Foi utilizada a função `hashCode()` fornecida pelo Java para gerar um valor inteiro a partir da chave. Em seguida, aplicou-se `Math.abs()` para evitar índices negativos e o operador `%` (módulo) para garantir que o resultado esteja dentro dos limites do array da tabela hash.

Essa abordagem é simples, eficiente e aproveita as implementações de `hashCode()` já existentes para tipos como `String`, `Integer` e outras classes Java. Além disso, o cálculo do índice possui complexidade constante **O(1)**, permitindo acesso rápido aos elementos armazenados.

A função utilizada foi:

```java
private int hash(Key key) {
    return Math.abs(key.hashCode()) % tabela.length;
}
```

Embora essa estratégia não elimine a possibilidade de colisões, ela fornece uma boa distribuição dos elementos na tabela e pode ser combinada com técnicas de tratamento de colisão, como listas encadeadas.
