import java.util.Scanner;

public class ExemploCondicao2 {


    /*
        Desconto gradativo
        Valor maior que 1000 - 10%
        Valor maior que 2000 - 20%
        Valor maior igual  que 3000 - 30%
        Valor menor igual a 1000 - 0%
     */

    public static void main(String[] args) {

        double valorBruto;
        double desconto = 0d; // esse d significa que é double, pode ser uma 0d ou um 0.0


        Scanner scanner = new Scanner(System.in);

        valorBruto = scanner.nextDouble();

    if (valorBruto > 1000  && valorBruto <= 2000) {
        desconto = valorBruto * 0.10;
    }else if (valorBruto > 2000 && valorBruto <= 3000){
         desconto = valorBruto * 0.20;
    } else if( valorBruto >= 3000) {
         desconto = valorBruto * 0.30;
    }
    System.out.println("Valor Bruto é : " + valorBruto);
    System.out.println("Valor do desconto é: " + desconto);
    System.out.println("Valor liquido é :" + ( valorBruto - desconto));



    }
}
