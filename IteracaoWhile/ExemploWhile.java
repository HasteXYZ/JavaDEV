package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

import javax.swing.BoundedRangeModel;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);
    private Random rd;

    public void exemplo1() {
        int iteracao = 0;
        while (iteracao < 1234599999) {
            iteracao += 1;
            System.out.println("essa é a iteracao de nº" + iteracao);

        }
    }

    public void exemplo2() {
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(10);
        boolean tenteNovamente = true;
        System.out.println("Aperte CTRL+C, a qualquer momento, para parar.");
        while (tenteNovamente) {
            System.out.println("Tente adivinha o número");
            int numero = sc.nextInt();
            tenteNovamente = numeroAleatorio != numero;
            if (tenteNovamente) {
                System.out.println("Errado! Tente Novamente");
            }

        }
        System.out.println("Parabéns! você adivinhou. Era o número" + numeroAleatorio + " mesmo.");

        System.out.println("Fim!");
        System.out.println("-------------------------");
    }

    public void exemplo3() {
        int vetor[] = new int[5];
        int i = 0;
        while (i < 5) {
            System.out.println("Digite o valor para o vetor");   
            vetor[i] = sc.nextInt();
            i++;
        }
        i=0;
        while (i < 5) {
            System.out.println(vetor[i]);
            i++;
        }

    }
}
