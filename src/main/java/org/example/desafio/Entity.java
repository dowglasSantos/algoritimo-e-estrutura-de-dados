package org.example.desafio;

public class Entity {
    private String nome;

    public Entity(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
