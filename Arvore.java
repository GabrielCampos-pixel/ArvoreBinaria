public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserirMusica(int id,String titulo,String artista,double duracao) {
        raiz = inserirRecursividade(raiz, id);
    }

    private No inserirRecursividade(No atual, int id) {
        if (atual == null) {
            return new No(id);
        }
        if (id < atual.valor) {
            atual.esquerda = inserirRecursividade(atual.esquerda, id);
        } else if (id > atual.valor) {
            atual.direita = inserirRecursividade(atual.direita, id);
        }
        return atual;
    }

    public boolean buscar(int id) {
        boolean encontrado = buscarRecursividade(raiz, id);
        if (encontrado) {
            System.out.println("O valor foi encontrado: " + id);
        } else {
            System.out.println("O valor NÃO foi encontrado: " + id);
        }
        return encontrado;
    }

    private boolean buscarRecursividade(No atual, int id) {
        if (atual == null) {
            return false;
        }
        if (atual.valor == id) {
            return true;
        }
        if (id < atual.valor) {
            return buscarRecursividade(atual.esquerda, id);
        } else {
            return buscarRecursividade(atual.direita, id);
        }
    }
}