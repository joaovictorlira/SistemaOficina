package src.models;

public class Borracheiro extends Pessoa {

    String salario;
    
    public Borracheiro(String nome, String telefone, String cpf, String salario) {
        super(nome, telefone, cpf);
        this.salario = salario;
    }

    public String getDetalhes() {
        return "Cliente: " + getNome() + ", CPF: " + getCpf() + ", Telefone: " + telefone;
    }
}
