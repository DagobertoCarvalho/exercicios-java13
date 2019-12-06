package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		// String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operadors "."
		// int a = 3;
		// System.out.println(a);
	}

}
