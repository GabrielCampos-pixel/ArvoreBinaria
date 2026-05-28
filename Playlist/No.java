public class No {
    Musica musica;
    No esquerda;
    No direita;

    public No(Musica musica){
        this.musica = musica;
        this.esquerda = null;
        this.direita = null;
    }
}