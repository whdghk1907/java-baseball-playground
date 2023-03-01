import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    @DisplayName("문자열 변환")
    void toInt() {
        assertEquals(2, stringCalculator.toInt("2"));
    }

    @Test
    @DisplayName("계산기")
    void calculator() throws Exception {
        assertEquals(10, stringCalculator.calculate(5, 5, '+'));
        assertEquals(0, stringCalculator.calculate(5, 5, '-'));
        assertEquals(25, stringCalculator.calculate(5, 5, '*'));
        assertEquals(1, stringCalculator.calculate(5, 5, '/'));
    }

    @Test
    @DisplayName("문자열 계산기 구현")
    void calculatorString() throws Exception {
        String input = "2 + 3 * 4 / 2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(10, stringCalculator.calculateString());
    }

}
