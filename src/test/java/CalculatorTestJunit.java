import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTestJunit {

    Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        assertEquals("Method add doesn't work correct!", 8, calculator.add(2, 6));
    }

    @Test
    public void subtractTest() {
        assertEquals("Method subtract doesn't work correct!", 3, calculator.subtract(9, 6));
    }

    @Test
    public void multiplyTest() {
        assertEquals("Method multiply doesn't work correct!", 20, calculator.multiply(4, 5));
    }

    @Test
    public void divideTest() {
        assertEquals("Method divide doesn't work correct!", 2, calculator.divide(14, 7));
    }

    @Test
    public void divideByZeroTest() {
        assertEquals("Method divide doesn't work correct!", 0, calculator.divide(14, 0)); // как указать в expected ошибку ?
    }
}
