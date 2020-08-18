package fundamentos;

public class TipoStringDois {

	public static void main(String[] args) {
		
		
		var nome = "Guilherme";
		var sobrenome = "Cardoso";
		var idade = 29;
		var salario = 3000;
		
		
		//Uma forma melhor de concatenar sem concatenar :D//
		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%d reais.", nome, sobrenome, idade, salario);
		
		//Uma forma de usar a String chamando por sitaxe ou frase String.format//
		
		String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%d reais.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		
	 
		
	}
	
}
