package ExercícioRevisão2;

import java.util.Scanner;

public class revisão2 {
    Scanner sc = new Scanner(System.in);
    public void Teste() {
        System.out.println("Informe a quantidade de horas trabalhando");
        Double horasTrabalhando = sc.nextDouble();
        System.out.println("Informar o valor da hora trabalhada");
        Double valorHora = sc.nextDouble();

        Double horaExtra = horasTrabalhando-200;
        Double valorHoraExtra = (horaExtra*1.5)*valorHora;
        Double valorSal = valorHora*200;
        Double salárioTotal = valorSal+valorHoraExtra;
        
        System.out.println("O salário total com hora extra é de:"+salárioTotal);
    }
}
