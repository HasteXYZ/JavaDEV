package ExercicioIfElse4;

import java.util.Scanner;

public class Exercicio4 {

    Scanner sc = new Scanner(System.in);

    public void exercicio4() {
        double compraMenor = 0.30;
        double compraMaior = 0.25;       
        System.out.println("Qantas maças foram compradas?");
        int compraMaças = sc.nextInt();
        double desconto1 = ( compraMaças * compraMenor );
        double desconto2 = ( compraMaças * compraMaior );

        if (compraMaças < 12){
            System.out.println("O valor da sua compra é de" + desconto2 );
            }else if(compraMaças >=12){
            System.out.println("O valor da sua compra é de" + desconto1 );
        }
 
    }
}


