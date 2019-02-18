
import org.junit.*;


import static org.junit.Assert.*;

public class PointTest {

    public static final double DELTA = 1e-6;

    @Test
    public void distance() {
        Point p1 = new Point(0,0);

        assertEquals(3.0, p1.distance(new Point(3,0)), DELTA);
        assertEquals(3.0, p1.distance(new Point(0,3)), DELTA);
        assertEquals(Math.sqrt(2), p1.distance(new Point(1,1)), DELTA);
    }

    @Test
    public void move() {
        Point p1 = new Point(2,6);
        Point p2 = p1.move(2,3);
        assertNotSame(p1, p2);
        assertEquals(2, p1.getX());
   }

}