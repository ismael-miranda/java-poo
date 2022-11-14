package poo.aula13;

public class Aula13 {
    public static void main(String[] args){
        Cachorro cac = new Cachorro();
        cac.emitirSom();
        cac.reagir("Vem Totô");
        cac.reagir("Vai apanhar");
        cac.reagir(11, 45);
        cac.reagir(21, 00);
        cac.reagir(true);
        cac.reagir(false);
        cac.reagir(2, 12.5f);
        cac.reagir(17, 4.5F);
    }
}
