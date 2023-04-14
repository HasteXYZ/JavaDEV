package ExercicioWhile4;

import java.util.Scanner;

public class Exercicio4 {
    Scanner sc = new Scanner(System.in);

    public void Exercicio4() {
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", };
        String vogais[] = new String[] { "a", "e", "i", "o", "u" };
        int i = 0;
        int cont = 0;
        while (i < letras.length) {
            if (letras[i] == "a" || letras[i] == "e" || letras[i] == "i" || letras[i] == "o" || letras[i] == "u") {

            } else {
                cont++;
                System.out.println(letras[i] + " é consoante");
            }
            i++;
        }
        System.out.println("o nº de consoante é" + cont);
    }

    /**
     * 
     */
    public void Exercicio5() {
        int vetor[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, };
        int i = 0;
        int contPar = 0;
        int contImpar = 0;
        while (i < vetor.length) {
            if (vetor[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            i++;
        }
        int vetorPar[] = new int[contPar];
        int vetorImpar[] = new int[contImpar];
        i = 0;
        contPar = 0;
        contImpar = 0;
        while (i < vetor.length) {
            if (vetor[i] % 2 == 0) {
                vetorPar[contPar] = vetor[i];
                contPar++;
            } else {
                vetorImpar[contImpar] = vetor[i];
                contImpar++;
            }
            i++;
        }

        i = 0;
        while (i < vetor.length) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
            i++;
        }
        i = 0;
        while (i < vetorPar.length) {
            System.out.println("vetorPar[" + i + "]=" + vetorPar[i]);
            i++;
        }
        i = 0;
        while (i < vetorImpar.length) {
            System.out.println("vetorImpar[" + i + "]=" + vetorImpar[i]);
            i++;
        }
    }

    public void Exercicio5Extra() {
        int vetor[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, };
        int vetorPar[] = new int[]{};
    }

}