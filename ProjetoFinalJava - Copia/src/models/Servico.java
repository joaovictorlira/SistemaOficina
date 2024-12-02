package src.models;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Servico {
    
    Date data;
    String orcamento;
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
            "Servico:\n" +
            "-------------------------------\n" +
            "Data: %s\n" +
            "Orçamento: R$ %s\n" +
            "Tipo de Serviço: %s\n" +
            "-------------------------------",
            dataFormatada, orcamento, tipoServiço
        );
    }
    
   

    
}
