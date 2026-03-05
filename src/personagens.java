public class personagens {public class Personagem {

    private int idPersonagem;
    private String nome;
    private int ataque;
    private int pogo;
    private String efeito;

    public Personagem(int idPersonagem, String nome, int ataque, int pogo, String efeito) {
        this.idPersonagem = idPersonagem;
        this.nome = nome;
        this.ataque = ataque;
        this.pogo = pogo;
        this.efeito = efeito;
    }

    public void morrer() {
        System.out.println(nome + " morreu.");
    }

    public void irParaCima() {
        System.out.println(nome + " foi para cima do inimigo!");
    }

    public void usarMagia() {
        System.out.println(nome + " usou uma magia!");
    }


    public int getIdPersonagem() {
        return idPersonagem;
    }

    public void setIdPersonagem(int idPersonagem) {
        this.idPersonagem = idPersonagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getPogo() {
        return pogo;
    }

    public void setPogo(int pogo) {
        this.pogo = pogo;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }
}
}
