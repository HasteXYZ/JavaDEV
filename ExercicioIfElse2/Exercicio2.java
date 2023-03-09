package ExercicioIfElse2;

import java.util.Scanner;

public class Exercicio2 {

    Scanner sc = new Scanner(System.in);

    public void exercicio2() {
        int anoMinimo = 2007;
        System.out.println("Informe seu ano de nascimento");
        int ano = sc.nextInt();
        if (ano <= anoMinimo) {
            System.out.println("Você pode votar");
        } else if (ano > anoMinimo) {
            System.out.println("Você não pode votar esse ano");
        }

    }
}
