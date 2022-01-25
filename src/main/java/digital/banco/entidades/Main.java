package digital.banco.entidades;

public class Main {
    public static void main(String[] args) {
        
        Conta poupanca = new ContaPoupanca();
        Conta corrente = new ContaCorrente();
        
        Cliente cliente1 = new Cliente("Alisson Almeida", 30, poupanca);
        Cliente cliente2 = new Cliente("Alberto Lisboa", 32, corrente);
        
        Banco banco = new Banco("Banco do Nordeste");
        banco.cadastrarCliente(cliente1);
        banco.cadastrarCliente(cliente2);
        
        
        poupanca.depositar(1250);
        corrente.depositar(2500);
        
        System.out.println(poupanca.imprimirExtrato());
        System.out.println(corrente.imprimirExtrato());
        
        poupanca.sacar(250);
        corrente.transferir(200, poupanca);
        
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(banco);
        System.out.println(banco.getClientes());
        
        
    }
}
