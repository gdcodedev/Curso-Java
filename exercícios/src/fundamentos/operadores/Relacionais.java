package fundamentos.operadores;

public class Relacionais {

    /*
    Operadores relacionais e Operadores lógicos.
     */

    public static void main(String[] args) {

        System.out.println(3 > 4);
        System.out.println(3 <= 4);
        System.out.println(3 > 5);
        System.out.println(30 <= 4);

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >=7; // Operador relacional
        boolean temDesconto = bomComportamento && passouPorMedia; // Operador lógico

        System.out.println("Tem desconto? " + temDesconto);


    }
}
