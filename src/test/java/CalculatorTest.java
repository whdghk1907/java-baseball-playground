import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator cal;

    @BeforeEach
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(3, cal.add(1, 2));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(1, cal.subtract(2, 1));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(4, cal.multiply(2, 2));
    }

    @Test
    public void testDivide() {
        System.out.println("Divide test");
        Assertions.assertEquals(1, cal.divide(2, 2));
    }

    @AfterEach
    public void tearDown() {
        cal = null;
    }

}
