package Controle;

import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.print("Informe a nota : ");
        int nota = entrada.nextInt();

        switch (nota){
            case 10:
                conceito = "A";
                break;
            case 9:
                conceito = "B";
                break;
            case 8:
                conceito = "C";
                break;
            default:
                conceito = "Não encontrado!";

        }
        System.out.println("Conceito é " + conceito);
        entrada.close();
    }

}
