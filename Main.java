public class Main {
    public static void main(String[] args) {
        Arvore arv = new Arvore();

        arv.inserirMusica(new Musica(26, "Moça da Chácara", "Ana Castela", 3.26));
        arv.inserirMusica(new Musica(13, "Latitude do Amor", "Jorge & Mateus", 3.19));
        arv.inserirMusica(new Musica(7, "Chuva de Vaquejada", "Vitor Fernandes", 3.04));
        arv.inserirMusica(new Musica(4, "Cowboy Fora da Lei 2.0", "Gusttavo Lima", 3.33));
        arv.inserirMusica(new Musica(2, "Caminhonete Branca", "Zé Neto & Cristiano", 3.21));
        arv.inserirMusica(new Musica(1,"Revoada na Rota","Ana Castela & Luan Pereira",2.98));
        arv.inserirMusica(new Musica(3,"Batidão Rural","Pedro Sampaio & AgroPlay",2.67));
        arv.inserirMusica(new Musica(6,"Ela Balança a Porteira","Luan Pereira",2.87));
        arv.inserirMusica(new Musica(5,"Piseiro do Interior","Nattan",3.12));
        arv.inserirMusica(new Musica(10,"Fivela de Ouro","Ana Castela",3.05));
        arv.inserirMusica(new Musica(9,"Pisadinha da Morena","João Gomes",2.76));
        arv.inserirMusica(new Musica(8,"Se For Amor","Henrique & Juliano",3.45));
        arv.inserirMusica(new Musica(12,"Paredão do Fazendeiro","Zé Felipe",2.81));
        arv.inserirMusica(new Musica(11,"Rolê de 4x4","Luan Santana & Hungria",3.22));
        arv.inserirMusica(new Musica(20,"Coração Cowboy","Matheus & Kauan",3.11));
        arv.inserirMusica(new Musica(17,"Beijo com Sabor de Chão","Guilherme & Benuto",3.14));
        arv.inserirMusica(new Musica(15,"Piseiro do Futuro","DJ Ivis & Nattan",3.01));
        arv.inserirMusica(new Musica(14,"Boate Democrático","Maiara & Maraisa",3.06));
        arv.inserirMusica(new Musica(16,"Solteira no Sigilo","Simone Mendes",3.28));
        arv.inserirMusica(new Musica(19,"Freio de Mão","Felipe Amorim",2.95));
        arv.inserirMusica(new Musica(18,"Meu Cavalo e Eu","Jads & Jadson",3.42));
        arv.inserirMusica(new Musica(23,"Vaqueiro Raiz","Vitor Fernandes",3.02));
        arv.inserirMusica(new Musica(22,"Morena GPS","Henrique & Juliano",3.24));
        arv.inserirMusica(new Musica(21,"Agro é Pop, Agro é Love","Luan Pereira",2.88));
        arv.inserirMusica(new Musica(25,"Revoada VIP","Zé Felipe & Pedro Sampaio",2.74));
        arv.inserirMusica(new Musica(24,"A Noite Toda","Gustavo Mioto",3.16));
        arv.inserirMusica(new Musica(39,"Do Jeito Que Ela Gosta","João Gomes",2.94));
        arv.inserirMusica(new Musica(33,"BMW do Sertão","Nattan & Luan Pereira",2.99));
        arv.inserirMusica(new Musica(30,"Nova Fivela","Maiara & Maraisa",3.09));
        arv.inserirMusica(new Musica(28,"Tropa do Agro","Luan Pereira & AgroPlay",2.91));
        System.out.println("Arvore em ordem");
        arv.imprimirEmOrdem();

        arv.remover(13);
        arv.remover(1);
        arv.remover(7);
        System.out.println("Arvore apos as remocoes");
        arv.imprimirEmOrdem();
    }
}        