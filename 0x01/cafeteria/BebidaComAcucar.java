import java.util.List;

public class BebidaComAcucar extends BebidaDecorator {

    public BebidaComAcucar(Bebida bebidaASerDecorada) {
        super(bebidaASerDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> todosIngredientes = super.obterIngredientes();
        todosIngredientes.add("acucar");
        return todosIngredientes;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
