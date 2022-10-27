package poo.aula05;

public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        this.status = false;
        this.saldo = 0.0f;
    }

    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipoConta(){
        return this.tipoConta;
    }
    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }

    public String getDono(){
        return this.dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    public void abrirConta(String tipoDeConta){
        this.status = true;
        if(tipoDeConta == "cc"){
            this.tipoConta = tipoDeConta;
            this.saldo = 50f;
        }else if(tipoDeConta == "cp"){
            this.tipoConta = tipoDeConta;
            this.saldo = 150f;
        }
    }

    public void fecharConta(){
        if(this.saldo > 0){
            System.out.print("Você ainda tem saldo de " + this.saldo);
            System.out.println("Favor realizar o saque");
        }else if(this.saldo < 0){
            System.out.print("Seu saldo esta negativo " + this.saldo);
            System.out.println("Favor realizar um deposito");
        }else{
            System.out.println("Conta encerrada");
        }
    }

    public void depositar(float valor){
        if(this.status == true){
            this.saldo += valor;
        }
    }

    public void sacar(float valor){
        if(this.status == true){
            this.saldo -= valor;
        }
    }

    public void pagarMensal(String tipoDeConta){
        if(this.tipoConta == tipoDeConta){
            this.saldo -= 12f;
        }else{
            this.saldo -= 20f;
        }
    }

    public void infoConta(){
        System.out.println("Dono: " + this.dono);
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Tipo de conta: " + this.tipoConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Conta está ativa? " + this.status);
    }
}
