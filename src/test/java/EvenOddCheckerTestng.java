import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EvenOddCheckerTestng {

    EvenOddChecker evenOddChecker = new EvenOddChecker();

    @Test
    public void checkEvenTest() {
        assertEquals(evenOddChecker.check(4), true, "Method check doesn't work correct!");
    }

    @Test
    public void checkOddTest() {
        assertEquals(evenOddChecker.check(7), false, "Method check doesn't work correct!");
    }

    @Test
    public void checkNegEvenTest() {
        assertEquals(evenOddChecker.check(-4), true, "Method check doesn't work correct!");
    }

    @Test
    public void checkNegOddTest() {
        assertEquals(evenOddChecker.check(-7), false, "Method check doesn't work correct!");
    }

    @Test
    public void checkZeroTest() {
        assertEquals(evenOddChecker.check(0), true, "Method check doesn't work correct!");
    }
}
