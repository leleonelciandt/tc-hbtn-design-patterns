public abstract class Personagem {

    private String nome;
    private TipoPersonagem tipo;
    private int inteligencia, forca, vigor, resistencia, destreza;

    public Personagem(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getVigor() {
        return vigor;
    }

    public int getForca() {
        return forca;
    }

    public abstract double getDanoAtaque();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                " nome = '" + nome + '\'' +
                ", tipo = " + tipo +
                ", inteligencia = " + inteligencia +
                ", forca = " + forca +
                ", vigor = " + vigor +
                ", resistencia = " + resistencia +
                ", destreza = " + destreza +
                ", dano ataque = " + String.format("%.2f", getDanoAtaque()) +
                '}';
    }
}
