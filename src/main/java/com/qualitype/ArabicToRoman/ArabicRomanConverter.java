package com.qualitype.ArabicToRoman;

import java.util.List;

/**
 *
 * @author niels
 *
 */
public final class ArabicRomanConverter {

	private ArabicRomanConverter() {
		throw new UnsupportedOperationException();
	}

	public static String arabicToRoman(int arabicFigure) {
		int i = 0;
		final List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

		if (arabicFigure <= 0 || arabicFigure > 4000) {
			throw new IllegalArgumentException(arabicFigure + " is not in range (0,4000]");
		}

		final StringBuilder stringBuilder = new StringBuilder();

		while (arabicFigure > 0 && i < romanNumerals.size()) {
			final RomanNumeral currentSymbol = romanNumerals.get(i);
			if (currentSymbol.getValue() <= arabicFigure) {
				stringBuilder.append(currentSymbol.name());
				arabicFigure -= currentSymbol.getValue();
			} else {
				i++;
			}
		}

		return stringBuilder.toString();
	}

	public static int romanToArabic(String input) {
		String romanNumeral = input.toUpperCase();
		int result = 0;

		final List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

		int i = 0;

		while (romanNumeral.length() > 0 && i < romanNumerals.size()) {
			final RomanNumeral symbol = romanNumerals.get(i);
			if (romanNumeral.startsWith(symbol.name())) {
				result += symbol.getValue();
				romanNumeral = romanNumeral.substring(symbol.name().length());
			} else {
				i++;
			}
		}

		if (romanNumeral.length() > 0) {
			throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
		}

		return result;
	}
}
