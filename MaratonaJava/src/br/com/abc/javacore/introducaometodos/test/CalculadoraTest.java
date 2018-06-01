package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        //passar 2 argumentos pr os parametros
        calc.multiplicaDoisNumeros(5, 5);
        System.out.println("Divisão de dois numeros: " + calc.divideDoisNumeros(20,0));

        System.out.println("Imprimindos dois numeros divididos");
        calc.imprimeDoisNumerosDivididos(20,5);

        System.out.println("Continuando a execeção");
    }
}
