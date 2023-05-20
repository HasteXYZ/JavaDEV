package AtivdadesFormativaJava;

import java.util.Scanner;

public class ProgramaExecucao {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Selecione o programa que deseja executar:");
        System.out.println("1. Matriz");
        System.out.println("2. Jogo de Adivinhação");
        System.out.println("3. Vetor Aleatório");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                Matriz.main(args);
                break;
            case 2:
                JogoAdivinhacao.main(args);
                break;
            case 3:
                VetorAleatorio.main(args);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
