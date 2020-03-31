import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    @Test
    @DisplayName("Test display Fizz")
    void getFizzTest() {
        int number = 6;
        String expected = FIZZ;
        String actual = FizzBuzz.getFizzBuzz(number);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test display Buzz")
    void getBuzzTest() {
        int number = 10;
        String expected = BUZZ;
        String actual = FizzBuzz.getFizzBuzz(number);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test display FizzBuzz")
    void getFizzBuzzTest() {
        int number = 15;
        String expected = FIZZ_BUZZ;
        String actual = FizzBuzz.getFizzBuzz(number);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test display String Number bellow 10")
    void getStringOfNumberBellow10() {
        int number = 8;
        String expected = "tam";
        String actual = FizzBuzz.getFizzBuzz(number);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test display String Number bellow 20")
    void getStringOfNumberBellow20() {
        int number = 16;
        String expected = "muoi sau";
        String actual = FizzBuzz.getFizzBuzz(number);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test All Over 19")
    void getStringOfNumber20Up1() {
        int number = 61;
        String expected = "sau muoi mot";
        String actual = FizzBuzz.getFizzBuzz(number);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test All Over 19")
    void getStringOfNumber20Up2() {
        int number = 97;
        String expected = "chin muoi bay";
        String actual = FizzBuzz.getFizzBuzz(number);

        assertEquals(expected,actual);
    }
}