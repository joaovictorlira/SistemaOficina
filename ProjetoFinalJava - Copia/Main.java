import java.util.Date;

import src.models.Servico;
import src.models.TipoServiço;

public class Main {

    public static void main(String[] args) {
        

        Servico servico1 = new Servico(new Date(), "500", TipoServiço.BASICO);


        System.out.println(servico1);




    }
}