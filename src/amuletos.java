public class Amuleto {

    private int idAmuleto;
    private String nome;
    private String efeitos;
    private double custo;
    private String poderes;

    public Amuleto(int idAmuleto, String nome, String efeitos, double custo, String poderes) {
        this.idAmuleto = idAmuleto;
        this.nome = nome;
        this.efeitos = efeitos;
        this.custo = custo;
        this.poderes = poderes;
    }

    public void equipar() {
        System.out.println(nome + " foi equipado!");
    }


    public int getIdAmuleto() {
        return idAmuleto;
    }

    public void setIdAmuleto(int idAmuleto) {
        this.idAmuleto = idAmuleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEfeitos() {
        return efeitos;
    }

    public void setEfeitos(String efeitos) {
        this.efeitos = efeitos;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }
}