package Sistemas;

import Class.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Listagem {

    public void listarCachorros(ArrayList<Cachorro> cachorros){
        for (Cachorro cachorro: cachorros){
            System.out.println(cachorro.InformacoesGerais());
        }
    }

    public void listarGatos(ArrayList<Gato> gatos){
        for (Gato gato: gatos){
            System.out.println(gato.InformacoesGerais());
        }
    }

    public void listarCavalos(ArrayList<Cavalo> cavalos){
        for (Cavalo cavalo: cavalos){
            System.out.println(cavalo.InformacoesGerais());
        }
    }

    public void listarPassaros(ArrayList<Passaro> passaros){
        for (Passaro passaro: passaros){
            System.out.println(passaro.InformacoesGerais());
        }
    }

    public void listarPeixes(ArrayList<Peixe> peixes){
        for (Peixe peixe: peixes){
            System.out.println(peixe.InformacoesGerais());
        }
    }

    public void listarCachorrosAcoes(ArrayList<Cachorro> cachorros){
        for (Cachorro cachorro: cachorros){
            cachorro.correr();
            cachorro.quantidadePatas();
        }
    }

    public void listarGatosAcoes(ArrayList<Gato> gatos){
        for (Gato gato: gatos){
            gato.correr();
            gato.quantidadePatas();
        }
    }

    public void listarCavalosAcoes(ArrayList<Cavalo> cavalos){
        for (Cavalo cavalo: cavalos){
            cavalo.correr();
            cavalo.quantidadePatas();
        }
    }

    public void listarPassarosAcoes(ArrayList<Passaro> passaros){
        for (Passaro passaro: passaros){
            passaro.voar();
            passaro.planar();
        }
    }

    public void listarPeixesAcoes(ArrayList<Peixe> peixes){
        for (Peixe peixe: peixes){
           peixe.nadarSuperficie();
           peixe.nadarProfundeza();
        }
    }
}
