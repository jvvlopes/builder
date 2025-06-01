public class Personagem {

    private String nome;
    private String classe;
    private int nivel;
    private int forca;
    private int inteligencia;

    public Personagem(String nome, String classe, int nivel, int forca, int inteligencia) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.forca = forca;
        this.inteligencia = inteligencia;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getForca() {
        return forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }
}
