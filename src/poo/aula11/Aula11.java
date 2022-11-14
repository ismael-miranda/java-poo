package poo.aula11;


public class Aula11 {
    public static void main(String[] args) {
        Visitante v = new Visitante();
        v.setNome("Joselito");
        v.setIdade(33);
        v.setSexo("Masculino");

        System.out.println(v.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Gorete");
        a1.setIdade(29);
        a1.setSexo("F");
        a1.setMatricula(2341);
        a1.setCurso("Backend");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Trunecio");
        b1.setMatricula(2351);
        b1.setBolsa(10);
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Muhamed");
        p1.setEspecialidade("Java");
        p1.setSalario(5000);
        p1.receberAumento(500f);
        System.out.println(p1.detalhes());
    }
}
