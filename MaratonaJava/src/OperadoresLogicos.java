public class OperadoresLogicos {

    public static void main(String[] args) {

        // && = AND / || = OR

        int idade = 18;
        float salario = 1000f;

        // as duas condições tem q ser verdadeira
        System.out.println(idade >= 18 && salario >= 3000);
        // uma das condições tem q ser verdadeira
        System.out.println(idade >= 18 || salario >= 3000);

    }

}
