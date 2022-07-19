public abstract class Personagem {

    private String nome;
    private TipoPersonagem tipo;
    private Integer inteligencia, forca, vigor, resistencia, destreza;

    public Personagem(String nome, TipoPersonagem tipo, Integer inteligencia, Integer forca, Integer vigor, Integer resistencia, Integer destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getDestreza() {
        return destreza;
    }

    public void setDestreza(Integer destreza) {
        this.destreza = destreza;
    }

    public Integer getVigor() {
        return vigor;
    }

    public Integer getForca() {
        return forca;
    }

    public double getDanoAtaque(){
        return getForca();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", inteligencia=" + inteligencia +
                ", forca=" + forca +
                ", vigor=" + vigor +
                ", resistencia=" + resistencia +
                ", destreza=" + destreza +
                ", dano ataque =" + String.format("%.2f", getDanoAtaque()) +
                '}';
    }
}
