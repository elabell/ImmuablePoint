
import org.junit.Test;


import static org.junit.Assert.*;

public class RectangleTest {

    public static final double DELTA = 1e-6;

    @Test
    public void contains() {
        Rectangle rectangle = new Rectangle(new Point(0,0), 5,4);
        Point p = new Point(3,2);
        assertTrue(rectangle.contains(p));
        Point p2 = new Point(6,5);
        assertFalse(rectangle.contains(p2));
    }

    @Test
    public void area() {
        Rectangle rectangle = new Rectangle(new Point(0,0), 5,4);
        assertEquals(rectangle.area(), 20, DELTA);
    }
}