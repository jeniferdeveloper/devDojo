public class Arrays2 {

    public static void main(String[] args) {
        //byte, short, int, long, float, double = 0
        // char unicode '\u0000' ' '
        // boolean false
        // array reference null
        String[] nome = new String[4];
        nome[0] = "Joao";
        nome[1] = "Julia";
        nome[2] = "Jack";
        nome[3] = "Lucas";
        //length: retorna o tamanho do array
        System.out.println(nome.length);

        for(int i=0; i<nome.length; i++){
            System.out.println((i + 1) + " nome: " + nome[i]);
        }
    }
}
