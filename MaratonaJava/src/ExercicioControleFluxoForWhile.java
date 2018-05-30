public class ExercicioControleFluxoForWhile {
    public static void main(String[] args) {
        //Imprima todos os numero pares de 0 ate 100000

        int numeroPares = 100000;

        for(int i=0; i<=numeroPares; i++) {
            //se o resto de i for dividido por 2 e for == 0
            // numeros impares i%2!=0
            if(i%2==0) {
                System.out.println("Numeros pares: " + i);
            }

        }
    }
}
