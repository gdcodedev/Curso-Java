package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme o primeiro sal�rio: ");
        String valor1 = entrada.next().replace(",",".");

        System.out.println("\nInforme o segundo sal�rio: ");
        String valor2 = entrada.next().replace(",",".");

        System.out.println("\nInforme o terceiro sal�rio: ");
        String valor3 = entrada.next().replace(",",".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) /3;

        System.out.println("A m�dia dos sal�rios � " + media);

        entrada.close();


    }
}
