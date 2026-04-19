package Sistema.De.Veiculos.Main;

import Sistema.De.Veiculos.Exception.ValorInvalidoException;
import Sistema.De.Veiculos.Veiculos.Caminhao;
import Sistema.De.Veiculos.Veiculos.CarroPasserio;

public class Main {
    public static void main(String[] args) {

        try {
            //Dando New em Caminhao;

            Caminhao caminhao1 = new Caminhao(
                    "VBN-237", "SCANIA", 2018, 1500.00,
                    300.000, 30.0f);

            Caminhao caminhao2 = new Caminhao(
                    "ADQ-908", "VOLVO", 1998, 1200.00,
                    150.000, 15.0f );

            Caminhao caminhao3 = new Caminhao(
                    "UHF-754", "DAF", 1955, 850.00,
                    80.000, 10.0f);

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
           // Dando New em CarrosPasseio;

            CarroPasserio carro1 = new CarroPasserio(
                    "ZXL-579", "BMW", 2022, 1250.00,
                    130.000);

            CarroPasserio carro2 = new CarroPasserio(
                    "ADQ-908", "NISSAN", 2015, 850.00,
                    100.000);

            CarroPasserio carro3 = new CarroPasserio(
                    "ZXL-579", "MUSTANG", 1999, 1000.00,
                    95.000);

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            //CAMINHÕES

            //Caminhão 1
            System.out.println("\n====================| CAMINHÃO 1 |====================");
            System.out.println(caminhao1);
            System.out.println("Valor Total IPVA: " + caminhao1.calculaIpva());
            caminhao1.alugarVeiculo(30.0f,60);
           System.out.println("\n");

            //Caminhão 2 - Regra de negocio peso da carga maior que a capacidade de carga maxima do caminhão
            System.out.println("\n\n====================| CAMINHÃO 2 |====================");
            System.out.println(caminhao2);
            System.out.println("Valor Total IPVA: " + caminhao2.calculaIpva());
            caminhao2.alugarVeiculo(30.0f,90);
            System.out.println("\n");

            //Caminhão 3
            System.out.println("\n\n====================| CAMINHÃO 3 |====================");
            System.out.println(caminhao3);
            System.out.println("Valor Total IPVA: " + caminhao3.calculaIpva());
            caminhao3.alugarVeiculo(5.0f,120);
            System.out.println("\n");

            //CARROS

            //Carro 1
            System.out.println("\n\n====================| CARRO PASSEIO 1 |====================");
            System.out.println(carro1);
            System.out.println("Valor Total IPVA: " + carro1.calculaIpva());
            carro1.alugarVeiculo(0.0f,60);

            //Carro 2
            System.out.println("\n\n====================| CARRO PASSEIO 2 |====================");
            System.out.println(carro2);
            System.out.println("Valor Total IPVA: " + carro2.calculaIpva());
            carro2.alugarVeiculo(0.0f,80);


            //Carro 3 - Resolvendo excessao de dia negativo;
            System.out.println("\n\n====================| CARRO PASSEIO 3 |====================");
            System.out.println(carro3);
            System.out.println("Valor Total IPVA: " + carro3.calculaIpva());
            carro3.alugarVeiculo(0.0f,-50);


        }catch(ValorInvalidoException e){
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
}