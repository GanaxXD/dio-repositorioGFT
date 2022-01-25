package digital.banco.entidades;

public abstract class Conta {

    private static int SEQUENCIAL = 0;
    private static int AGENCIA_PADRAO = 1576;
    
    private int agencia;
    protected int numero;
    protected double saldo;
    
    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = ++SEQUENCIAL;
    }
    
    public void sacar(double valor){
        this.saldo -= valor;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void transferir(double valor,Conta destinatario){
        this.sacar(valor);
        destinatario.depositar(valor);
    }

    public int getAgencia() {
        return this.agencia;
    }
    
    public String imprimirExtrato(){
        return "Conta: \n\tAgencia: "+this.agencia+"\n" +
                "\tConta: "+this.numero+"\n" +
                "\tSaldo: "+this.saldo+"\n---------\n";
    }
}
