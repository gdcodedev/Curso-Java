package Controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

                String texto = "";

                    do{
                            System.out.println("Voc� precisa digitar as palavras m�gicas....");
                                 System.out.print("Quer sair? ");
                                    texto = entrada.nextLine();
                    } while(!texto.equalsIgnoreCase("por favor"));
                                                System.out.println("Obrigado");
    }
}
// if(..) sentenca; ou {}
// while(..) senteca; ou {}
// for(...;...;...) senteca; ou {}

// do {} while(...);
