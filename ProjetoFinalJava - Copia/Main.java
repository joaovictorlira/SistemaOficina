import java.util.Date;
import src.models.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Servico servico1 = new Servico(new Date(), "500", TipoServiço.BASICO);


        Mecanico mecanico1 = new Mecanico("Caio Souto", "4002-8922", "026.321.467-46", "2000");
        Borracheiro borracheiro1 = new Borracheiro("Yuri", "4002-8926", "238.345.453-45", "1500");
        Cliente cliente1 = new Cliente("João Victor","4002-8211","092.152.754-44");
        Veiculo veiculo1 = new Veiculo("ABC-8721","Aventador","Lamborghini");
        NotaFiscal notaFiscal = new NotaFiscal(cliente1, veiculo1, servico1);


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 0 para Cliente e 1 para Funcionário");
        int escolha = sc.nextInt(); // Solicita a escolha inicial

        switch (escolha) {

            case 0:
                System.out.println("Digite 0 para ver a Nota Fiscal e 1 para realizar serviço");
                int clienteescolha = sc.nextInt();

                switch (clienteescolha) {
                    case 0:
                        System.out.println("Exibindo a nota fiscal");
                        System.out.println(notaFiscal.notafiscal());

                        break;

                    case 1:
                        System.out.println("Qual serviço você deseja realizar?");
                        System.out.println("Digite 0 se quiser trocar óleo\nDigite 1 se quiser trocar peças\nDigite 2 se quiser trocar o pneu\nDigite 3 se quiser remendar o furo do pneu");
                        int servicoEscolha = sc.nextInt();

                        switch (servicoEscolha) {
                            case 0:
                                System.out.println("Realizando troca de óleo...");
                                mecanico1.trocarOleo();
                                break;

                            case 1:
                                System.out.println("Realizando troca de peças...");
                                mecanico1.trocarpecas();
                                break;

                            case 2:
                                System.out.println("Realizando troca de pneu...");
                                borracheiro1.trocarpneu();
                                break;

                            case 3:
                                System.out.println("Remendando o furo do pneu...");
                                borracheiro1.tamparFuroDoPneu();
                                break;

                            default:
                                System.out.println("Opção inválida para o serviço.");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Opção inválida para Cliente.");
                        break;
                }
                break;

            case 1:
                System.out.println("Digite 0 para Mecânico e 1 para Borracheiro");
                int funcEscolha = sc.nextInt();


                switch (funcEscolha) {
                    case 0:
                        System.out.println("Digite 0 se você quer trocar óleo ou 1 se você quer trocar peças");

                        int escolhamecanico = sc.nextInt();

                        switch (escolhamecanico){

                            case 0:
                                System.out.println("Você trocou o óleo do cliente!");
                                break;

                            case 1:
                                System.out.println("Você trocou as peças do cliente!");
                                break;

                        }
                        break;
                    case 1:
                        System.out.println("Digite 0 se quiser trocar pneu ou digite 1 se quiser remendar um furo no pneu.");
                        int escolhaborracheiro = sc.nextInt();

                        switch (escolhaborracheiro){

                            case 0:
                                System.out.println("Você trocou o pneu do cliente!");
                                break;

                            case 1:
                                System.out.println("Você remendou um furo no pneu do cliente!");
                        }




                        break;

                    default:
                        System.out.println("Opção inválida para Funcionário.");
                        break;
                }
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }

        sc.close();
    }
}
