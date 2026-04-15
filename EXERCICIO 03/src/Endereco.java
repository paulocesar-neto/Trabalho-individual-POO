public class Endereco {

    private String logradouro;
    private Integer numero;
    private String bairro;
    private String estado;
    private String UF;

    public Endereco(String logradouro, Integer numero, String bairro, String estado, String UF) {
         this.logradouro = logradouro;
         this.numero = numero;
         this.bairro = bairro;
         this.estado = estado;
         this.UF = UF;

    }
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
}
