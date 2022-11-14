package poo.aula11;

public class Tecnico extends Aluno{
    private int regiProf;

    public void pratcar(){
        System.out.println("O técnico " + this.getNome() + " esta praticando");
    }
    public int getRegiProf(){
        return this.regiProf;
    }
    public void setRegiProf(int regiProf){
        this.regiProf = regiProf;
    }
}
