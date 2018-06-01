package br.com.abc.introducao.controlefluxo;

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
        //pega primeiro o if idade < 18 ? <coloca o q for true> : <coloca o q for false>;
        // vai atribruir o true ou false pr a variavel status
        // os valores de "Não adulto" devem bater com status, por exemplo se status for string "Não adulto" tb terá q ser.
        status = idade < 18 ? "Não adulto" : "Adulto" ;

        //Não se deve usar qnd tem mais de 2 condições
        //status = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulto";

        System.out.println(status);
    }
}
