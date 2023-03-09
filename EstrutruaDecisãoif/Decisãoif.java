package EstrutruaDecisãoif;

import java.util.Scanner;
import java.util.function.IntFunction;

public class Decisãoif {
    Scanner sc = new Scanner(System.in);
    // Decisão IF Desencadeada
    public void calcularDescontoIf() {
        System.out.println("Informe o valor do Produto");
        double ValorProduto = sc.nextDouble();
        // boolean produtoAltoValor = precoProduto >= 100;
        double percentualDesconto = 0.0;
        if (ValorProduto >= 200 && ValorProduto< 300) {
            percentualDesconto = 10.0;
        }
        if (ValorProduto >= 100 && ValorProduto<200) // Estrtura de decisao if
            // Desconto para produtos de alto valor.
            percentualDesconto = 5.0;
    
        if (ValorProduto >=300){
            percentualDesconto = 15.0;
}

    // Regra de três
    double Desconto =(ValorProduto = percentualDesconto) / 100;
    double precoComDesconto = ValorProduto - Desconto;
    System.out.println("O produto caíra por R$" + precoComDesconto);
}
     public void DecisaoIfElse(){
     System.out.println("Informe o Valor do Produto:");
     double ValorProduto = sc.nextDouble()
     double percentualDesconto;
     //decisão if Encadeada
     if (ValorProduto>=200){
        percentualDesconto= 10.0;
     }
     else if(ValorProduto>=100){
        percentualDesconto= 5.0;
     }
     else{
        percentualDesconto = 0.0;
     }
     // Regra de três
    double Desconto =(ValorProduto = percentualDesconto) / 100;
    double precoComDesconto = ValorProduto - Desconto;
    System.out.println("" + precoComDesconto);
}
     }
    
