public class ExercicioControleFluxo {

    public static void main(String[] args) {
        /* crie uma variavel salario e imprima de acordo com o imposto
        imposto:
        salario < 1000 * 0.05
        salario >= 1000 && salario < 2000 * 0.1
        salario >= 2000 && salario < 4000 * 0.15
        salario > 5000 * 0.2
        */

        double salario = 3500;
        double imposto;

        if(salario < 1000) {
            imposto = salario * 0.05;

        } else if ( salario >= 1000 && salario < 2000 ){

            imposto = salario *0.1;

        } else if (salario >= 2000 && salario < 4000){
            imposto = salario *0.15;

        } else {

            imposto = salario *0.2;
        }

        System.out.println("O imposto é " + imposto);
    }
}
