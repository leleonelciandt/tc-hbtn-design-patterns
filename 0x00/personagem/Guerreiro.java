public class Guerreiro extends Personagem{

    public Guerreiro(String nome, Integer inteligencia, Integer forca, Integer vigor, Integer resistencia, Integer destreza) throws Exception {
        super(nome, TipoPersonagem.GUERREIRO, inteligencia, forca, vigor, resistencia, destreza);
        if (forca < inteligencia || forca < destreza){
            throw new RuntimeException("Atributos invalidos para GUERREIRO");
        }
    }


    @Override
    public double getDanoAtaque() {
        return this.getForca() * 0.8 + this.getVigor() * 0.05 + getDestreza() * 0.1 + getInteligencia() * 0.05;
    }


}
