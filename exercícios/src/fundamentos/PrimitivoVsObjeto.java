package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = new String("Texto");
		s.toUpperCase();
		
		System.out.println(s);
		
		
		//Wrappers s�o os objetos dos tipos primitivos.
		int a = 12345;
		System.out.println(a);
	}

}
