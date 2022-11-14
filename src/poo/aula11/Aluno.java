package poo.aula11;

// heranca de/para diferenca - Aluno é uma Especializacao de Pessoa
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga");
    }
}
