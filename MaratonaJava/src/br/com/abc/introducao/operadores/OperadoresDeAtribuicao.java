package br.com.abc.introducao.operadores;

public class OperadoresDeAtribuicao {

    public static void main(String[] args) {

        // Atribuição: =, -=, +=, *=, /=, %=

        int salario = 1800;
        //salario = salario + 1000;
        //salario += 1000;
        salario = salario + (int)(salario * 0.1);

        int numero = 11;
        numero %= 2;

        System.out.println("O resto é: " + numero);
        System.out.println("O salario é: " + salario);
    }
}
