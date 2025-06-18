package estruturas;

import java.util.Iterator;

public class Lista<T> implements Iterable<T> {
    private No<T> inicio;  // primeiro nó da lista
    private int tamanho;   // número de elementos na lista

    // Verifica se a lista contém um elemento específico
    public boolean contem(T elemento) {
        for (int i = 0; i < this.tamanho(); i++) {
            if (this.obter(i).equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    // Classe interna que representa um nó da lista encadeada
    private static class No<T> {
        T dado;
        No<T> proximo;

        No(T dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    public Lista() {
        inicio = null;
        tamanho = 0;
    }

    // Adiciona um elemento ao fim da lista
    public void adicionar(T elemento) {
        No<T> novo = new No<>(elemento);
        if (inicio == null) {
            inicio = novo;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }

    // Retorna o elemento no índice especificado
    public T obter(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        No<T> atual = inicio;
        for (int i = 0; i < indice; i++) {
            atual = atual.proximo;
        }
        return atual.dado;
    }

    // Retorna o tamanho atual da lista
    public int tamanho() {
        return tamanho;
    }

    // Verifica se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Limpa toda a lista
    public void clean() {
        inicio = null;
        tamanho = 0;
    }

    // Implementação do iterator para permitir uso em loops for-each
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private No<T> atual = inicio;

            @Override
            public boolean hasNext() {
                return atual != null;
            }

            @Override
            public T next() {
                T dado = atual.dado;
                atual = atual.proximo;
                return dado;
            }
        };
    }
}
