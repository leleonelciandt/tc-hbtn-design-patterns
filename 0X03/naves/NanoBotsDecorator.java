public class NanoBotsDecorator extends NaveEspacialDecorator{


    public NanoBotsDecorator(NaveEspacial naveASerDecorada) {
        super(naveASerDecorada);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 25;
    }
}
