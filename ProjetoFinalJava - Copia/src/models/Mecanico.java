package src.models;

import src.interfaces.Imecanico;

public class Mecanico extends Pessoa {
    String salario;


    
    public Mecanico(String nome, String telefone, String cpf, String salario) {
        super(nome, telefone, cpf);
        this.salario = salario;
    }

    public String getDetalhes() {
        return "Cliente: " + getNome() + ", CPF: " + getCpf() + ", Telefone: " + telefone;
    }


  
          
}