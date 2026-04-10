import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaração de Variáveis;
        int opcaoMenu;     //--para escolher opção do menu do caixa eletronico;
        int opcaoAcessoConta;
        String senha;
        int numConta;

        ContaBancaria contaBancaria = new ContaBancaria();
        titularCadastro titularCad = new titularCadastro();
        Random gerador = new Random();

        Scanner escolhaOpcao = new Scanner(System.in);
        Scanner cadastroConta = new Scanner(System.in);
        do {

            System.out.println("\n=======================================");
            System.out.println("===| MENU INICIAL CAIXA ELETRÔNICA |===");
            System.out.println("=======================================");
            System.out.println("1- Cadastrar Conta ");
            System.out.println("2- Acessar conta ");
            System.out.println("0- Sair ");
            System.out.print("\nEscolha uma opção => ");

            opcaoAcessoConta = escolhaOpcao.nextInt();

            switch (opcaoAcessoConta) {
                case 1:
                    System.out.println("\n=========================");
                    System.out.println("===| CADASTRAR CONTA |===");
                    System.out.println("==========================");
                    System.out.print("Nome Completo: ");
                    titularCad.setTitular(cadastroConta.nextLine());
                    System.out.print("Senha: ");
                    titularCad.setSenhaNumCad(cadastroConta.nextLine());

                    titularCad.setNumeroConta(gerador.nextInt(10000));
                    System.out.print("Numero da Nova Conta: " + titularCad.getNumeroConta());
                    System.out.println("\nCADASTRO CONCLUÍDO COM SUCESSO!!");
                    break;
                case 2:
                    System.out.println("\n=========================");
                    System.out.println("===| ACESSAR CONTA |===");
                    System.out.println("=========================");
                    System.out.print("Numero conta: ");
                    numConta = cadastroConta.nextInt();
                    System.out.print("Senha:");
                    senha = cadastroConta.next();

                    if (numConta == titularCad.getNumeroConta() &&  senha.equals(titularCad.getSenhaNumCad())) {
                        System.out.println("ACESSO LIBERADO");

                        do {
                            System.out.println("\n=================================");
                            System.out.println("===| CAIXA ELETRONICO 24Hrs |===");
                            System.out.println("=================================");
                            System.out.println(":::::::::::::::::::::::::::::::::::::::");
                            System.out.println("BEM VINDO A SUA NOVA CONTA!\nTitular: " + titularCad.getTitular());
                            System.out.println("Numero da conta: " + titularCad.getNumeroConta());
                            System.out.println("::::::::::::::::::::::::::::::::::::::::");
                            System.out.println("1- Ver Saldo ");
                            System.out.println("2- Realizar Depósito ");
                            System.out.println("3- Realizar Saque ");
                            System.out.println("0- Sair ");
                            System.out.print("\nEscolha uma opção => ");

                            //Escolhe a opção do menu;
                            opcaoMenu = escolhaOpcao.nextInt();

                            switch (opcaoMenu) {


                                case 1: //Ver Saldo;
                                    contaBancaria.saldoBancario();
                                    break;

                                case 2: //Realizar Depósito!
                                    contaBancaria.depositar();
                                    break;

                                case 3: //Realizar saque;
                                    contaBancaria.sacar();
                                    break;

                                case 0:
                                    System.out.println("OPERAÇÃO FINALIZADA!");
                                    break;

                                default:
                                    System.out.println("Opção Inválida,Tente Novamente!");
                                    break;

                            }
                        } while (opcaoMenu != 0);

                    } else {
                        System.out.println("ACESSO NEGADO! conta ou senha inválidos...");

                    }  break;

                case 0:
                    System.out.println("FINALIZANDO...\nOBRIGADO POR ULTILIZAR O CAIXA ELETRÔNICO!");
                    break;

                default:
                    System.out.println("Opção Inválida,Tente Novamente!");
                    break;

            }
        } while (opcaoAcessoConta != 0) ;
        escolhaOpcao.close();
    }
}
