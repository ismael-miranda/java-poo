package poo.aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacio, int idade, float alt, float peso, int vitoria, int derrota, int empat){
        this.setNome(nome);
        this.setNacionalidade(nacio);
        this.setIdade(idade);
        this.setAltura(alt);
        this.setPeso(peso);
        this.setVitorias(vitoria);
        this.setDerrotas(derrota);
        this.setEmpates(empat);
    }

    public String getNome(){

        return this.nome;
    }
    public void setNome(String nome){

        this.nome = nome;
    }

    public String getNacionalidade(){

        return this.nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){

        this.nacionalidade = nacionalidade;
    }

    public int getIdade(){

        return this.idade;
    }
    public void setIdade(int idade){

        this.idade = idade;
    }

    public float getAltura(){

        return this.altura;
    }
    public void setAltura(float altura){

        this.altura = altura;
    }

    public float getPeso(){

        return this.peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(getPeso() < 52.2){
            this.categoria = "Inválido";
        }else if(getPeso() <= 72.2){
            this.categoria = "Leve";
        }else if(getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if(getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("---------Apresentando o Lutador--------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Medindo " + getAltura() + "m");
        System.out.println("Pesando:" + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    public void status(){
        System.out.println("-------Luntador info-------------");
        System.out.print(getNome());
        System.out.println(" é um peso: " + getCategoria());
        System.out.println(getVitorias() + " vitorias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }
}
