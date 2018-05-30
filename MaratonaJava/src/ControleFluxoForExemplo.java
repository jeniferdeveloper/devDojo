public class ControleFluxoForExemplo {
    public static void main(String[] args) {
        // tenho valor total de um carro e quero descobrir em qnts vezes posso parcelar com a regra de parcelas > 1000

        double valorTotal = 30000;

        for(int parcela=1; parcela <= valorTotal; parcela++){
            //salvar o valor da parcela
            double valorParcela = valorTotal / parcela;

            if(valorParcela < 1000) {
                break;
            }

            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);

            /*if(valorParcela >= 1000) {
                System.out.println("Parcela: " + parcela + " R$ " + valorParcela);

            }else {
                System.out.println("Saindo do laço");
                break;
            }

            System.out.println("fora do laço");
            */

        }

    }
}
