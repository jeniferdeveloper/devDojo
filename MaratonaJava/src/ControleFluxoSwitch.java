public class ControleFluxoSwitch {

    public static void main(String[] args) {
        /*Tarefa
        Dados os numeros de 1 a 7 imprima os dias da semana
         */
        byte dia = 2;

        /*Tipos q podem ir no switch
        char, int, byte, short, enum e String
         */

        //passar a variavel
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                if (true) {
                    System.out.println("true");
                }
                break;

            case 6:
                System.out.println("Sexta");
                break;

            case 7:
                System.out.println("Sábado");
                break;
        }

//        if(dia == 1) {
//            System.out.println("Domingo");
//        } else if(dia == 2) {
//            System.out.println("Segunda");
//        }

        char sexo = 'S';

        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break;

            case 'M':
                System.out.println("Masculino");
                break;

            default:
                System.out.println("Opção inválida");
        }

    }
}
