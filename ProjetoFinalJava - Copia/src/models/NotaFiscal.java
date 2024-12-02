package src.models;


public class NotaFiscal {
    private Cliente cliente;
    private Veiculo veiculo;
    private Servico servico;

    public NotaFiscal(Cliente cliente, Veiculo veiculo, Servico servico) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.servico = servico;

    }


    public String notafiscal() {

        String clienteDetalhes = cliente.getDetalhes();
        String servicoDetalhes = servico.toString();
        String veiculoDetalhes = veiculo.toString();


        return clienteDetalhes + "\n" +
                veiculoDetalhes + "\n" +
                servicoDetalhes + "\n" +
                "=================================";
    }
}
