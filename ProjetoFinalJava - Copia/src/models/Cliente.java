package src.models;

public class Cliente extends Pessoa{
<<<<<<< HEAD
    public Cliente(String nome, String telefone, String cpf, String placa) {
=======
    public Cliente(String nome, String telefone, String cpf) {
>>>>>>> 91e78b2 (segundaversao)
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