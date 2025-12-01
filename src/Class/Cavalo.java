package Class;

import Abstract.Animal;
import Interfaces.AnimalTerrestre;

public class Cavalo extends Animal implements AnimalTerrestre {
    private String raca;
    private double alturaCernelha; //altura no ombro
    private double velocidadeMaxima;
    private boolean ehDomesticado;
    private String tipoCrinas;

    public Cavalo(String nome, int idade, double peso, String habitat, boolean estaAcordado, String estadoSaude, String corDominante, String nivelTrofico,
                  String raca, double alturaCernelha, double velocidadeMaxima, boolean ehDomesticado, String tipoCrinas) {
        super(nome, idade, peso, habitat, estaAcordado, estadoSaude, corDominante, nivelTrofico);
        this.raca = raca;
        this.alturaCernelha = alturaCernelha;
        this.velocidadeMaxima = velocidadeMaxima;
        this.ehDomesticado = ehDomesticado;
        this.tipoCrinas = tipoCrinas;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getAlturaCernelha() {
        return alturaCernelha;
    }

    public void setAlturaCernelha(double alturaCernelha) {
        this.alturaCernelha = alturaCernelha;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public boolean isEhDomesticado() {
        return ehDomesticado;
    }

    public void setEhDomesticado(boolean ehDomesticado) {
        this.ehDomesticado = ehDomesticado;
    }

    public String getTipoCrinas() {
        return tipoCrinas;
    }

    public void setTipoCrinas(String tipoCrinas) {
        this.tipoCrinas = tipoCrinas;
    }

    @Override
    public void correr() {
        System.out.println(getRaca() + " está correndo à velocidade de " + getVelocidadeMaxima() + "m/s");
    }

    @Override
    public void quantidadePatas() {
        System.out.println(getRaca() + " tem 4 patas");
    }
}
