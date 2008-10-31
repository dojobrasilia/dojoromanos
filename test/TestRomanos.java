import org.junit.Test;

import static junit.framework.Assert.*;

public class TestRomanos {
	
	@Test
	public void deveriaInterpretarO1comoI() throws Exception {
		String resultado = Romanos.parse(1);
		assertEquals("I", resultado);
	}
	
	@Test
	public void deveriaInterpretarO2comoII() throws Exception {
		String resultado = Romanos.parse(2);
		assertEquals("II", resultado);
	}
	
	@Test
	public void deveriaInterpretarO3comoIII() throws Exception {
		String resultado = Romanos.parse(3);
		assertEquals("III", resultado);
	}
	
	@Test
	public void deveriaInterpretarO4comoIV() throws Exception {
		String resultado = Romanos.parse(4);
		assertEquals("IV", resultado);
	}
	
	@Test
	public void deveriaInterpretarO4comoIV() throws Exception {
		String resultado = Romanos.parse(4);
		assertEquals("IV", resultado);
	}
	
}
