public class ControleFluxoIf1 {

    public static void main(String[] args) {

        /* Jogo  de Tenis
         idade < 15 categoria infantil
         idade >= 15 && idade < 18 categoria juvenil
         idade >= 18 categoria adulto
        */

        int idade = 18;
        String categoria;
        //float salario = 2000;
        //boolean c = false;

        if(idade < 15) {
            //categoria = (recebe/atribui) == (compara)
            categoria = "infantil";

        } else if (idade >= 15 && idade < 18 ){
            categoria = "juvenil";

        } else {
            categoria = "adulto";
        }

        System.out.println("A categoria é: " + categoria);
    }
}
