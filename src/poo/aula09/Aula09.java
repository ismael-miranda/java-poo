package poo.aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Zé", 44, "Masculino");
        p[1] = new Pessoa("Toninha", 37, "Feminino");

        l[0] = new Livro("Java Basico", "João da Silva", 300, p[0]);
        l[1] = new Livro("Java Intermediario", "Antonia Flores", 330, p[1]);
        l[2] = new Livro("Java Avançado" , "Carl Marx", 453, p[0]);

        l[0].setAberto(true);
        l[0].folhear(187);
        l[0].avancarPag();
        l[0].detalhes();
    }
}
