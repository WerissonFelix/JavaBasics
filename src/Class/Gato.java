package Class;

import Abstract.Animal;
import Interfaces.AnimalTerrestre;

public class Gato extends Animal implements AnimalTerrestre {
    private String raca;
    private String pelagem; // Curta, Longa, Média
    private boolean ehDeRua;
    private boolean gostaDeCarinho;
    private int horasSonoDiarias;

    public Gato(String nome, int idade, double peso, String habitat, boolean estaAcordado, String estadoSaude, String corDominante, String nivelTrofico,
                String raca, String pelagem, boolean ehDeRua, boolean gostaDeCarinho, int horasSonoDiarias) {
        super(nome, idade, peso, habitat, estaAcordado, estadoSaude, corDominante, nivelTrofico);
        this.raca = raca;
        this.pelagem = pelagem;
        this.ehDeRua = ehDeRua;
        this.gostaDeCarinho = gostaDeCarinho;
        this.horasSonoDiarias = horasSonoDiarias;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getPelagem(){
        return pelagem;
    }

    public void setPelagem(String pelagem){
        this.pelagem = pelagem;
    }

    public boolean getEhDeRua(){
        return  ehDeRua;
    }

    public void setEhDeRua(boolean ehDeRua){
        this.ehDeRua = ehDeRua;
    }

    public boolean isEhDeRua() {
        return ehDeRua;
    }

    public boolean isGostaDeCarinho() {
        return gostaDeCarinho;
    }

    public void setGostaDeCarinho(boolean gostaDeCarinho) {
        this.gostaDeCarinho = gostaDeCarinho;
    }

    public int getHorasSonoDiarias() {
        return horasSonoDiarias;
    }

    public void setHorasSonoDiarias(int horasSonoDiarias) {
        this.horasSonoDiarias = horasSonoDiarias;
    }

    @Override
    public void correr() {
        System.out.println(getNome() + "está correndo para pegar o rato");
    }

    @Override
    public void quantidadePatas() {
        System.out.println(getNome() + "tem 4 patas");

    }
}
