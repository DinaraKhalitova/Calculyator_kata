package calcylator.src.calcul;

import java.util.Scanner;

import static calcylator.src.calcul.RomanNum.ROMAN_NUMBERS;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение, состоящее из арабских или римских чисел (соблюдайте интервал между знаками) ");
        String input = sc.nextLine();
        String result = calc(input);
        System.out.printf("Ответ: %s \n", result);
    }

    private static String calc(String input) {
        String[] sign = input.split(" ");
        int numberFirst;
        int numberSecond;
        String result;

        if (sign.length != 3) {
            throw new IllegalArgumentException("Неверный формат математической операции");
        }

        String regexArabic = "-?[1-9]\\d*|0";
        String operation = sign[1];

        if (sign[0].matches(regexArabic) && sign[2].matches(regexArabic)) {
            numberFirst = Integer.parseInt(sign[0]);
            numberSecond = Integer.parseInt(sign[2]);

            if (numberFirst < 1 || numberFirst > 10 || numberSecond < 1 || numberSecond > 10){
                throw new IllegalArgumentException("Калькулятор работает с числами от 1 до 10");
            }

            result = Calculated.operCalc(operation, numberFirst, numberSecond);

        } else if (isValidRomanNumber(sign[0]) && isValidRomanNumber(sign[2])) {
            numberFirst = RomanNum.romanToNumber(sign[0]);
            numberSecond = RomanNum.romanToNumber(sign[2]);

            if (numberFirst < 1 || numberFirst > 10 || numberSecond < 1 || numberSecond > 10) {
                throw new IllegalArgumentException("Калькулятор работает с числами от 1 до 10");
            }

            String romanResult = Calculated.operCalc(operation, numberFirst, numberSecond);

             result = RomanNum.getRomanResult(romanResult);
        } else {
            throw new IllegalArgumentException("Обе переменные должны быть либо римскими, либо арабскими");
        }

        return result;
    }

    private static boolean isValidRomanNumber(String number) {
        for (String s : ROMAN_NUMBERS) {
            if (number.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
