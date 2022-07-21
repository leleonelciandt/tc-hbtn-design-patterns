public class CanhaoExtraDecorator extends NaveEspacialDecorator {

    public CanhaoExtraDecorator(NaveEspacial naveASerDecorada) {
        super(naveASerDecorada);
    }


    @Override
    public int getAtaque() {
        return super.getAtaque() + 75;
    }
}
