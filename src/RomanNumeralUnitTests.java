import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat2ReturnsII() {
		assertEquals("I", number.toRoman(1));
		assertEquals("I", number.toRoman(2));
	}
	

}
