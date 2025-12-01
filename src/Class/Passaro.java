package Class;

import Abstract.Animal;
import Interfaces.AnimalVoador;

public class Passaro extends Animal implements AnimalVoador {
    private String especie;
    private double envergaduraAsas;
    private boolean podeFalar;
    private String tipoBico; // Curvo, Reto, Longo
    private boolean migratorio;

    public Passaro(String nome, int idade, double peso, String habitat, boolean estaAcordado, String estadoSaude, String corDominante, String nivelTrofico,
                   String especie, double envergaduraAsas, boolean podeFalar, String tipoBico, boolean migratorio) {
        super(nome, idade, peso, habitat, estaAcordado, estadoSaude, corDominante, nivelTrofico);
        this.especie = especie;
        this.envergaduraAsas = envergaduraAsas;
        this.podeFalar = podeFalar;
        this.tipoBico = tipoBico;
        this.migratorio = migratorio;
    }

    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public double getEnvergaduraAsas(){
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas){
        this.envergaduraAsas = envergaduraAsas;
    }

    public boolean isPodeFalar() {
        return podeFalar;
    }

    public void setPodeFalar(boolean podeFalar) {
        this.podeFalar = podeFalar;
    }

    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }

    public boolean isMigratorio() {
        return migratorio;
    }

    public void setMigratorio(boolean migratorio) {
        this.migratorio = migratorio;
    }

    @Override
    public void voar() {
        System.out.println(getEspecie() + " está voando para o ninho");
    }

    @Override
    public void planar() {
        System.out.println(getEspecie() + " está planando no ninho");
    }
}
