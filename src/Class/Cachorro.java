package Class;

import Abstract.Animal;
import Interfaces.AnimalTerrestre;

public class Cachorro extends Animal implements AnimalTerrestre {
    private String raca;
    private String tamanho; // => Pequeno, Médio, Grande
    private boolean PasseioDiario;
    private int nivelTreinamento; // (1-5)
    private boolean ehBricalhao;

    public Cachorro(String nome, int idade, double peso, String habitat, boolean estaAcordado,
                    String estadoSaude, String corDominante, String nivelTrofico, String raca,
                    String tamanho, boolean PasseioDiario, int nivelTreinamento, boolean ehBricalhao
    ) {
        super(nome, idade, peso, habitat, estaAcordado, estadoSaude, corDominante, nivelTrofico);
        this.raca = raca;
        this.tamanho = tamanho;
        this.PasseioDiario = PasseioDiario;
        this.nivelTreinamento = nivelTreinamento;
        this.ehBricalhao = ehBricalhao;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public boolean isPasseioDiario() {
        return PasseioDiario;
    }

    public void setPasseioDiario(boolean passeioDiario) {
        PasseioDiario = passeioDiario;
    }

    public int getNivelTreinamento() {
        return nivelTreinamento;
    }

    public void setNivelTreinamento(int nivelTreinamento) {
        this.nivelTreinamento = nivelTreinamento;
    }

    public boolean isEhBricalhao() {
        return ehBricalhao;
    }

    public void setEhBricalhao(boolean ehBricalhao) {
        this.ehBricalhao = ehBricalhao;
    }


    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo na rua");
    }

    @Override
    public void quantidadePatas() {
        System.out.println(getNome() + " tem 4 patas");

    }
}
