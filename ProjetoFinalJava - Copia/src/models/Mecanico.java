package src.models;


import src.interfaces.Imecanico;

public class Mecanico extends Pessoa implements Imecanico {
    String salario;


    
    public Mecanico(String nome, String telefone, String cpf, String salario) {
        super(nome, telefone, cpf);
        this.salario = salario;
    }

    public String getDetalhes() {
        return "Cliente: " + getNome() + ", CPF: " + getCpf() + ", Telefone: " + telefone;
    }


    @Override
    public void trocarOleo() {
        System.out.println(nome +" trocou o óleo com sucesso!");
    }

    @Override
    public void trocarpecas() {
        System.out.println(nome + " Trocou as peças com sucesso!");
    }
}