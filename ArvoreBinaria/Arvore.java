public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserir(int x) {
        raiz = inserirRecursividade(raiz, x);
    }

    private No inserirRecursividade(No atual, int x) {
        if (atual == null) {
            return new No(x);
        }
        if (x < atual.valor) {
            atual.esquerda = inserirRecursividade(atual.esquerda, x);
        } else if (x > atual.valor) {
            atual.direita = inserirRecursividade(atual.direita, x);
        }
        return atual;
    }

    public boolean buscar(int x) {
        boolean encontrado = buscarRecursividade(raiz, x);
        if (encontrado) {
            System.out.println("O valor foi encontrado: " + x);
        } else {
            System.out.println("O valor NÃO foi encontrado: " + x);
        }
        return encontrado;
    }

    private boolean buscarRecursividade(No atual, int x) {
        if (atual == null) {
            return false;
        }
        if (atual.valor == x) {
            return true;
        }
        if (x < atual.valor) {
            return buscarRecursividade(atual.esquerda, x);
        } else {
            return buscarRecursividade(atual.direita, x);
        }
    }
}