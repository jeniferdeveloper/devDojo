package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {

    //void nao traz retorno
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        //double resultado = num1/num2;
        //return resultado;
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {

        if (num2 != 0) {
            System.out.println(num1 / num2);
            //serve como break pois volta pr a classe q o chamou assim nao continua o if ate o final e nao imprime 2 vezes
            return;
        }
        System.out.println("Não é possivel dividir por 0");
    }
}
