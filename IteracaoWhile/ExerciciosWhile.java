package IteracaoWhile;

public class ExerciciosWhile {
    public void Exercicio1() {
        int vetorA[] = new int[] { 3, 5, 7, 11, 13 };
        int vetorB[] = new int[5];
        int i = 0;
        while (i < vetorA.length)
            ;
        vetorB[i] = vetorA[i];
        System.out.println("VetorB[" + i + "]=" + vetorB[i]);
        i++;
    }

  
        public void Exercicio2() {
            int vetorA[] = new int[] { 3, 5, 7, 11, 13, 17, 19, 23 };
            int vetorB[] = new int[vetorA.length];
            int i = 0;
            while (i < vetorA.length)
            vetorB[i] = vetorA[i]*2;
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
        public void Exercicio3() {
            int vetorA[] = new int[] { 3, 5, 7, 11, 13, 17, 19, 23, 27, 37, 43, 47, 53, 59, 67 };
            int vetorB[] = new int[vetorA.length];
            int i = 0;
            while (i < vetorA.length)
            vetorB[i] = vetorA[i]*2;
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
       
        public void Exercicio4() {
            int vetorA[] = new int[] { 3, 5, 7, 11, 13, 17, 19, 23, 27, 37, 43, 47, 53, 59, 67 };
            double vetorB[] = new double[vetorA.length];
            int i = 0;
            while (i < vetorA.length)
            vetorB[i] = Math.sqrt(i);
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
    }
}


        
