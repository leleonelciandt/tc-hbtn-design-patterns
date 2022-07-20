import java.util.HashSet;
import java.util.Objects;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();


    public Pedido() {
    }

    public Pedido(HashSet<ItemPedido> itensDentroCaixa, HashSet<ItemPedido> itensForaCaixa) {
        this.itensDentroCaixa = itensDentroCaixa;
        this.itensForaCaixa = itensForaCaixa;
    }

    public HashSet<ItemPedido> getItensDentroCaixa() {
        return itensDentroCaixa;
    }

    public void setItensDentroCaixa(HashSet<ItemPedido> itensDentroCaixa) {
        this.itensDentroCaixa = itensDentroCaixa;
    }

    public HashSet<ItemPedido> getItensForaCaixa() {
        return itensForaCaixa;
    }

    public void setItensForaCaixa(HashSet<ItemPedido> itensForaCaixa) {
        this.itensForaCaixa = itensForaCaixa;
    }

    public void adicionarItemDentroCaixa(ItemPedido item){
        this.itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item){
        this.itensDentroCaixa.add(item);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return itensDentroCaixa.equals(pedido.itensDentroCaixa) && itensForaCaixa.equals(pedido.itensForaCaixa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itensDentroCaixa, itensForaCaixa);
    }

    @Override
    public String toString() {
        String pedidoString = "\tFora da Caixa:\n";

        for (ItemPedido item : this.itensForaCaixa) {
            pedidoString = pedidoString.concat("\t\t- " + item.getTipo() + " " + item.getNome() + "\n");
        }

        pedidoString = pedidoString.concat("\tDentro da Caixa:\n");

        for (ItemPedido item : this.itensDentroCaixa) {
            pedidoString = pedidoString.concat("\t\t- " + item.getTipo() + " " + item.getNome() + "\n");
        }

        return pedidoString;
    }
}
