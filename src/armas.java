public class armas {

    private int idArma;
    private String nome;
    private int dano;
    private String formato;
    private String efeitos;

    public armas(int idArma, String nome, int dano, String formato, String efeitos) {
        this.idArma = idArma;
        this.nome = nome;
        this.dano = dano;
        this.formato = formato;
        this.efeitos = efeitos;
    }

    public void darDano() {
        System.out.println(nome + " causou " + dano + " de dano!");
    }

    public void avancarNoJogo() {
        System.out.println("A arma " + nome + " ajudou a avançar no jogo.");
    }

    public int getIdArma() {
        return idArma;
    }

    public void setIdArma(int idArma) {
        this.idArma = idArma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getEfeitos() {
        return efeitos;
    }

    public void setEfeitos(String efeitos) {
        this.efeitos = efeitos;
    }
}