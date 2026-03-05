public class Boss {

    private int idBoss;
    private String nome;
    private String dificuldade;
    private String poderes;
    private String visual;

    public Boss(int idBoss, String nome, String dificuldade, String poderes, String visual) {
        this.idBoss = idBoss;
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.poderes = poderes;
        this.visual = visual;
    }

    public void enfrentarEle() {
        System.out.println("Você está enfrentando o boss " + nome);
    }

    public void morrer() {
        System.out.println(nome + " foi derrotado!");
    }

    public int getIdBoss() {
        return idBoss;
    }

    public void setIdBoss(int idBoss) {
        this.idBoss = idBoss;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    public String getVisual() {
        return visual;
    }

    public void setVisual(String visual) {
        this.visual = visual;
    }
}