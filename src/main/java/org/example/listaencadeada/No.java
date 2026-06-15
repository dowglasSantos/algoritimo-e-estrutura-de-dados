package org.example.listaencadeada;

public class No {
    private Integer valor;

    public No(Integer valor) {
        this.valor = valor;
    }

    public No() {}

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "No{" +
                "valor=" + valor +
                '}';
    }
}
