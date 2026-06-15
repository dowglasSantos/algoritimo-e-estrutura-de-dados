package org.example.desafio;

public class EntryHash<Key, T> {
    private Key key;
    private T value;

    public EntryHash(Key key, T value) {
        this.key = key;
        this.value = value;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {

    }

    public void setValue(T value) {

    }

    public T getValue() {
        return value;
    }

    private void generateHash() {

    }

    @Override
    public String toString() {
        return "EntryHash{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
