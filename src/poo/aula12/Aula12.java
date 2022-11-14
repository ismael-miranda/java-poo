package poo.aula12;

public class Aula12 {
    public static void main(String[] args){
        Mamifero mam = new Mamifero();
        Reptil rep = new Reptil();
        Peixe pei = new Peixe();
        Ave ave = new Ave();

        Canguru can = new Canguru();
        Cachorro cac = new Cachorro();
        Cobra cob = new Cobra();
        Tartaruga tar = new Tartaruga();
        GoldFish gol = new GoldFish();
        Arara ara = new Arara();

        can.locomover();
        can.usandoBolsa();
        cac.locomover();
        cac.emitirSom();

        mam.setPeso(30f);
        mam.setCorPelo("Preto");
        mam.alimentar();
        mam.locomover();
        mam.emitirSom();

        ave.locomover();
        pei.locomover();
        ave.locomover();
    }
}
