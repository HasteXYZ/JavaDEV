package EstruturaDecisãoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);
    public void letra() {
        System.out.println("Informe uma Letra");
        String LetraDigitada = sc.nextLine();
        switch(LetraDigitada) {
             case "a": System.out.println(LetraDigitada+" É vogal");
             break;
             case "e": System.out.println(LetraDigitada+" É vogal");
             break;
             case "i": System.out.println(LetraDigitada+" É vogal");
             break;
             case "o": System.out.println(LetraDigitada+" É vogal");
             break;
             case "u": System.out.println(LetraDigitada+" É vogal"); 
             break;
             default:System.out.println(LetraDigitada+" É consoante");
             break;
        }
    }
}

