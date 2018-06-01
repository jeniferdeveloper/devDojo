public class Arrays3 {

    public static void main(String[] args) {

        //variavel de refencia
        //um array é  sempre um objeto
        //Primeira forma
        int[] numeros = new int[5];

        //Segunda forma
        int[] numeros2 = {1,2,3,4,5}; // tam = 5, index = 0 ate 4

        //Terceira forma
        int[] numeros3 = new int[]{1,2,3,4,5};

//        for(int i=0; i<numeros2.length; i++){
//            System.out.println(numeros2[i]);
//        }

        //vai pegar cada posição de numeros2 e jogar na variavel aux
        for(int aux : numeros2) {
            System.out.println(aux);
        }


    }
}
