package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction f;

	@Before
	public void before(){
		f = new Fraction(2,3);
	}
	
	@Test
	public void testFractionIntInt() {
		assertEquals(2, f.getNumerator());
		assertEquals(3, f.getDenominator());
	}

	@Test
	public void testFraction() {
		f = new Fraction();
		assertEquals(1, f.getNumerator());
		assertEquals(1, f.getDenominator());
	}

	@Test
	public void testDecimal() {
		assertEquals((double)2/3, f.decimal(), 0.001);
	}
	
	@Test
	public void testMultiplica() {
	    Fraction resultFraction = f.multiplica(new Fraction(5,3));
		assertEquals((double)10/9, resultFraction.decimal(), 0.001);
	}
	
	@Test
	public void testResta(){
		Fraction resultFraction = f.resta(new Fraction(1,3));
		Fraction division = new Fraction(1,3);
		assertEquals(division.decimal(), resultFraction.decimal(), 0.001);
	}
	
    @Test
	public void testSuma(){
        Fraction resultado = f.suma(new Fraction(4,3));
        assertEquals((double)7/3, resultado.decimal(), 2.33);
    }
}
