package org.example.filafifo;

public class FilaFIFO {
    private Integer[] fila;
    private Integer posicao;

    public FilaFIFO() {
        this.posicao = 0;
        this.fila = new Integer[10];
    }

    // enqueue() → Adiciona um inteiro à fila.
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
    };

    // dequeue() → Remove um inteiro da fila.
    public void dequeue() {
        if (posicao == 0) {
            System.out.println("Fila vazia");
        }

        this.fila[this.posicao - 1] = null;
        posicao--;
    };

    // rear() → Retorna o inteiro que está no fim da fila.
    public Integer rear() {
        isEmpty();
        return this.fila[this.posicao - 1];
    }

    // front() → Retorna o inteiro que está na frente da fila.
    public Integer front() {
        isEmpty();
        return this.fila[0];
    }

    // size() → Retorna o tamanho da fila.
    public Integer size() {
        return this.fila.length;
    }

    // isEmpty() → Retorna true ou false dependendo da fila estar vazia ou não.
    public Boolean isEmpty(){
        if(this.fila[0] == null) {
            System.out.println("Pilha vazia");
            return false;
        }
        return true;
    }

//    public void list(){
//        isEmpty();
//
//        for(int i = 0; i < this.fila.length; i++) {
//            System.out.println("Posição: " + i + " elemento: " + this.fila[i]);
//        }
//    }
}