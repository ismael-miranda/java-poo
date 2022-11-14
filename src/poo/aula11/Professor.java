package poo.aula11;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(float aumento){
        setSalario(getSalario() + aumento);
    }

    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public float getSalario(){
        return this.salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }

    public String detalhes(){
        return "O professor " + this.getNome() + ", recebeu um aumento e terá um salario de "
                + this.getSalario();
    }
}
