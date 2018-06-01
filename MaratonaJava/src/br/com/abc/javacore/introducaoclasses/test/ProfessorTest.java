package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor prof = new Professor();

        prof.nome = "Tico";
        prof.matricula = "1029";
        prof.rg = "49214010-8";
        prof.cpf = "12345678907";

        Professor prof2 = new Professor();

        prof2.nome = "Jurandir";
        prof2.matricula = "1121";
        prof2.rg = "44885566-8";
        prof2.cpf = "98765432108";

        //prof passa a referenciar prof2
        //prof = prof2;

        System.out.println(prof.nome);
        System.out.println(prof.matricula);
        System.out.println(prof.rg);
        System.out.println(prof.cpf);

        System.out.println("-----------------------------");

        System.out.println(prof2.nome);
        System.out.println(prof2.matricula);
        System.out.println(prof2.rg);
        System.out.println(prof2.cpf);
    }
}
