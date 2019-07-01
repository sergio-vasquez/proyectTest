package duoc.tes.basicas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import duoc.basicas.Operaciones;

public class OperacionesTest {
	
	private Operaciones ope;

	@Before
	public void setUp() throws Exception {
		
		this.ope = new Operaciones();
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("TERMINAMOS PRUEBAS");
	}

//	@Test
//	public void test() {
//		
//		int resultado = this.ope.suma(10, 10);
//		assertEquals(2,resultado);
//		
//		resultado = this.ope.suma(10, 10);
//		assertEquals(20,resultado);
//		
//		resultado = this.ope.suma(10, 0);
//		assertEquals(0,resultado);
//	}
	
	
	@Test
	public void testResta() {
		int resultado = this.ope.restar(10, 10);
		assertEquals(0, resultado);
		 resultado = this.ope.restar(15, 10);
		assertEquals(0, resultado);
		 resultado = this.ope.restar(10, 50);
		assertEquals(-40, resultado);
		 resultado = this.ope.restar(10, 6);
		assertEquals(4, resultado);
	}
	
	
	
	
	
	
	
	

}
