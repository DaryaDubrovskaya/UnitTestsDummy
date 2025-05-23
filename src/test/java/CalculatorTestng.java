import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertEquals;

public class CalculatorTestng {

    Calculator calculator = new Calculator ();

    @Test
    public void addTest() {
        assertEquals(calculator.add(2, 6), 8, "Method add doesn't work correct!");
    }

    @Test
    public void subtractTest() {
        assertEquals(calculator.subtract(9, 6), 3, "Method subtract doesn't work correct!");
    }

    @Test
    public void multiplyTest() {
        assertEquals(calculator.multiply(4, 5), 20, "Method multiply doesn't work correct!");
    }

    @Test
    public void divideTest() {
        assertEquals(calculator.divide(14, 7), 2, "Method divide doesn't work correct!");
    }

    @Test
    public void divideByZeroTest() {
        assertEquals(calculator.divide(14, 0), 0, "Method divide doesn't work correct!"); // как указать в expected ошибку ?
    }
}
