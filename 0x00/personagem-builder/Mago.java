public class Mago extends Personagem {




    public Mago(String nome, Integer inteligencia, Integer forca, Integer vigor, Integer resistencia, Integer destreza) throws Exception {
        super(nome, TipoPersonagem.MAGO, inteligencia, forca, vigor, resistencia, destreza);
        if (inteligencia < forca || inteligencia < destreza){
            throw new RuntimeException("Atributos invalidos para MAGO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return this.getInteligencia() * 0.8 + this.getForca() * 0.05 + this.getDestreza() * 0.05 + this.getVigor() * 0.1;
    }
}
