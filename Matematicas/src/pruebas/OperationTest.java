package pruebas;



import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import operacion.Operacion;

class OperationTest {
	
	private Operacion op;
	
	private BigDecimal n1;
	private BigDecimal n2;
	private BigDecimal result;
	
	
	private void setupStage1() {
		op = new Operacion();
		n1 = BigDecimal.valueOf(15.7);
		n2 = BigDecimal.valueOf(22.4);
	}
	private void setupStage2() {
		op = new Operacion();
		n1 = BigDecimal.valueOf(28.5);
		n2 = BigDecimal.valueOf(19.8);
	}
	private void setupStage3() {
		op = new Operacion();
		n1 = BigDecimal.valueOf(3.5);
		n2 = BigDecimal.valueOf(14.4);
	}
	private void setupStage4() {
		op = new Operacion();
		n1 = BigDecimal.valueOf(2.4);
		n2 = BigDecimal.valueOf(3.5);
	}

	@Test
	void testAdd() {
		setupStage1();
		result = op.add(n1, n2);
		assertEquals(38.1, result);
	}
	
	@Test
	void testSubstract() {
		setupStage2();
		result = op.substract(n1, n2);
		assertEquals(8.7, result);
	}
	
	@Test
	void testDivide() {
		setupStage3();
		result = op.divide(n1, n2);
		assertEquals(0.2430, result);
	}
	
	@Test
	void testMultiply() {
		setupStage4();
		result = op.multiply(n1, n2);
		assertEquals(8.4, result);
	}

}
