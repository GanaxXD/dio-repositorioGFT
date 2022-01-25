package digital.banco.entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nome;
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Conta> contas= new ArrayList<Conta>();
    
    public Banco(String nome){
        this.nome = nome;
    }
    
    /**
    * Cadastra clientes no banco, bem como suas contas. Se o cliente for válido, o mesmos erá
     * cadastrado na lista de clientes do banco, assim como sua conta
     * @param cliente
     * @return String
     */
    public String cadastrarCliente(Cliente cliente){
        if(cliente.equals(null))
            return "Cliente inválido!";
        this.clientes.add(cliente);
        this.contas.add(cliente.getConta());
        return "Cliente Cadastrado com sucesso!";
    }
    
    /**
     * Lista os clientes cadastrados no banco.
     * @param
     * @return Lista de clientes
     */
    public List<Cliente> listarClientes(){
        return clientes;
    }
    
    /**
     * Lista as contas cadastrados no banco.
     * @param
     * @return Lista de contas dos clientes
     */
    public List<Conta> listarContas(){
        return contas;
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    @Override
    public String toString() {
        String listaClientes = " ";
        for(Cliente cliente : this.clientes){
            listaClientes += cliente.getNome()+" \n";
        }
        
        String listaContas = " ";
        for (Conta conta : this.contas){
            listaContas += "agencia: "+conta.getAgencia()+", número: "+ conta.numero+ " \n";
        }
        return "------ Banco ------\n" +
                " nome= " + nome + "\n" +
                " clientes = " + listaClientes + " \n"+
                " contas = " + listaContas + "\n"+"------ FIM ------";
    }
}
