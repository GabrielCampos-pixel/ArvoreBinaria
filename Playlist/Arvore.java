public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserirMusica(Musica musica) {
        raiz = inserirRecursividade(raiz, musica);
    }

    private No inserirRecursividade(No atual, Musica musica) {
        if (atual == null) {
            return new No(musica);
        }
        int novoId = musica.getId();
        int atualId = atual.musica.getId();
        if (novoId < atualId) {
            atual.esquerda = inserirRecursividade(atual.esquerda, musica);
        } else if (novoId > atualId) {
            atual.direita = inserirRecursividade(atual.direita, musica);
        }
        return atual;
    }

    public boolean buscar(int id) {
        boolean encontrado = buscarRecursividade(raiz, id);
        if (encontrado) {
            System.out.println("A musica foi encontrada: " + id);
        } else {
            System.out.println("A musica NÃO foi encontrada: " + id);
        }
        return encontrado;
    }

    private boolean buscarRecursividade(No atual, int id) {
        if (atual == null) {
            return false;
        }
        if (atual.musica.getId() == id) {
            return true;
        }
        if (id < atual.musica.getId()) {
            return buscarRecursividade(atual.esquerda, id);
        } else {
            return buscarRecursividade(atual.direita, id);
        }
    }

    public void remover(int id) {
        raiz = removerRecursividade(raiz, id);
    }

    private No removerRecursividade(No atual, int id) {
        if(atual==null) {
            return null;
        }
        int atualId = atual.musica.getId();
        if(id < atualId) {
            atual.esquerda = removerRecursividade(atual.esquerda, id);
        }
        else if(id > atualId) {
            atual.direita = removerRecursividade(atual.direita, id);
        }
        else {
            if(atual.esquerda == null && atual.direita == null) {
                return null;
            }
            else if(atual.esquerda == null) {
                return atual.direita;
            }
            else if(atual.direita == null) {
                return atual.esquerda;
            }
            No sucessor = encontrarMinimo(atual.direita);
            atual.musica = sucessor.musica;
            atual.direita = removerRecursividade(atual.direita, sucessor.musica.getId());
        }
        return atual;
    }

    private No encontrarMinimo(No no) {
        while(no.esquerda != null) {
            no = no.esquerda;
        }
        return no;
    }

    public void imprimirEmOrdem() {
        imprimirEmOrdemRecursividade(raiz);
        System.out.println();
    }

    private void imprimirEmOrdemRecursividade(No no) {
        if(no != null) {
            imprimirEmOrdemRecursividade(no.esquerda);
            System.out.println(no.musica);
            imprimirEmOrdemRecursividade(no.direita);
        }
    }
}