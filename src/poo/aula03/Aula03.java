package poo.aula03;

public class Aula03 {
    public static void main(String[] args){
        CanetaZeroTres c1 = new CanetaZeroTres();
        c1.modelo = "BIC Cristal";
        c1.cor = "Vermelha";
        //c1.ponta = 0.05f;
        c1.carga = 80;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
