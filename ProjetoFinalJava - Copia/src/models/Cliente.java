package src.models;

public class Cliente extends Pessoa{
    public Cliente(String nome, String telefone, String cpf, String placa) {
        super(nome, telefone, cpf);
    }

    @Override
    public String getDetalhes() {
        return "Cliente{" +
        "nome='" + nome + '\'' +
        ", telefone='" + telefone + '\'' +
        ", cpf='" + cpf + '\'' +
        '}';
}

}