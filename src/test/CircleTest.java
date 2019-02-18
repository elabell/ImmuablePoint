

//import org.junit.jupiter.api.Test;


import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    public static final double DELTA = 1e-6;


    @Test
    public void  testhashCode() {
        Circle circle1 = new Circle(new Point(0,1), 8);
        Circle circle2 = new Circle(new Point(0,0), 8);
        assertEquals(circle1.hashCode(),circle2.hashCode());

    }

    @Test
    public void contains() {
        Circle circle = new Circle(new Point(0,0), 8);
        Point p = new Point(0,1);
        assertTrue(circle.contains(p));
        p = new Point(0,1);

        Point p2 = new Point(-9,2);
        assertFalse(circle.contains(p2));
        Point p3 = new Point(8,0);
        assertTrue(circle.contains(p3));
    }

    @Test
    public void area() {
        Circle circle = new Circle(new Point(17,2), 2);
        assertEquals(circle.area(), Math.PI*4, DELTA);
    }
}