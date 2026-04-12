
public class Produto {

    private Integer idProduto;
    private String nome;
    private Double valor;


    public Produto(Integer idProduto, String nome, Double valor) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.valor = valor;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
}