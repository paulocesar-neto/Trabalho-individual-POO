import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido {

    private int idPedido;
    private long numeroPedido;
    private LocalDate dataPedido;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Double valorTotal;
    private Double frete;

    public Pedido(int idPedido,long numeroPedido, LocalDate dataPedido, Cliente cliente) {
        this.idPedido = idPedido;
        this.dataPedido = dataPedido;

        this.cliente = cliente;
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
        this.frete = 0.0;
    }

    public void adicionarItens(Produto produto,Integer quantidade) {
        ItemPedido itemPedido = new ItemPedido(produto,quantidade);
        this.itens.add(itemPedido);
        this.valorTotal += itemPedido.getSubtotal();
    }

    public long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public Double getFrete() {
        return frete;
    }

   public void fecharPedido(){

       if(valorTotal > 250.0){
           this.frete = 0.0;
       } else {
           this.frete = 25.0;

       }
       imprimirPedido();
   }

   void imprimirPedido() {
           StringBuilder sb = new StringBuilder();
           sb.append("Pedido ID: ")
                   .append(this.getIdPedido())
                   .append("| Numero do Pedido: ")
                   .append(this.getNumeroPedido())
                   .append("| Data: ")
                   .append(this.getDataPedido())
                   .append("\n_________________________________________").append("\n")
                   .append(" Nome: ").append(this.cliente.getNome()).append(" | CPF/CNPJ: ").append(cliente.getCpfCnpj()).append("\n")
                   .append(" Telefone: ").append(this.cliente.getTelefone()).append(" | Email: ").append(this.cliente.getEmail()).append("\n")
                   .append(" Endereço: ").append(this.cliente.getEndereco().getLogradouro()).append(",")
                                        .append(this.cliente.getEndereco().getNumero()).append(",")
                                        .append(this.cliente.getEndereco().getBairro()).append(",")
                                        .append(this.cliente.getEndereco().getEstado()).append("-")
                                        .append(this.cliente.getEndereco() .getUF()) .append("\n")
                   .append("___________________________________________").append("\n");
          for (ItemPedido item : this.itens) {
              sb.append("\t").append(item.getQuantidade()).append("x ")
                      .append(item.getProduto().getNome())

                      .append("SUBTOTAL R$").append(String.format("%.2f",item.getSubtotal())).append("\n");
          }
           sb.append("______________________________________________").append("\n")
                   .append("VALOR TOTAL PRODUTOS: R$ ")
                   .append(String.format("%.2f", this.getValorTotal()))
                    .append("| FRETE: ").append(String.format("%.2f",this.getFrete())).append("\n");
             this.valorTotal += this.frete;
             sb.append("_______________________________________________").append("\n")
             .append("VALOR TOTAL A PAGAR: R$ ").append(String.format("%.2f", this.getValorTotal())).append("\n\n");

       System.out.println(sb.toString());
       }

    public List<ItemPedido> getItens(){
        return Collections.unmodifiableList(this.itens);
    }
   }
