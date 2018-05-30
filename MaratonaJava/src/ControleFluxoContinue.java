public class ControleFluxoContinue {
    public static void main(String[] args) {

        // tenho valor total de um carro e quero descobrir em qnts vezes posso parcelar com a regra de parcelas > 1000

        double valorTotal = 30000;

        for(int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;

            if(valorParcela<=1000) {
                //continua o codigo sem passar pelo q esta abaixo dele
                continue;
            }

            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
        }
    }
}
