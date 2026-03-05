public class poderes {
    public class Poder {

        private int idPoder;
        private String nome;
        private String efeitos;
        private double custo;

        public Poder(int idPoder, String nome, String efeitos, double custo) {
            this.idPoder = idPoder;
            this.nome = nome;
            this.efeitos = efeitos;
            this.custo = custo;
        }

        public void ganhar() {
            System.out.println("Você ganhou o poder: " + nome);
        }

        public void usar() {
            System.out.println("Usando o poder: " + nome);
        }

        // Getters e Setters
        public int getIdPoder() {
            return idPoder;
        }

        public void setIdPoder(int idPoder) {
            this.idPoder = idPoder;
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
    }
}
