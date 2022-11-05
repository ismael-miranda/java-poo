package poo.aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(){}

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador deafiante) {
        this.desafiante = deafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }else{
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    public void lutar(){
        if(isAprovada()){
            getDesafiado().apresentar();
            getDesafiante().apresentar();
            Random rand = new Random();
            int vencedor = rand.nextInt(3);
            System.out.println("__________________RESULTADO DA LUTA____________________");
            switch (vencedor){
                case 0:
                    System.out.println("A luta Empatou");
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println(getDesafiado().getNome() +" ganhou a luta!");
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println(getDesafiante().getNome() + " ganhou a luta!");
                    getDesafiante().ganharLuta();
                    getDesafiado().perderLuta();
                    break;
            }
            System.out.println("_______________________________________________________");

        }else{
            System.out.println("Luta não pode acontecer ");
        }
    }
}
