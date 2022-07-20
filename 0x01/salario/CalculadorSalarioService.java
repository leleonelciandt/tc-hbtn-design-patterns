import java.util.UUID;

public class CalculadorSalarioService {

    private static CalculadorSalarioService instancia;
    public UUID uuid = UUID.randomUUID();

    private CalculadorSalarioService() {
    }

    public static CalculadorSalarioService getInstancia() {
        return instancia;
    }

    public UUID getUuid() {
        return uuid;
    }

    public static CalculadorSalarioService getCalculadorSalarioService(){
        if (instancia == null){
            return new CalculadorSalarioService();
        }
        return instancia;
    }



    public double calcularSalarioLiquido(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        return salarioBruto - valorDescontos + (valorVendas * (percentualComissao / 100));
    }

}
