package src.models;

public class Cliente extends Pessoa{
    public Cliente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public String getDetalhes() {
        return "========== NOTA FISCAL ==========\n" +
                "Cliente: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "CPF: " + cpf + "\n" +
                "-------------------------------";
    }
}

