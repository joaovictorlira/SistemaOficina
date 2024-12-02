package src.models;

<<<<<<< HEAD
import src.interfaces.Imecanico;

public class Mecanico extends Pessoa {
=======

import src.interfaces.Imecanico;

public class Mecanico extends Pessoa implements Imecanico {
>>>>>>> 91e78b2 (segundaversao)
    String salario;


    
    public Mecanico(String nome, String telefone, String cpf, String salario) {
        super(nome, telefone, cpf);
        this.salario = salario;
    }

    public String getDetalhes() {
        return "Cliente: " + getNome() + ", CPF: " + getCpf() + ", Telefone: " + telefone;
    }


<<<<<<< HEAD
  
          
=======
    @Override
    public void trocarOleo() {
        System.out.println("Óleo trocado com sucesso!");
    }

    @Override
    public void trocarpecas() {
        System.out.println(nome + " Trocou as peças com sucesso!");
    }
>>>>>>> 91e78b2 (segundaversao)
}