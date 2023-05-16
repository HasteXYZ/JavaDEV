package IteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);
    private int j;

    public void exemplo1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("o º da iteração é " + i);
        }
    }

    public void exemplo2() {
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + 1 + "]=");
            vetor[i] = sc.nextInt();

        }
        for (int i = 9; i >= 0; i--) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }
    }

    public void exemplo3() {
        double carrinhoCompra[] = new double[] { 19.90, 35.70, 56.80, 97.50 };
        double valorFinal = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
            System.out.println(" Valor Parcial Compra: R$" + valorFinal);
        }
    }

    public void exemplo4() {
        double vetorNotas[] = new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a Nota" + (1 + 1) + ":");
            vetorNotas[i] = sc.nextDouble();

        }
        double mediaNotas = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas += vetorNotas[i];
            System.out.println("A" + (i + 1) + "ª Nota é " + vetorNotas[i]);

        }
        mediaNotas /= vetorNotas.length;
        System.out.println(("A média do Aluno é" + mediaNotas));
    }

    /**
     * 
     */
    public void exemplo5() {
        double vetorMedia[] = new double[10];
        for (int i = 0; i < vetorMedia.length; i++) {
            double Notas = 0;
            for (int j = 0; j < 4; j++) {

                System.out.println("Nota " + (j + 1) + "Aluno" + (j + 1) + ":");
                Notas += sc.nextDouble();

            }
            Notas /= 4;
            vetorMedia[i] = Notas;

        }
        for (int i = 0; i < vetorMedia.length; i++) {
            if (vetorMedia[i] > 7) {
                System.out.println("A média do aluno" + (i + 1) + " é " + vetorMedia[i]);
            }
        }
    }

    public void exemplo6() {

        Scanner input = new Scanner(System.in);
        double[] medias = new double[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as quatro notas do aluno " + (i + 1) + ": ");
            double nota1 = input.nextDouble();
            double nota2 = input.nextDouble();
            double nota3 = input.nextDouble();
            double nota4 = input.nextDouble();

            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            medias[i] = media;

            if (media >= 7.0) {
                count++;
            }
        }

        System.out.println("Número de alunos com média maior ou igual a 7.0: " + count);
    }

    public void Exemplo7() {
        

        
        int[] vetor = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "o número: ");
            vetor[i] = leitor.nextInt();

            soma += vetor[i];
            multiplicacao *= vetor[i];
        }

        System.out.print("Números digitados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
    }
}


