package FizzBuzz;

public class FizzBuzzTranslateAdvanced {
    public static String FizzBuzz(int number) {
        String[] numberText = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        int tenPart = number / 10;
        int uniPart = number % 10;
        String numberConvert = String.valueOf(number);
        boolean isContains3 = numberConvert.contains("3");
        boolean isContains5 = numberConvert.contains("5");
        if (tenPart == 0) {
            System.out.println(numberText[uniPart]);
        } else System.out.println(numberText[tenPart] + " " + numberText[uniPart]);
        if ((isFizz && isBuzz) || (isContains3 && isContains5)) {
            System.out.println("FizzBuzz\n" +
                    "-----------------------------");
            return "FizzBuzz";
        } else if (isFizz || isContains3) {
            System.out.println("Fizz\n" +
                    "-----------------------------");
            return "Fizz";
        } else if (isBuzz || isContains5) {
            System.out.println("Buzz\n" +
                    "-----------------------------");
            return "Buzz";
        } else {
            System.out.println(number + "\n" +
                    "-----------------------------");
            return "" + number;
        }
    }
}
