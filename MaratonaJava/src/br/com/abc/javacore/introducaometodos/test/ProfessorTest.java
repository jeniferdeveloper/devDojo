package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();

        prof.cpf = "123.146.678-99";
        prof.matricula = "2249";
        prof.nome = "Rafael";
        prof.rg = "456120-9";

        Professor prof2 = new Professor();
        prof2.cpf = "321.246.658-99";
        prof2.matricula = "2250";
        prof2.nome = "Marcos";
        prof2.rg = "2587820-9";

        prof.imprime();
        prof2.imprime();

       // prof.imprime(prof2);

    }
}
