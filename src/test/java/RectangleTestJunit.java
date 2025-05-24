import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTestJunit {

    public static void main(String[] args) {
//        new RectangleTestJunit().lengthTest();
//
//        RectangleTestJunit t1 = new RectangleTestJunit();
//        t1.lengthTest();
//        t1.areaTest();

        new RectangleTestJunit();
        new RectangleTestJunit();
    }

    static {
        System.out.println("I'm static");
    }

    {
        System.out.println("I'm not static");
    }


    Rectangle rectangle = new Rectangle(15.9, 4.7);

    @Test
    public void lengthTest() {
        assertEquals("The length is not correct!", 15.9, rectangle.getLength());
    }

    @Test
    public void widthTest() {
        assertEquals("The width is not correct!", 4.7, rectangle.getWidth());
    }

    @Test
    public void setLengthTest() {
        rectangle.setLength(10.56);
        assertEquals("Method setLength doesn't work correct!", 10.56, rectangle.getLength());
    }

    @Test
    public void setWidthTest() {
        rectangle.setWidth(8.72);
        assertEquals("Method setWidth doesn't work correct!", 8.72, rectangle.getWidth());
    }

    @Test
    public void areaTest() {
        assertEquals("The area is not correct!", 74.73, rectangle.getArea());
    }
}