public class Square implements Shape {

    private int side;
    private Point centerPoint;

    public Square(Point centerPoint, int side)
    {
        this.centerPoint = centerPoint;
        this.side = side;
    }




    @Override
    public double area() {
        return  Math.pow(side, 2);
    }

    @Override
    public double perimeter() {
        return side*4;
    }


    @Override
    public Boolean contains(Point p) {
       return     ((p.getX() >= centerPoint.getX()-(this.side/2))
                && (p.getY() >= centerPoint.getY()-(this.side/2))
                && (p.getX() <= centerPoint.getX()+(this.side/2))
                && (p.getY() <= centerPoint.getY()+(this.side/2)));

    }


    @Override
    public int hashCode() {
        //return super.hashCode();
        final int prime = 41;
        int result = 1;
        result = prime * result + ((centerPoint == null) ? 0 : centerPoint.hashCode());
        result = prime * result + side;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
       // return super.equals(obj);
        if (obj == null) return false;
        if (!(obj instanceof Square)) return false;
        Square otherSquare= (Square) obj;

        boolean result1 =  this.side== otherSquare.side ;
        boolean result2 =  this.centerPoint.equals(otherSquare.centerPoint);

        return  (result1 && result2);
    }



    @Override
    public String toString() {
       // return super.toString();
        return  "My  Square [side:" + this.side  +", center Point:"+ this.centerPoint.toString()+ "]";
    }




}
