package Sistema.De.Veiculos.Exception;

public class ValorInvalidoException extends RuntimeException {

    private MensagemError mensagem;
    public ValorInvalidoException(MensagemError mensagem) {
        this.mensagem = mensagem;
    }

    public MensagemError getMensagem() {
        return mensagem;
    }
}
