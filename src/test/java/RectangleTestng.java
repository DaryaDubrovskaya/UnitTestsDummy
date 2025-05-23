import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTestng {

    Rectangle rectangle = new Rectangle(15.9, 4.7);

    @Test
    public void lengthTest() {
        assertEquals(rectangle.getLength(), 15.9, "The length is not correct!");
    }

    @Test
    public void widthTest() {
        assertEquals(rectangle.getWidth(), 4.7, "The width is not correct!");
    }

    @Test
    public void setLengthTest() {
        rectangle.setLength(10.56);
        assertEquals(rectangle.getLength(), 10.56, "Method setLength doesn't work correct!");
    }

    @Test
    public void setWidthTest() {
        rectangle.setWidth(8.72);
        assertEquals(rectangle.getWidth(), 8.72, "Method setWidth doesn't work correct!");
    }

    @Test
    public void areaTest() {
        assertEquals(rectangle.getArea(), 74.73, "The area is not correct!");
    }
}
