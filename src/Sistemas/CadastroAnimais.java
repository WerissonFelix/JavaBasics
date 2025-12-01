package Sistemas;

import java.util.Scanner;
import Class.*;
public class CadastroAnimais {
    Scanner scanner = new Scanner(System.in);
    public  Cachorro cadCachorro(){
        System.out.println("Nome do cachorro: ");
        String nome = scanner.nextLine();

        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Peso");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Habitat: ");
        String habitat = scanner.nextLine();

        System.out.println("Está acordado? (true/false) ");
        boolean estaAcordado = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Estado de saúde? ");
        String estadoSaude = scanner.nextLine();

        System.out.println("Cor dominante: ");
        String corDominante = scanner.nextLine();

        System.out.println("Nível trófico: ");
        String nivelTrofico = scanner.nextLine();

        System.out.println("Raça: ");
        String raca = scanner.nextLine();

        System.out.println("Tamanho");
        String tamanho = scanner.nextLine();

        System.out.println("Precisa de passeio diário? (true/false) ");
        boolean passeioDiario = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Nível de treinamento: (1-5) ");
        int nivelTreinamento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("É brincalhão? ");
        boolean ehBrincalhao = scanner.nextBoolean();
        scanner.nextLine();


        return new Cachorro(nome,idade,peso,habitat,estaAcordado,estadoSaude,corDominante,nivelTrofico,raca,tamanho,passeioDiario, nivelTreinamento, ehBrincalhao);
    }

    public Gato cadGato(){
        System.out.println("Nome do gato: ");
        String nome = scanner.nextLine();

        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Peso");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Habitat: ");
        String habitat = scanner.nextLine();

        System.out.println("Está acordado? (true/false) ");
        boolean estaAcordado = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Estado de saúde? ");
        String estadoSaude = scanner.nextLine();

        System.out.println("Cor dominante: ");
        String corDominante = scanner.nextLine();

        System.out.println("Nível trófico: ");
        String nivelTrofico = scanner.nextLine();

        System.out.println("Raça: ");
        String raca = scanner.nextLine();

        System.out.println("Pelagem: ");
        String pelagem = scanner.nextLine();

        System.out.println("É de rua?(true/false) ");
        boolean ehDeRua = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Gosta de carinho?(true/false) ");
        boolean gostaDeCarinho = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Qtd horas dormidas por dia:  ");
        int horasDesonoDiarias = scanner.nextInt();
        scanner.nextLine();


        return new Gato(nome,idade,peso,habitat,estaAcordado,estadoSaude,corDominante,nivelTrofico,raca,pelagem, ehDeRua, gostaDeCarinho, horasDesonoDiarias);
    }

    public Cavalo cadCavalo(){
        System.out.println("Nome do cavalo: ");
        String nome = scanner.nextLine();

        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Peso");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Habitat: ");
        String habitat = scanner.nextLine();

        System.out.println("Está acordado? (true/false) ");
        boolean estaAcordado = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Estado de saúde? ");
        String estadoSaude = scanner.nextLine();

        System.out.println("Cor dominante: ");
        String corDominante = scanner.nextLine();

        System.out.println("Nível trófico: ");
        String nivelTrofico = scanner.nextLine();

        System.out.println("Raça: ");
        String raca = scanner.nextLine();

        System.out.println("Altura da cernelha: ");
        double alturaCernelha = scanner.nextDouble();

        System.out.println("Velocidade máxima: ");
        double velocidadeMaxima = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("É domesticado?(true/false) ");
        boolean ehDomesticado = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Tipo Crinas: ");
        String tipoCrinas = scanner.nextLine();
        scanner.nextLine();


        return new Cavalo(nome,idade,peso,habitat,estaAcordado,estadoSaude,corDominante,nivelTrofico,raca, alturaCernelha, velocidadeMaxima, ehDomesticado, tipoCrinas);
    }

    public Passaro cadPassaro(){
        System.out.println("Nome do pássaro: ");
        String nome = scanner.nextLine();

        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Peso");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Habitat: ");
        String habitat = scanner.nextLine();

        System.out.println("Está acordado? (true/false) ");
        boolean estaAcordado = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Estado de saúde? ");
        String estadoSaude = scanner.nextLine();

        System.out.println("Cor dominante: ");
        String corDominante = scanner.nextLine();

        System.out.println("Nível trófico: ");
        String nivelTrofico = scanner.nextLine();

        System.out.println("Espécie: ");
        String especie = scanner.nextLine();

        System.out.println("Tamanho da envergadura das Asas: ");
        double envergaduraAsas = scanner.nextDouble();

        System.out.println("Pode falar?(true/false) ");
        boolean podeFalar = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Tipo do bico: ");
        String tipoBico = scanner.nextLine();
        scanner.nextLine();

        System.out.println("É migratório?(true/false) ");
        boolean migratorio = scanner.nextBoolean();
        scanner.nextLine();


        return new Passaro(nome,idade,peso,habitat,estaAcordado,estadoSaude,corDominante,nivelTrofico, especie, envergaduraAsas, podeFalar, tipoBico, migratorio);
    }

    public Peixe cadPeixe(){
        System.out.println("Nome do peixe: ");
        String nome = scanner.nextLine();

        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Peso");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Habitat: ");
        String habitat = scanner.nextLine();

        System.out.println("Está acordado? (true/false) ");
        boolean estaAcordado = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Estado de saúde? ");
        String estadoSaude = scanner.nextLine();

        System.out.println("Cor dominante: ");
        String corDominante = scanner.nextLine();

        System.out.println("Nível trófico: ");
        String nivelTrofico = scanner.nextLine();

        System.out.println("Espécie: ");
        String especie = scanner.nextLine();

        System.out.println("É de água doce ou salgada?  ");
        String tipoAgua = scanner.nextLine();

        System.out.println("Profundidade máxima suportada: ");
        double profundidadeMaxima = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Tem escamas?(true/false) ");
        boolean temEscamas = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("É venenoso?(true/false) ");
        boolean ehVenenoso = scanner.nextBoolean();
        scanner.nextLine();


        return new Peixe(nome,idade,peso,habitat,estaAcordado,estadoSaude,corDominante,nivelTrofico, especie, tipoAgua, profundidadeMaxima, temEscamas, ehVenenoso);
    }
}
