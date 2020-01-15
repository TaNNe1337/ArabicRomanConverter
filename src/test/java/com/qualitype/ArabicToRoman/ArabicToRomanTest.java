package com.qualitype.ArabicToRoman;

import org.junit.Assert;
import org.junit.Test;

public class ArabicToRomanTest {

	@Test
	public void testOne_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(1), "I");
	}

	@Test
	public void testFour_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(4), "IV");
	}

	@Test
	public void testFive_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(5), "V");
	}

	@Test
	public void testNine_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(9), "IX");
	}

	@Test
	public void testFourty_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(40), "XL");
	}

	@Test
	public void testFifty_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(50), "L");
	}

	@Test
	public void testHundred_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(100), "C");
	}

	@Test
	public void testFourhundred_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(400), "CD");
	}

	@Test
	public void testFivehundred_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(500), "D");
	}

	@Test
	public void testNinehundred_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(900), "CM");
	}

	@Test
	public void testThousend_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(1000), "M");
	}

	@Test
	public void test2000_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(2000), "MM");
	}

	@Test
	public void test880_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(880), "DCCCLXXX");
	}

	@Test
	public void test8_toRoman() {
		Assert.assertEquals(ArabicRomanConverter.arabicToRoman(8), "VIII");
	}

	@Test
	public void testOne_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("I"), 1);
	}

	@Test
	public void testFour_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("IV"), 4);
	}

	@Test
	public void testFive_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("V"), 5);
	}

	@Test
	public void testNine_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("IX"), 9);
	}

	@Test
	public void testFourty_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("XL"), 40);
	}

	@Test
	public void testFifty_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("L"), 50);
	}

	@Test
	public void testHundred_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("C"), 100);
	}

	@Test
	public void testFourhundred_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("CD"), 400);
	}

	@Test
	public void testFivehundred_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("D"), 500);
	}

	@Test
	public void testNinehundred_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("CM"), 900);
	}

	@Test
	public void testThousend_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("M"), 1000);
	}

	@Test
	public void test2000_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("MM"), 2000);
	}

	@Test
	public void test880_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("DCCCLXXX"), 880);
	}

	@Test
	public void test8_toArabic() {
		Assert.assertEquals(ArabicRomanConverter.romanToArabic("VIII"), 8);
	}
}
