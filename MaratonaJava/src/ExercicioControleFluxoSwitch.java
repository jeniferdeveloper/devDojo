public class ExercicioControleFluxoSwitch {

    public static void main(String[] args) {
        /* Crie um switch que dado um valor de 1 a 7
        considerando 1 domingo imprima se é dia útil ou final de semana
        */

        byte dia = 10;

        //Opção 1
        switch (dia) {
            case 1: case 2: case 3: case 4: case 5: case 6: case 7:
                if (dia >= 2 && dia <= 6) {
                    System.out.println("Dia util");
                } else {
                    System.out.println("Fim de semana");
                }
                break;

            default:
                 System.out.println("Opção inválida");
        }

        //Opção 2
//        switch (dia) {
//            case 1: case 7:
//                System.out.println("Final de semana");
//                break;
//
//            case 2: case 3: case 4: case 5: case 6:
//                System.out.println("Dia util");
//                break;
//
//            default:
//                System.out.println("Opção inválida");
//        }

        //Opção 3
        /* switch (dia) {
            case 1:
                System.out.println("Domingo");
                if (dia >= 2 && dia <= 6) {
                    System.out.println("Dia util");
                } else {
                    System.out.println("Fim de semana");
                }
                break;

            case 2:
                System.out.println("Segunda");
                if (dia >= 2 && dia <= 6) {
                    System.out.println("Dia util");
                } else {
                    System.out.println("Fim de semana");
                }
                break;

            case 3:
                System.out.println("Terça");
                if (dia >= 2 && dia <= 6) {
                    System.out.println("Dia util");
                } else {
                    System.out.println("Fim de semana");
                }
                break;

            case 4:
                System.out.println("Quarta");
                if (dia >= 2 && dia <= 6) {
                    System.out.println("Dia util");
                } else {
                    System.out.println("Fim de semana");
                }
                break;

            case 5:
                System.out.println("Quinta");
                if (dia >= 2 && dia <= 6) {
                    System.out.println("Dia util");
                } else {
                System.out.println("Fim de semana");
            }
                break;

            case 6:
                System.out.println("Sexta");
                if (dia >= 2 && dia <= 6) {
                    System.out.println("Dia util");
                } else {
                    System.out.println("Fim de semana");
                }
                break;

            case 7:
                System.out.println("Sábado");
                if (dia >= 2 && dia <= 6) {
                    System.out.println("Dia util");
                } else {
                    System.out.println("Fim de semana");
                }
                break;

            default:
                System.out.println("Opção inválida");
        }
        */
    }
}
