package Sistema.De.Veiculos.Veiculos;

import java.time.LocalDate;

public non-sealed class Caminhao extends Veiculo {

    public final double capacidadeCargaToneladas;

    public Caminhao(String placa, String marca, Integer anoFabricacao, Double valorLocacaoDiaria, Double precoFipe, double capacidadeCargaToneladas) {
        super(placa, marca, anoFabricacao, valorLocacaoDiaria, precoFipe);
        this.capacidadeCargaToneladas =  capacidadeCargaToneladas;

    }

    public double getCapacidadeCargaToneladas() {
        return capacidadeCargaToneladas;
    }

    @Override
    public void alugarVeiculo(float pesoCarga, int dias) {

        if (pesoCarga < 0 || dias <= 0){
            throw new IllegalArgumentException("ERROR, Valores negativos não é permitido!");
        }

        double valorTotal = this.getValorLocacaoDiaria() * dias;

        if (pesoCarga > this.getCapacidadeCargaToneladas()) {

            valorLocacaoDiaria += this.getValorLocacaoDiaria() * 0.10;
            System.out.println("Sobrecarga,Será aplicada uma taxa de 10%");
            System.out.println("Valor total da taxa: R$" + this.getValorLocacaoDiaria());
            System.out.println("O valor total do aluguel é: R$" + valorTotal);
            System.out.println("Valor total do aluguel com o acréscime é de: R$" +(this.getValorLocacaoDiaria() + valorTotal));
            return;
        }

        System.out.println("O valor total do aluguel é: R$" + valorTotal);
        System.out.println("Carro alugado com sucesso!");

    }

    @Override
    public String toString() {
        return "\nMARCA: " + getMarca() + "  |  PLACA: " + getPlaca() +  "  |  ANO DE FABRICAÇÃO: " + getAnoFabricacao() + "\n"+
                "PREÇO FIPE: R$" + getPrecoFipe() +  "  |  CAPACIDADE CARGA: " + getCapacidadeCargaToneladas() +  "  |  VALOR LOCAÇÃO: R$" + getValorLocacaoDiaria() + "\n";

    }

    @Override
    public Double calculaIpva() {

        if (LocalDate.now().getYear() - this.getAnoFabricacao() >= 20)  {
           return 0.0;
        }else {
            return this.getPrecoFipe() * 0.015;
        }

    }
}
