package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

    public static void main(String[] args) {

        double a = 1; // Conversão implicita
        System.out.println(a);

        float b = (float) 1.12345; // Conversão explícita (CAST)
        System.out.println(b);

        int c = 4;  // Conversão explícita (CAST)
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.0; // Conversão explícita (CAST)
        int f = (int) e;
        System.out.print(f);




    }
}
