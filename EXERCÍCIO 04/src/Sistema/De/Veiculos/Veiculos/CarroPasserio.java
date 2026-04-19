package Sistema.De.Veiculos.Veiculos;

import java.time.LocalDate;

public non-sealed class CarroPasserio extends Veiculo{

    public CarroPasserio(String placa, String marca, Integer anoFabricacao, Double valorLocacaoDiaria, Double precoFipe) {
        super(placa, marca, anoFabricacao, valorLocacaoDiaria, precoFipe);
    }

    @Override
    public void alugarVeiculo(float pesoCarga, int dias) {

        Double valorTotal = this.getValorLocacaoDiaria() * dias;

        if (dias <= 0){
            throw new IllegalArgumentException("ERROR, Valor de dia negativo, digite um dia válido");
        }

        System.out.println("O valor total do aluguel é: " + valorTotal);
        System.out.println("Carro alugado com sucesso!\n");

    }

    @Override
    public String toString() {
        return  "\nMarca: "  + getMarca() + " |  Placa: " + getPlaca() + " |  Ano Fabricacao: " + getAnoFabricacao() + "\n" +
                "Valor Fipe: " + getPrecoFipe()  + " |  Valor Locação: " + getValorLocacaoDiaria() + "\n";
    }

    @Override
    public Double calculaIpva() {

        if (LocalDate.now().getYear() - this.getAnoFabricacao() > 20)  {
            System.out.println("Você esta isento de IPVA");
            return 0.0;
        } else {
            return this.getPrecoFipe() * 0.04;

        }


    }
}
