import java.util.Scanner;

public class ContaBancaria {

        private String titular;
        private int numeroConta;
        String confirmaOperacao;    //--opção para comfirmar ou não as operações;
        double saldoTotalConta = 0.0;
        double bonusConta = 50.00;
        int limiteSaque = 3;
        double valorSaque = 0.0;
        double valorDeposito = 0.0;
        int opcaoSaqueDeposito; //--para escolher opção do menu saque e menu depósito;
       boolean recebeuBonus;

    Scanner escolhaOpcao = new Scanner(System.in);

    public ContaBancaria() {
    }

    public ContaBancaria(String titular, int numeroConta) {
               this.titular=titular;
               this.numeroConta=numeroConta;
    }

    public void saldoBancario() {
        if (!recebeuBonus) {
            System.out.printf("\nParabéns!Você recebeu um Bônus de R$ %.2f", bonusConta);
            saldoTotalConta += bonusConta;
            recebeuBonus=true;
        }
            System.out.printf("\nSaldo atual => R$ %.2f ", saldoTotalConta);

    }

    public void depositar(){
       do {
           System.out.println("===================================");
           System.out.println(" -------|  $ DEPÓSIT0 $  |--------");
           System.out.println("====================================");
           System.out.println("1- R$ 100,00 ");
           System.out.println("2- R$ 200,00 ");
           System.out.println("3- R$ 500,00 ");
           System.out.println("4- R$ 1000,00 ");
           System.out.println("5- Outro valor: ");
           System.out.println("0- <= Voltar ao menu ");
           System.out.print("\nEscolha uma opção => ");

           opcaoSaqueDeposito = escolhaOpcao.nextInt();

           //Switch case para escolher a opção de depósito;
           switch (opcaoSaqueDeposito) {
               case 1:

                   valorDeposito = 100.00;
                   System.out.printf("Valor Depósito => R$%.2f ", valorDeposito);
                   System.out.print("\nCONFIRMAR DEPÓSITO? => ");
                   break;
               case 2:

                   valorDeposito = 200.00;
                   System.out.printf("Valor Depósito => R$%.2f ", valorDeposito);
                   System.out.print("\nCONFIRMAR DEPÓSITO? => ");
                   break;
               case 3:

                   valorDeposito = 500.00;
                   System.out.printf("Valor Depósito  => R$%.2f ", valorDeposito);
                   System.out.print("\nCONFIRMAR DEPÓSITO? => ");
                   break;

               case 4:

                   valorDeposito = 1000.00;
                   System.out.printf("Valor Depósito => R$%.2f ", valorDeposito);
                   System.out.print("\nCONFIRMAR DEPÓSITO? => ");
                   break;
               case 5:

                   System.out.print("Digite o valor do depósito => ");
                   valorDeposito = escolhaOpcao.nextDouble();
                   System.out.printf("Valor Depósito => R$ %.2f", valorDeposito);
                   System.out.print("\nCONFIRMAR DEPÓSITO? => ");
                   break;

           }
           if (opcaoSaqueDeposito == 0) {
               System.out.println("Voltando ao menu...");
               break;
           }
           //Confirma se deseja realizar operação;
           confirmaOperacao = escolhaOpcao.next();

           if (confirmaOperacao.equalsIgnoreCase("S") || confirmaOperacao.equalsIgnoreCase("SIM")) {
               System.out.printf("\nValor de Depósito realizado => R$ %.2f ", valorDeposito);
               saldoTotalConta += valorDeposito;
               System.out.printf("\nVerifique seu saldo!");


           } else {
               System.out.println("DEPÓSITO CANCELADO!");
           }break;
       }while(opcaoSaqueDeposito != 0);
    }

   public void sacar() {
     do{
       //--Bloqueia o limite de saque, tendo 3 operções apenas;

       if (limiteSaque <= 0) {
           System.out.print("BLOQUEADO!\nLimite diário de saque atingido.");
           break;
       }

         System.out.println("===================================");
         System.out.println("--------|   $ SAQUE $   |---------");
         System.out.println("===================================");
         System.out.println("1- R$ 50,00 ");
         System.out.println("2- R$ 70,00 ");
         System.out.println("3- R$ 100,00 ");
         System.out.println("4- Outro valor: ");
         System.out.println("0- <= Voltar ao menu: ");
         System.out.print("\nEscolha uma opção => ");

         opcaoSaqueDeposito = escolhaOpcao.nextInt();

       //Switch case para escolher a opção de saque;
       switch (opcaoSaqueDeposito) {
           case 1:

               valorSaque = 50.00;
               System.out.printf("Valor Saque => R$%.2f ", valorSaque);
               System.out.print("\nCONFIRMAR SAQUE? => ");
               break;
           case 2:

               valorSaque = 70.00;
               System.out.printf("Valor Saque =>  R$%.2f ?", valorSaque);
               System.out.print("\nCONFIRMAR SAQUE? => ");
               break;
           case 3:

               valorSaque = 100.00;
               System.out.printf("Valor Saque =>  R$%.2f ", valorSaque);
               System.out.print("\nCONFIRMAR SAQUE? => ");
               break;
           case 4:

               System.out.print("Digite o valor do saque => ");
               valorSaque = escolhaOpcao.nextDouble();
               System.out.printf("Valor Saque => R$ %.2f", valorSaque);
               System.out.print("\nCONFIRMAR SAQUE? => ");
               break;

       }

       if (opcaoSaqueDeposito == 0) {
           System.out.println("Voltando ao menu...");
           break;
       }
       //Valor de saque até R$ 1000,00 reias
       if (valorSaque > 1000) {
           System.out.print("BLOQUEADO!\nO valor máximo de saque é de R$1000,00!");
           break;
       }

       confirmaOperacao = escolhaOpcao.next();

       if (saldoTotalConta < valorSaque) {
           System.out.println("Saldo insuficiente!\nVocê não pode realizar a operação.");

       } else if (confirmaOperacao.equalsIgnoreCase("S") || confirmaOperacao.equalsIgnoreCase("SIM")) {
           System.out.printf("\nValor de Saque realizado => R$ %.2f ", valorSaque);
           saldoTotalConta = saldoTotalConta - valorSaque;
           System.out.printf("\nVerifique seu saldo!");
           limiteSaque--;
       } else {
           System.out.println("SAQUE CANCELADO!");
       }
       break;

       }while(opcaoSaqueDeposito != 0);
   }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}

