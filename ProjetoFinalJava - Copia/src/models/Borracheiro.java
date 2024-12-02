package src.models;

import src.interfaces.Iborracheiro;

public class Borracheiro extends Pessoa implements Iborracheiro {

    String salario;
    
    public Borracheiro(String nome, String telefone, String cpf, String salario) {
        super(nome, telefone, cpf);
        this.salario = salario;
    }

    public String getDetalhes() {
        return "Cliente: " + getNome() + ", CPF: " + getCpf() + ", Telefone: " + telefone;
    }

    @Override
    public void tamparFuroDoPneu() {
        System.out.println(nome + " remendou o furo do pneu com sucesso!");
    }

    @Override
    public void trocarpneu() {
        System.out.println("Seu pneu foi trocado com sucesso por " + nome +"!");
    }
}
