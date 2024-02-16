package calcylator.src.calcul;

public class Calculated {
    
    public static String operCalc(String operation, int numberFirst, int numberSecond) {
        int result = 0;
        if (operation.equals("+")) {
            result = numberFirst + numberSecond;
        } else if (operation.equals("-")) {
            result = numberFirst - numberSecond;
        } else if (operation.equals("*")) {
            result = numberFirst * numberSecond;
        } else if (operation.equals("/")) {
            result = numberFirst / numberSecond;
        } else {
            throw new IllegalArgumentException("Такой операции не существует");
        }
        return String.valueOf(result);
    }
}
