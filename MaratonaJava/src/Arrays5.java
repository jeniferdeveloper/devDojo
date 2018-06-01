public class Arrays5 {
    public static void main(String[] args) {
        //Array Unidmensional
        int[] dias = new int[31];

        //Arrays Bidmensionais precisa de 2 for
        //o primeiro array vai fazer referencia pr outro array de 2 posições e a
        // segunda posição q vai receber os valores int pois a 1ª vai receber as referencias
        int[][] dias2 = new int[2][2];

        dias2[0][0] = 30;
        dias2[0][1] = 31;
        dias2[1][0] = 29;
        dias2[1][1] = 28;

        //traz o endereço de memoria da segunda posição
        for(int i = 0; i<dias2.length; i++) {
            System.out.println(dias2[i]);
            //traz os valores definidos pr a segunda posição
            for(int j = 0; j<dias2[i].length; j++){
                System.out.println(dias2[i][j]);
            }
        }

        System.out.println("-------------------------");

        for(int[] ref : dias2) {
            for(int dia : ref){
                System.out.println(dia);
            }
        }

    }
}
