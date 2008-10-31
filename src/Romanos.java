public class Romanos {

	public static String parse(int entrada) {
		
		StringBuilder resultado = new StringBuilder();
		if (entrada <= 3) {
			for (int i = 0; i < entrada; i++)
				resultado.append("I");
			return resultado.toString();
		} 
		
		else if (entrada == 4) {
			return "IV";
		} else if(entrada == 5){
			return "V";
		} else if (entrada < 9){
			resultado.append("V");
			return resultado.append(parse(entrada-5)).toString();
		}else if (entrada == 9){
			return "IX";
		}else{
			return "X";
		}
	}
	

}
