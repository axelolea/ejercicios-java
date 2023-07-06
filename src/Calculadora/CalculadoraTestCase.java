package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTestCase {


	// Test suma

	@Test
	void testSum1() {
		assertEquals(5, Calculadora.suma(3, 2));
	}
	
	@Test
	void testSum2() {
		assertEquals(65, Calculadora.suma(5, 60));
	}
	
	@Test
	void testSum3() {
		assertEquals(71, Calculadora.suma(35, 36));
	}

	@Test
	void testSum4() {
		assertEquals(-15, Calculadora.suma(30, -45));
	}
	
	// Test multiplicacion
	
	@Test
	void testMultiply1() {
		assertEquals(4, Calculadora.multiply(1, 4));
	}
	
	@Test
	void testMultiply2() {
		assertEquals(49, Calculadora.multiply(7, 7));
	}
	
	@Test
	void testMultiply3() {
		assertEquals(-180, Calculadora.multiply(-12, 15));
	}

	@Test
	void testMultiply4() {
		assertEquals(10, Calculadora.multiply(-2, -5));
	}
	
//	Test errores
	
	@Test
	void error() {
		// fail("Not yet implemented");
		assertEquals(10, Calculadora.multiply(-2, -5));
	}
	
	@Test
	void error1() {
		assertEquals(10, Calculadora.multiply(-2, -5));
	}
	
//	Test Division

	@Test
	void division1(){
 		assertEquals(3, Calculadora.dividir(6.0f, 2.0f));
	}
	
	@Test
	void division2(){
 		assertEquals(0, Calculadora.dividir(0, 1));
	}
	
	
//	@Test
//	void division3(){
//		
// 		String message = "Oh my god";
// 		ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> Calculadora.dividir(0, 0), message);
// 		assertTrue(thrown.getMessage().contains(message));
//	}

}