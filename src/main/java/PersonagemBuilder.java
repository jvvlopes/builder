public class PersonagemBuilder {

    private String nome;
    private String classe;
    private int nivel;
    private int forca;
    private int inteligencia;

    public PersonagemBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public PersonagemBuilder comClasse(String classe) {
        this.classe = classe;
        return this;
    }

    public PersonagemBuilder comNivel(int nivel) {
        this.nivel = nivel;
        return this;
    }

    public PersonagemBuilder comForca(int forca) {
        this.forca = forca;
        return this;
    }

    public PersonagemBuilder comInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
        return this;
    }

    public Personagem construir() {
        return new Personagem(nome, classe, nivel, forca, inteligencia);
    }
}