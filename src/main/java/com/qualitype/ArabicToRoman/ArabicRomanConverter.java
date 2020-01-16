package com.qualitype.ArabicToRoman;

import java.util.List;

/**
 * This class can be used to convert roman figures to arabic figures and back
 * Note: Figures below 0 and above 3999 can't be converted from arabic to roman
 *
 * @author Niels Wiesner
 *
 */
public final class ArabicRomanConverter {

	private ArabicRomanConverter() {
		throw new UnsupportedOperationException();
	}

	final private static List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

	public static String arabicToRoman(int arabicFigure) {
		if (arabicFigure <= 0 || arabicFigure > 4000) {
			throw new IllegalArgumentException(arabicFigure + " is not in range (0,4000]");
		}

		int i = 0;
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

	public static int romanToArabic(String romanFigure) {

		String romanNumeral = romanFigure.toUpperCase();
		int i = 0;
		int result = 0;

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
			throw new IllegalArgumentException(romanFigure + " cannot be converted to a Roman Numeral");
		}

		return result;
	}
}
