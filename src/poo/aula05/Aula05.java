package poo.aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco();
        cb1.setDono("Ismael Miranda");
        cb1.setNumConta(1230);
        cb1.abrirConta("cc");
        cb1.depositar(1000f);
        cb1.sacar(150f);
        cb1.pagarMensal("cc");
        cb1.infoConta();
    }
}
