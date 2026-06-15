package org.example;

import org.example.desafio.Entity;
import org.example.desafio.HashApp;
import org.example.desafio.IHashApp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Algoritimo e Estrutura de Dados");

        IHashApp<Integer, Entity> hashApp = new HashApp<>();

        Entity entity = new Entity("Huemay");

        hashApp.put(10, entity);

        System.out.println("PUT: " + hashApp.get(10));
    }
}