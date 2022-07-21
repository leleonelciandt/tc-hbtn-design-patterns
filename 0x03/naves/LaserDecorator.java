public class LaserDecorator extends NaveEspacialDecorator {

    public LaserDecorator(NaveEspacial naveASerDecorada) {
        super(naveASerDecorada);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 40;
    }
}
