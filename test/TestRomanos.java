import org.junit.Test;

import static junit.framework.Assert.*;

public class TestRomanos {
	
	String[] numerosRomanos = {"I","II","III","IV","V","VI", 
							   "VII", "VIII", "IX", "X"};
	
	@Test
	public void deveriaInterpretarInteiroComoRomano() throws Exception {
		for(int i = 1; i <= this.numerosRomanos.length; i++){
			this.verificaRomanos(i, this.numerosRomanos[i-1]);
		}
	}
	
	public void verificaRomanos(int entrada, String saidaEsperada){
		assertEquals(saidaEsperada, Romanos.parse(entrada));
	}
	
}
