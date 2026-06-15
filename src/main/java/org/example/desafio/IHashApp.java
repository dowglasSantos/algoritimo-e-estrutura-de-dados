package org.example.desafio;

public interface IHashApp<Key, T> {
    void clear();
    void put(Key key, T value);
    T get(Key key);
    T remove(Key key);
}

//clear() → Remove todos os elementos do mapa.
//put(int key, int value) → Adiciona o par chave/valor ao mapa.
//get(int key) → Retorna o valor associado à chave passada via parâmetro.
//delete(int key) → Remove o valor do topo da pilha e o retorna ao chamador.
