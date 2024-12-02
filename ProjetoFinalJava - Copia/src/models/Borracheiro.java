package src.models;

<<<<<<< HEAD
public class Borracheiro extends Pessoa {
=======
import src.interfaces.Iborracheiro;

public class Borracheiro extends Pessoa implements Iborracheiro {
>>>>>>> 91e78b2 (segundaversao)

    String salario;
    
    public Borracheiro(String nome, String telefone, String cpf, String salario) {
        super(nome, telefone, cpf);
        this.salario = salario;
    }

    public String getDetalhes() {
        return "Cliente: " + getNome() + ", CPF: " + getCpf() + ", Telefone: " + telefone;
    }
<<<<<<< HEAD
=======

    @Override
    public void tamparFuroDoPneu() {
        System.out.println("Furo do pneu foi remendado com sucesso!");
    }

    @Override
    public void trocarpneu() {
        System.out.println("Seu pneu foi trocado com sucesso por " + nome +"!");
    }
>>>>>>> 91e78b2 (segundaversao)
}
