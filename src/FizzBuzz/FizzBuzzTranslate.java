package FizzBuzz;

public class FizzBuzzTranslate {
    public static String FizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if ((isFizz && isBuzz)) {
            return "FizzBuzz";
        } else if (isFizz) {
            return "Fizz";
        } else if (isBuzz) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}
