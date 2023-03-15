package FizzBuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateAdvancedTest {

    @Test
    @DisplayName("Test Advanced Fizz 03")
    void testFizz3() {
        int number = 3;
        String excepted = "Fizz";
        String result = FizzBuzzTranslateAdvanced.FizzBuzz(number);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("Test Advanced Fizz 09")
    void testFizz9() {
        int number = 9;
        String excepted = "Fizz";
        String result = FizzBuzzTranslateAdvanced.FizzBuzz(number);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("Test Advanced Buzz 05")
    void testBuzz5() {
        int number = 5;
        String excepted = "Buzz";
        String result = FizzBuzzTranslateAdvanced.FizzBuzz(number);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("Test Advanced Buzz 10")
    void testBuzz10() {
        int number = 10;
        String excepted = "Buzz";
        String result = FizzBuzzTranslateAdvanced.FizzBuzz(number);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("Test Advanced FizzBuzz 15")
    void testFizzBuzz15() {
        int number = 15;
        String excepted = "FizzBuzz";
        String result = FizzBuzzTranslateAdvanced.FizzBuzz(number);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("Test Advanced FizzBuzz 30")
    void testFizzBuzz30() {
        int number = 30;
        String excepted = "FizzBuzz";
        String result = FizzBuzzTranslateAdvanced.FizzBuzz(number);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("Test Advanced Number 19")
    void testFizzBuzz19() {
        int number = 19;
        String excepted = "" + number;
        String result = FizzBuzzTranslateAdvanced.FizzBuzz(number);
        assertEquals(excepted, result);
    }

    @Test
    @DisplayName("Test Advanced Number 17")
    void testFizzBuzz17() {
        int number = 17;
        String excepted = "" + number;
        String result = FizzBuzzTranslateAdvanced.FizzBuzz(number);
        assertEquals(excepted, result);
    }
    @Test
    @DisplayName("Test Advanced Number 35")
    void testFizzBuzz35() {
        int number = 35;
        String excepted = "FizzBuzz";
        String result = FizzBuzzTranslateAdvanced.FizzBuzz(number);
        assertEquals(excepted, result);
    }
}