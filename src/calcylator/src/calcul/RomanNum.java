package calcylator.src.calcul;

import java.util.InputMismatchException;

class RomanNum {
    public static final String[] ROMAN_NUMBERS =
        new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII",
            "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV",
            "XXXVI",
            "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII",
            "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    public static int romanToNumber(String roman) {
        for (int i = 0; i < ROMAN_NUMBERS.length; i++) {
            if (roman.equalsIgnoreCase(ROMAN_NUMBERS[i])) {
                return i + 1;
            }
        }
        throw new InputMismatchException("Неверный формат данных");
    }

    public static String getRomanResult(String number) {
        try{
           return ROMAN_NUMBERS[Integer.parseInt(number) - 1];
        }catch (ArrayIndexOutOfBoundsException e){
            throw new IllegalArgumentException("Результатом работы калькулятора с римскими числами не могут быть отрицательные значения и ноль");
        }

    }
}
