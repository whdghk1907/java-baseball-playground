import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BallExceptionTest {

    @Test
    @DisplayName("Balls Validate Location")
    public void validateLocation() {
        List<Integer> locationOver = Arrays.asList(1,2,3,4);

        Assertions.assertThrows(RuntimeException.class, () -> {

            Balls balls = new Balls(locationOver);

        }, "You Can't Enter More than Four Number");
    }

    @Test
    @DisplayName("Balls Number Validation")
    public void validateNumber() {
        List<Integer> numberOver = Arrays.asList(12,3,4);

        Assertions.assertThrows(RuntimeException.class, () -> {
            Balls balls = new Balls(numberOver);
        }, "You Can't Enter a Number Greater Yhan 10.");
    }
}
