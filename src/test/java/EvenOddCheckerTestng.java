import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EvenOddCheckerTestng {

    EvenOddChecker evenOddChecker = new EvenOddChecker ();

    @Test
    public void checkEvenTest() {
        assertEquals("Method check doesn't work correct!", true, evenOddChecker.check(4));
    }

    @Test
    public void checkOddTest() {
        assertEquals("Method check doesn't work correct!", false, evenOddChecker.check(7));
    }

    @Test
    public void checkNegEvenTest() {
        assertEquals("Method check doesn't work correct!", true, evenOddChecker.check(-4));
    }

    @Test
    public void checkNegOddTest() {
        assertEquals("Method check doesn't work correct!", false, evenOddChecker.check(-7));
    }

    @Test
    public void checkZeroTest() {
        assertEquals("Method check doesn't work correct!", true, evenOddChecker.check(0));
    }
}
