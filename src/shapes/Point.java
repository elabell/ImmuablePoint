
public final class Point {

  private final int X ;
  private final int Y ;


public Point (int x, int y){

  this.X = x;
  this.Y = y;

}


  public int getX() {
    return X;
  }
  public int getY() {
    return Y;
  }

public double distance(Point p){

  Point point1 = this;
  Point point2 = p ;

  Integer distX = 0;
  Integer distY = 0;

  double dist =0.0;


  int X1= getX();
  int Y1= getY();


  int X2 = p.X;
  int Y2 = p.Y;


  distX = X2-X1;
  distY = Y2-Y1;


  dist = Math.sqrt(Math.pow(distX,2) + Math.pow(distY,2));


  return dist;
}


public Point move(int dx, int dy){

  int newX = (getX() +dx);
  int newY = (getY() +dy);


return new Point(newX,newY);


}

  @Override
  public int hashCode() {
   // return super.hashCode();
   //return Objects.hash(this.X,this.Y);

    int result = 1;
   //result = 41 * result + ( this.hashCode());
    result = 41 * result + this.getX();
    result = 41 * result + this.getY();

    return result;

}

 @Override
  public boolean equals(Object obj) {

    if (obj==null) return false;
    if (!(obj instanceof Point)) return false;

    Point otherPoint= (Point) obj;

    boolean result1 =  getX()== otherPoint.X ;
    boolean result2 =  getY()== otherPoint.Y;

    return  (result1 && result2);
    //return super.equals(obj);


  }

  @Override
  public String toString() {
    //return super.toString();
      return  "My Point [x:" + getX() + ", y:" + getY() + "]";

  }
}
