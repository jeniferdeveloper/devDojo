package br.com.abc.javacore.introducaometodos.classes;

/* EXERECICIO
Crie os seguintes atributos:
nome
matricula
rg
cpf

Crie uma classe de test pr preencher e imprimir os dados desse professor
*/

public class Professor {

    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    //criando uma variavel de referencia local
    public void imprime() {
        System.out.println("-------------------------");
        System.out.println(this.cpf);
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.rg);

    }
}
