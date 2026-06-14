package org.example.pilha;

public class Pilha {
    private Integer[] pilha;
    private Integer posicao;

    public Pilha() {
        this.posicao = 0;
        this.pilha = new Integer[10];
    }

    // push() → Coloca um inteiro no topo da pilha.
    public void push(Integer valor) {
        if(this.posicao < this.pilha.length) {
            // Deslocando as posições para frente.
            for(int i = this.posicao; i > 0; i--) {
                this.pilha[i] = this.pilha[i - 1];
            };

            this.pilha[0]  = valor;
            posicao++;
        } else  {
            System.out.println("Pilha cheia");
        }
    };

    // pop() → Remove o valor do topo da pilha e o retorna ao chamador.
    public Integer pop(){
        isEmpty();

        Integer retorno = this.pilha[0];

        this.pilha[0] = null;
        this.posicao = 0;

        // Desloca o elemento de uma posição maior para menor
        for(int i = this.posicao; i < this.pilha.length - 1; i++) {
            this.pilha[i] = this.pilha[i + 1];
        };

        this.pilha[this.pilha.length - 1] = null;
        return retorno;
    };

    // top() → Espia o inteiro que está no topo e o retorna sem mexer na pilha.
    public Integer top(){
        isEmpty();

        System.out.println("Top element is " + this.pilha[0]);
        return this.pilha[0];
    };

    // isEmpty() → Retorna true ou false dependendo da pilha estar vazia ou não.
    public Boolean isEmpty(){
        if(pilha[0] == null) {
            System.out.println("Pilha vazia");
            return false;
        }

        System.out.println("Pilha cheia: " + true);
        return true;
    }

    // size() → Retorna um valor inteiro com o número de elementos da pilha.
    public Integer size(){
        isEmpty();
        
        Integer elementos = 0;
        
        for(int i = 0; i < this.pilha.length; i++) {
            elementos = i;
        }
        
        System.out.println("numero de elementos: " + elementos);
        return elementos;
    }

//    list() -> Retorna todos os elementos da pilha.
//    public void list() {
//        for(int i = 0; i < pilha.length; i++) {
//            System.out.println("posição: "+ i + " elemento: " + pilha[i]);
//        }
//    }
}