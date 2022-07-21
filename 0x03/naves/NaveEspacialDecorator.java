public class NaveEspacialDecorator extends NaveEspacial{

    private NaveEspacial naveASerDecorada;

    public NaveEspacialDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial.getSaude(), naveEspacial.getAtaque());
        this.naveASerDecorada = naveEspacial;
    }

    @Override
    public int getSaude() {
        return naveASerDecorada.getSaude();
    }

    @Override
    public int getAtaque() {
        return naveASerDecorada.getAtaque();
    }
}
