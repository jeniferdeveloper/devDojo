public class ControleFluxo2 {

    public static void main(String[] args) {
        int idade = 15;
        String status;

        /*
        if(idade < 18) {
            status = "Não adulto";
        } else {
           status = "Adulto";
        }
        */

        // OPERADOR TERNÁRIO até 2 condições
        status = idade < 18 ? "Não adulto" : "Adulto" ;

        System.out.println(status);
    }
}
