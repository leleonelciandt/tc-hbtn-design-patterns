public class Ladrao extends Personagem{

    public Ladrao(String nome, Integer inteligencia, Integer forca, Integer vigor, Integer resistencia, Integer destreza) throws Exception {
        super(nome, TipoPersonagem.LADRAO, inteligencia, forca, vigor, resistencia, destreza);
        if (destreza < forca || destreza < inteligencia){
            throw new RuntimeException("Atributos invalidos para LADRAO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return this.getForca() * 0.5 + this.getDestreza() * 0.35 + this.getVigor() * 0.1 + this.getInteligencia() * 0.05;
    }
}
