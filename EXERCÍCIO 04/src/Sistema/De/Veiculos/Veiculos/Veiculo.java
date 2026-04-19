package Sistema.De.Veiculos.Veiculos;

import Sistema.De.Veiculos.Interfaces.Fretavel;
import Sistema.De.Veiculos.Interfaces.Tributavel;

public abstract sealed class Veiculo implements Fretavel, Tributavel permits Caminhao,CarroPasserio{

    public final String placa;
    public final String marca;
    public Double valorLocacaoDiaria;
    public final Integer anoFabricacao;
    private Double precoFipe;

    public Veiculo (String placa, String marca, Integer anoFabricacao, Double valorLocacaoDiaria, Double precoFipe) {
        this.placa = placa;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.precoFipe = precoFipe;

        if (placa.isBlank() || marca.isBlank() || precoFipe.isNaN()) {
            throw new IllegalArgumentException("ERROR, Digite valores válidos");

        } if (anoFabricacao == null || valorLocacaoDiaria == null){
            throw new IllegalArgumentException("ERROR, Digite valores válidos");
        }

    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public Double getValorLocacaoDiaria() {
        return valorLocacaoDiaria;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public Double getPrecoFipe() {
        return precoFipe;
    }

}
