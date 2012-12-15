import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		assertEquals("II", number.toRoman(1));
		//assertEquals("II", number.toRoman(2));
	}
	

}
