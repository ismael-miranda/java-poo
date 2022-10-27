package poo.aula04;

public class CanetaZeroQuatro {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public CanetaZeroQuatro(String modelo, String cor, float ponta){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampar();
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean tampada){
        this.tampada = tampada;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float ponta){
        this.ponta = ponta;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("Sobre a Caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada: " + this.tampada);
    }
}
