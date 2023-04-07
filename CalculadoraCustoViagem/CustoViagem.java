package CalculadoraCustoViagem;

/**
 * CalculandoDistanciaDeCidades
 */
public class CalculandoDistanciaDeCidades{}

    public class CalculadoraCustoViagem {

        public static void main(String[] args) {
            System.out.println("===Custo de Viagem===");
            int DistanciaPercorrida = 820;
            int PreçodaGasolina = 5;
            int PreçodoPedagio = 8;
            int LitroPorkm = 14;
            float tempoeDistan = DistanciaPercorrida*PreçodaGasolina/LitroPorkm+PreçodoPedagio;
            System.out.println("Custo de Pedagio");
            System.err.println(PreçodoPedagio);
            System.out.println("O custo de viagem foi de");
            System.out.println(tempoeDistan);
        }
}
