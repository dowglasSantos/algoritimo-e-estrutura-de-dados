package org.example.listaencadeada;

public class ListaEncadeada {
    private final No[] lista;
    private Integer posicao;

    public ListaEncadeada() {
        this.lista = new No[10];
        this.posicao = 0;
    }

    //push → Adiciona o nó ao fim da lista.
    public void push(Integer valor) {
       if (this.posicao < this.lista.length) {
            this.lista[posicao] = new No(valor);
            this.posicao++;
        } else {
            throw new RuntimeException("Erro no ListaEncadeada: Lista cheia!!");
        }
    }

    //pop() → Remove o nó no fim da lista e retorna o mesmo.
    public No pop() {
        if(this.lista[0] != null) {
            No no = this.lista[this.posicao - 1];

            this.lista[this.posicao - 1] = new No(null);
            this.posicao--;

            return no;
        }

        throw new RuntimeException("Lista Vazia!!");
    }

    //insert(int index, No no) → Adiciona um nó na posição da lista indicada via parâmetro.
    public void insert(int index, Integer valor) {
        if(index <= this.lista.length) {
            this.lista[index - 1] = null;
            this.lista[index - 1] = new No(valor);
        } else {
            throw new RuntimeException("Erro: valor do indice é maior que: " +this.lista.length + " que é o numero de posições da lista: ");
        }
    }

    //remove(int index) → Remove um nó na posição da lista indicada via parâmetro.
    public void remove(int index) {
        if(index <= this.lista.length) {
            this.lista[index - 1] = null;
        } else {
            throw new RuntimeException("Erro: valor do indice é maior que: " +this.lista.length + " que é o numero de posições da lista: ");
        }
    }

    //elementAt(int index) → Retorna o elemento que está no índice da lista indicado via parâmetro.
    public No elementAt(int index) {
        if(index <= this.lista.length) {
            return this.lista[index - 1];
        } else {
            throw new RuntimeException("Erro: valor do indice é maior que: " +this.lista.length + " que é o numero de posições da lista: ");
        }
    }

    //size() → Retorna o tamanho da lista.
    public int size() {
        if(this.lista[0] != null) {
            return this.lista.length;
        }
        throw new RuntimeException("Lista Vazia!!");
    }

    //printList() → Retorna uma representação em texto da lista.
    public void printList() {
        if(this.lista[0] != null) {
            for (int i = 0; i < this.lista.length; i++) {
                System.out.println("posição: " + i + ", elemento: " + this.lista[i]);
            }
        }
        throw new RuntimeException("Lista Vazia!!");
    }
}