import java.util.Locale;

public class PedidoBuilder extends PedidoAbstractBuilder {


    private Pedido pedido = new Pedido();

    public Pedido build() {
        return this.pedido;
    }

    @Override
    public void setLanche(TipoLanche tipo) {
        ItemPedido item = new ItemPedido(TipoItemPedido.LANCHE, tipo.name());
        this.pedido.adicionarItemDentroCaixa(item);
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        ItemPedido item = new ItemPedido(TipoItemPedido.BATATA, tamanho.name());
        this.pedido.adicionarItemDentroCaixa(item);
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        ItemPedido item = new ItemPedido(TipoItemPedido.BRINDE, tipo.name());
        this.pedido.adicionarItemDentroCaixa(item);
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        ItemPedido item = new ItemPedido(TipoItemPedido.BEBIDA, tipo.name());
        this.pedido.adicionarItemForaCaixa(item);
    }

}
