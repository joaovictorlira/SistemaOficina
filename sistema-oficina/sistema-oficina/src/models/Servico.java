package src.models;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Servico {

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    Date data;
    String orcamento;

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    TipoServiço tipoServiço;
    
    public Servico(Date data, String orcamento, TipoServiço tipoServiço) {
        this.data = new Date();
        this.orcamento = orcamento;
        this.tipoServiço = tipoServiço;
    }
     @Override
    public String toString() {
        
        SimpleDateFormat simpledateformat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = simpledateformat.format(data);

        
        return String.format(
            "-------------------------------\n" +
            "Data: %s\n" +
            "Orçamento: R$ %s\n" +
            "Tipo de Serviço: %s",
            dataFormatada, orcamento, tipoServiço
        );
    }
    
   

    
}
