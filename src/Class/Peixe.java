package Class;

import Abstract.Animal;
import Interfaces.AnimalAguatico;

public class Peixe extends Animal implements AnimalAguatico {
    private String especie;
    private String tipoAgua; // Doce ou salgada
    private double profundidadeMaxima;
    private boolean temEscamas;
    private boolean ehVenenoso;

    public Peixe(String nome, int idade, double peso, String habitat, boolean estaAcordado, String estadoSaude, String corDominante, String nivelTrofico,
                 String especie, String tipoAgua, double profundidadeMaxima, boolean temEscamas, boolean ehVenenoso) {
        super(nome, idade, peso, habitat, estaAcordado, estadoSaude, corDominante, nivelTrofico);
        this.especie = especie;
        this.tipoAgua = tipoAgua;
        this.profundidadeMaxima = profundidadeMaxima;
        this.temEscamas = temEscamas;
        this.ehVenenoso = ehVenenoso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public double getProfundidadeMaxima() {
        return profundidadeMaxima;
    }

    public void setProfundidadeMaxima(double profundidadeMaxima) {
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public boolean isTemEscamas() {
        return temEscamas;
    }

    public void setTemEscamas(boolean temEscamas) {
        this.temEscamas = temEscamas;
    }

    public boolean isEhVenenoso() {
        return ehVenenoso;
    }

    public void setEhVenenoso(boolean ehVenenoso) {
        this.ehVenenoso = ehVenenoso;
    }

    @Override
    public void nadarSuperficie() {
        System.out.println(getEspecie() + " está nadando para a superficie");
    }

    @Override
    public void nadarProfundeza() {
        System.out.println(getEspecie() + " está nadando até " + getProfundidadeMaxima() + "m");
    }
}
