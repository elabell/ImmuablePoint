
import org.junit.Test;


import static org.junit.Assert.*;

public class SquareTest {

    public static final double DELTA = 1e-6;

    @Test
    public void contains() {
        Square square = new Square(new Point(0,0), 8);
        Point p = new Point(0,1);
        assertTrue(square.contains(p));
        Point p2 = new Point(-9,2);
        assertFalse(square.contains(p2));
        Point p3 = new Point(8,0);
        assertTrue(square.contains(p3));
    }

    @Test
    public void area() {
        Square square = new Square(new Point(0,0), 2);
        assertEquals(square.area(), Math.PI*4, DELTA);
       // assertEquals(square.area(), 4, DELTA);
    }
}