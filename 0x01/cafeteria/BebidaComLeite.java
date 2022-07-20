import java.util.List;

public class BebidaComLeite extends BebidaDecorator {

    public BebidaComLeite(Bebida bebidaASerDecorada) {
        super(bebidaASerDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> todosIngredientes = super.obterIngredientes();
        todosIngredientes.add("leite");
        return todosIngredientes;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }

}
