

public final class Circle implements Shape {
    private int radius;
    private Point centerPoint;

    public Circle(Point p, int radius) {
        this.radius = radius;
        this.centerPoint = p;
    }

    @Override
    public Boolean contains(Point p) {
        return this.centerPoint.distance(p) <= (double)this.radius ? true : false;
    }



    public double area() {
        return 3.141592653589793D * Math.pow((double)this.radius, 2.0D);
    }

    public double perimeter() {
        return 3.141592653589793D * (double)this.radius * 2.0D;
    }


    @Override
    public int hashCode() {
        //return super.hashCode();
        final int prime = 41;
        int result = 1;
        result = prime * result + ((centerPoint == null) ? 0 : centerPoint.hashCode());
        result = prime * result + radius;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        // return super.equals(obj);
        if (obj == null) return false;
        if (!(obj instanceof Circle)) return false;
        Circle otherCircle= (Circle) obj;

        boolean result1 =  this.radius == otherCircle.radius ;
        boolean result2 =  this.centerPoint.equals(otherCircle.centerPoint);

        return  (result1 && result2);

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", centerPoint=" + centerPoint.toString() +
                '}';
    }
}
