public class ExemploCondicao2 {


    /*
        Desconto gradativo
        Valor maior que 1000 - 10%
        Valor maior que 2000 - 20%
        Valor maior igual  que 3000 - 30%
        Valor menor igual a 1000 - 0%
     */

    public static void main(String[] args) {

        double valorBruto = 1500;


    if (valorBruto > 1000 ) {
        double desconto = valorBruto * 0.10;
    }else if (valorBruto > 2000){
        double desconto = valorBruto * 0.20;
    } else if( valorBruto >= 3000) {
        double desconto = valorBruto * 0.30;
    }
    }
}
