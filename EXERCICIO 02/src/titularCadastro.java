public class titularCadastro extends ContaBancaria{


    private String senhaNumCad;

   public titularCadastro(){

   }

    public titularCadastro(String senhaNumCad,String titular, int numeroConta){
            super(titular , numeroConta);
            this.senhaNumCad = senhaNumCad;
    }


    public String getSenhaNumCad() {
        return senhaNumCad;
    }

    public void setSenhaNumCad(String senhaNumCad) {
        this.senhaNumCad = senhaNumCad;
    }
}
