package AtivdadesFormativaJava;

import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroSorteado = (int) (Math.random() * 1001);
        int tentativas = 0;
        int palpite;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite um palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("Palpite menor do que o número sorteado!");
            } else if (palpite > numeroSorteado) {
                System.out.println("Palpite maior do que o número sorteado!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s)!");
            }
        } while (palpite != numeroSorteado);
    }

    public void JogoAdivinhacao() {
    }
}

