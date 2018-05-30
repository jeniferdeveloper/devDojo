public class ControleFluxoForWhile {

    public static void main(String[] args) {

        //while e do while vc utiliza qnd vc nao saber qnts vezes terá q repetir o código
        //While comando de repetição enquanto a setença for verdade
        // valor booleano ou comparação

        int contador = 11;

        while (contador < 10) {
            System.out.println(contador++);
            //contador++;
        }

        contador = 0;

        //sendo falso ou verdadeiro ele executa pelo menos uma vez
        do {
            System.out.println("Dentro do Do While: " + contador++);
        }while (contador < 10);

        //for vc utiliza qnd sabe qnts vezes deve ser executado
        //variavel; condição; o q acontece com a varivel
        for(int i=0; i<10; i++) {
            System.out.println("O valor de i é: " + i);
            if(i==5) {
                break;
            }
        }

    }
}
