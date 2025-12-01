package Abstract;

public abstract class Animal {
    private String nome;
    private int idade;
    private double peso;
    private String habitat;
    private boolean estaAcordado;
    private String estadoSaude;
    private String corDominante;
    private String nivelTrofico;

    public Animal(String nome, int idade, double peso, String habitat, boolean estaAcordado,
                  String estadoSaude, String corDominante, String nivelTrofico){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.habitat = habitat;
        this.estaAcordado = estaAcordado;
        this.estadoSaude = estadoSaude;
        this.corDominante = corDominante;
        this.nivelTrofico = nivelTrofico;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEstaAcordado() {
        return estaAcordado;
    }

    public void setEstaAcordado(boolean estaAcordado) {
        this.estaAcordado = estaAcordado;
    }

    public String getEstadoSaude() {
        return estadoSaude;
    }

    public void setEstadoSaude(String estadoSaude) {
        this.estadoSaude = estadoSaude;
    }

    public String getCorDominante() {
        return corDominante;
    }

    public void setCorDominante(String corDominante) {
        this.corDominante = corDominante;
    }

    public String getNivelTrofico() {
        return nivelTrofico;
    }

    public void setNivelTrofico(String nivelTrofico) {
        this.nivelTrofico = nivelTrofico;
    }

    public String InformacoesGerais(){
        return "nome: " + nome + "\nidade: " + idade + "\npeso: " + peso + "\nhabitat: " + habitat + "\nAcordado: " + estaAcordado + "\nCor dominante: " + corDominante + "\nNível trófico: " + nivelTrofico;
    }
}
