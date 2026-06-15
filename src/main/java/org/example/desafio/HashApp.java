package org.example.desafio;

public class HashApp<Key, T> implements IHashApp<Key, T> {
    private EntryHash<Key, T>[] tabela;
    private int tamanho;

    public HashApp() {
        this.tabela = new EntryHash[10];
        this.tamanho = 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = null;
        }

        tamanho = 0;
    }

    @Override
    public void put(Key key, T value) {
        if(key == null || value == null) {
            throw new IllegalArgumentException();
        } else if (this.tamanho < this.tabela.length) {
            int indice = hash(key);

            tabela[indice] = new EntryHash<>(key, value);

            tamanho++;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public T get(Key key) {
        int indice = hash(key);

        EntryHash<Key, T> entry = tabela[indice];

        if(entry != null && entry.getKey().equals(key)) {
            return entry.getValue();
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public T remove(Key key) {
        int indice = hash(key);

        EntryHash<Key, T> entry = tabela[indice];

        if(entry != null && entry.getKey().equals(key)) {
            T value = entry.getValue();

            this.tabela[indice] = null;
            this.tamanho--;

            return  value;
        } else {
            throw new IllegalStateException();
        }
    }

    private int hash(Key key) {
        return Math.abs(key.hashCode()) % tabela.length;
    }
}
