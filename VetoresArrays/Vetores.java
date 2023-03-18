package VetoresArrays;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // Criar meu vetor
        double[] valores = new double[] { 10.5, 15.8, 7.5, -17.6 };
        System.out.println("O 1º Elemento do Vetor - Valores[0] é" + valores[0]);
        System.out.println("O 2º Elemento do Vetor - Valores[1] é" + valores[1]);
        System.out.println("O 3º Elemento do Vetor - Valores[2] é" + valores[2]);
        System.out.println("O 4º Elemento do Vetor - Valores[3] é" + valores[3]);
        System.out.println("Digite um novo valor para a 4º posição/indice 3");
        valores[3] = sc.nextDouble();
        System.out.println("O novo valor para a 4º posição/indice[3] é" + valores[3]);
    }

    public void exemplo2() {
        // criar um vetor vazio (vazio)
        int valoresInt[] = new int[5];
        System.out.println("Digite 5 Valores Inteiros");
        valoresInt[0] = sc.nextInt();
        valoresInt[1] = sc.nextInt();
        valoresInt[2] = sc.nextInt();
        valoresInt[3] = sc.nextInt();
        valoresInt[4] = sc.nextInt();
        System.out.println("O 1º Elemento do Vetor índice[0] é " + valoresInt[0]);
        System.out.println("O 2º Elemento do Vetor índice[1] é " + valoresInt[1]);
        System.out.println("O 3º Elemento do Vetor índice[2] é " + valoresInt[2]);
        System.out.println("O 4º Elemento do Vetor índice[3] é " + valoresInt[3]);
        System.out.println("O 5º Elemento do Vetor índice[4] é " + valoresInt[4]);
    }
    public void exemplo3() {
        double valores[] = new double[10];
        System.out.println("Digite 10 valores");
        valores[0] = sc.nextDouble();
        valores[1] = sc.nextDouble();
        valores[2] = sc.nextDouble();
        valores[3] = sc.nextDouble();
        valores[4] = sc.nextDouble();
        valores[5] = sc.nextDouble();
        valores[6] = sc.nextDouble();
        valores[7] = sc.nextDouble();
        valores[8] = sc.nextDouble();
        valores[9] = sc.nextDouble();
        System.out.println("O 9º Elemento do Vetor Índice[9] é " + valores[9]);
        System.out.println("O 8º Elemento do Vetor Índice[8] é " + valores[8]);
        System.out.println("O 7º Elemento do Vetor Índice[7] é " + valores[7]);
        System.out.println("O 6º Elemento do Vetor Índice[6] é " + valores[6]);
        System.out.println("O 5º Elemento do Vetor Índice[5] é " + valores[5]);
        System.out.println("O 4º Elemento do Vetor Índice[4] é " + valores[4]);
        System.out.println("O 3º Elemento do Vetor Índice[3] é " + valores[3]);
        System.out.println("O 2º Elemento do Vetor Índice[2] é " + valores[2]);
        System.out.println("O 1º Elemento do Vetor Índice[1] é " + valores[1]);
        System.out.println("O 0º Elemento do Vetor Índice[0] é " + valores[0]);
    }
    public void exemplo4(){
        int notasAluno[]= new int[4];
        System.out.println("Digite as 4 notas do Aluno");
        notasAluno[0]=sc.nextInt();
        notasAluno[1]=sc.nextInt();
        notasAluno[2]=sc.nextInt();
        notasAluno[3]=sc.nextInt();
        double média = (notasAluno[0]+notasAluno[1]+notasAluno[2]+notasAluno[3])/4;
        System.out.println("A 1º bota é"+notasAluno[0]);
        System.out.println("A 2º bota é"+notasAluno[1]);
        System.out.println("A 3º bota é"+notasAluno[2]);
        System.out.println("A 4º bota é"+notasAluno[3]);
        System.out.println("A média é "+média);
}
}