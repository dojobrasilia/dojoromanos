
public class Romanos {

	public static String parse(int entrada) {
		if (entrada <=3) {
			StringBuilder resultado = new StringBuilder();
			for (int i=0 ; i<entrada ; i++)
				resultado.append("I");
			return resultado.toString();
		} else {
			return "IV";
		}
	}
	
	
	
}
