package poo.aula12;

public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama(){
        return this.corEscama;
    }
    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som do Reptil");
    }
}
