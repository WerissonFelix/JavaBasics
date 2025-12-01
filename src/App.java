import Class.Cachorro;

import java.util.ArrayList;
import java.util.Scanner;

import Sistemas.CadastroAnimais;
import Sistemas.Listagem;
import Class.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        CadastroAnimais cadastro = new CadastroAnimais();

        ArrayList<Cachorro> cachorros = new ArrayList<>();
        ArrayList<Gato> gatos = new ArrayList<>();
        ArrayList<Cavalo> cavalos = new ArrayList<>();
        ArrayList<Passaro> passaros = new ArrayList<>();
        ArrayList<Peixe> peixes = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n=== SISTEMA DE ANIMAIS ===");
            System.out.println("1. Cadastrar Cachorro");
            System.out.println("2. Cadastrar Gato");
            System.out.println("3. Cadastrar Cavalo");
            System.out.println("4. Cadastrar Pássaro");
            System.out.println("5. Cadastrar Peixe");
            System.out.println("6. Opções de listagem");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    cachorros.add(cadastro.cadCachorro());
                    break;
                case 2:
                    gatos.add(cadastro.cadGato());
                    break;
                case 3:
                    cavalos.add(cadastro.cadCavalo());
                    break;
                case 4:
                    passaros.add(cadastro.cadPassaro());
                    break;
                case 5:
                    peixes.add(cadastro.cadPeixe());
                    break;
                case 6:
                    App.menuListar(cachorros, gatos, cavalos, passaros, peixes);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void menuListar(ArrayList<Cachorro> cachorros, ArrayList<Gato> gatos, ArrayList<Cavalo> cavalos, ArrayList<Passaro> passaros, ArrayList<Peixe> peixes) {
        Scanner scanner = new Scanner(System.in);
        Listagem listar = new Listagem();
        int opcao;
        do {
            System.out.println("\n=== SISTEMA DE ANIMAIS ===");
            System.out.println("1. Listar Cachorros");
            System.out.println("2. Listar Gatos");
            System.out.println("3. Listar Cavalos");
            System.out.println("4. Listar Pássaros");
            System.out.println("5. Listar Peixes");
            System.out.println("6. Listar Ações");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    listar.listarCachorros(cachorros);
                    break;
                case 2:
                    listar.listarGatos(gatos);
                    break;
                case 3:
                    listar.listarCavalos(cavalos);
                    break;
                case 4:
                    listar.listarPassaros(passaros);
                    break;
                case 5:
                    listar.listarPeixes(peixes);
                    break;
                case 6:
                    menuListarAcoes(cachorros, gatos, cavalos, passaros, peixes);
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (true);
    }




    public static void menuListarAcoes(ArrayList<Cachorro> cachorros, ArrayList<Gato> gatos, ArrayList<Cavalo> cavalos, ArrayList<Passaro> passaros, ArrayList<Peixe> peixes) {
        Scanner scanner = new Scanner(System.in);
        Listagem listar = new Listagem();
        int opcao;
        do {
            System.out.println("\n=== SISTEMA DE ANIMAIS ===");
            System.out.println("1. Ações Cachorros");
            System.out.println("2. Ações Gatos");
            System.out.println("3. Ações Cavalos");
            System.out.println("4. Ações Pássaros");
            System.out.println("5. Ações Peixes");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    listar.listarCachorrosAcoes(cachorros);
                    break;
                case 2:
                    listar.listarGatosAcoes(gatos);
                    break;
                case 3:
                    listar.listarCavalosAcoes(cavalos);
                    break;
                case 4:
                    listar.listarPassarosAcoes(passaros);
                    break;
                case 5:
                    listar.listarPeixesAcoes(peixes);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (true);
    }

}