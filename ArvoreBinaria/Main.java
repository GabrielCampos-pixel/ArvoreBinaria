public class Main {
    public static void main(String[] args) {
        Arvore arv = new Arvore();

        arv.inserir(50);
        arv.inserir(30);
        arv.inserir(70);
        arv.inserir(20);
        arv.inserir(40);
        arv.inserir(60);
        arv.inserir(80);
        System.out.println("Arvore em ordem");
        arv.imprimirEmOrdem();
        System.out.println(arv.buscar(40));
        System.out.println(arv.buscar(25));  
        System.out.println(arv.buscar(70));  
    }
}