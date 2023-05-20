package AtivdadesFormativaJava;

import java.util.Random;

public class VetorAleatorio {
    public static void main(String[] args) {
        
        Random random = new Random();
        int tamanhoVetor = random.nextInt(901) + 100; // Entre 100 e 1000
        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1; // Entre 1 e 100
        }
      
        System.out.println("Vetor:");
        listarVetor(vetor);

        System.out.println("\nNúmeros pares do vetor:");
        exibirPares(vetor);

        System.out.println("\nNúmeros ímpares do vetor:");
        exibirImpares(vetor);

        int paresNasPosicoesImpares = contarParesNasPosicoesImpares(vetor);
        System.out.println("\nQuantidade de números pares nas posições ímpares do vetor: " + paresNasPosicoesImpares);

        int imparesNasPosicoesPares = contarImparesNasPosicoesPares(vetor);
        System.out.println("Quantidade de números ímpares nas posições pares do vetor: " + imparesNasPosicoesPares);
    }

    public static void listarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void exibirPares(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
    }

    public static void exibirImpares(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " ");
            }
        }
    }

    public static int contarParesNasPosicoesImpares(int[] vetor) {
        int count = 0;
        for (int i = 1; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int contarImparesNasPosicoesPares(int[] vetor) {
        int count = 0;
        for (int i = 0; i < vetor.length; i += 2) {
            if (vetor[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
