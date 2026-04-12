import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

       Endereco endereco = new Endereco("Rua Magé", 37,"Bairro1","Rio de Janeiro","RJ");
       Endereco endereco1 = new Endereco("Rua Penedo",180,"Bairro2","São Paulo","SP");
       Endereco endereco2 = new Endereco("Rua Petrópolis", 53,"Bairro3","Rio de Janeiro","RJ");

       Cliente cliente = new Cliente("Paulo Cesar","paulocesar@email.com","123.456.789-10","21987654321", LocalDate.of(2000,4,1),'M', endereco);
       Cliente cliente1 = new Cliente("Arnaldo Gentil","arnalgo_gentil@email.com","987.654.321-11","21912345678", LocalDate.of(1990,9,18),'M', endereco1);
       Cliente cliente2 = new Cliente("Maria Dolores","maria.dolores@email.com","198.765.321-02","21919876543", LocalDate.of(1997,12,3),'F', endereco2);

       Produto produto = new Produto(1,"Mouse Gamer",50.00);
       Produto produto2 = new Produto(2,"Teclado Gamer",250.00);
       Produto produto3 = new Produto(3,"Headset",80.00);
       Produto produto4 = new Produto(4,"Monitor",400.00);
       Produto produto5 = new Produto(5,"Cadeira Gamer",200.00);

       Pedido pedido = new Pedido(1,2747,LocalDate.of(2026,4,12),cliente);
       Pedido pedido1 = new Pedido(2,4692,LocalDate.of(2026,2,8),cliente1);
       Pedido pedido2 = new Pedido(3, 7937,LocalDate.of(2026,1,25),cliente2);

       pedido.adicionarItens(produto3,2);
       pedido.adicionarItens(produto2,1);
       pedido.adicionarItens(produto,3);
       pedido.fecharPedido();

       pedido1.adicionarItens(produto4,1);
       pedido1.adicionarItens(produto5,1);
       pedido1.fecharPedido();

       pedido2.adicionarItens(produto3,1);
       pedido2.adicionarItens(produto,1);
       pedido2.fecharPedido();








    }
}