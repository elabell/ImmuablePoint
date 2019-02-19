


public final class Rectangle implements Shape {

  private final Point pointOfRect;
  private final int width, height;

  public Rectangle(Point pointOfRect, int width, int height) {
    this.pointOfRect = pointOfRect;
    this.width = width;
    this.height = height;
  }



  @Override
  public Boolean contains(Point p) {

    return
            p.getX()>= this.pointOfRect.getX()
         && p.getY()<= this.pointOfRect.getY()
         && p.getX()<= this.pointOfRect.getX() + this.width
         && p.getY()>= this.pointOfRect.getY() - this.height;



  }



  @Override
  public double area() {
    return (double)(this.width * this.height);
  }

  @Override
  public double perimeter() {
    return  (double)(this.width * 2 + this.height * 2);
  }

  @Override
  public int hashCode() {
   // return super.hashCode();
    int result = 1;
    //result = 41 * result + ( this.hashCode());
    result = 41 * result + this.height;
    result = 41 * result + this.width;
    result = 41 * result + (this.pointOfRect == null ? 0 : this.pointOfRect.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    //return super.equals(obj);
    if (obj == null) return false;
    if (!(obj instanceof Rectangle)) return false;
    Rectangle otherRect= (Rectangle) obj;

    boolean result1 =  this.width== otherRect.width ;
    boolean result2 =  this.height== otherRect.height;
    boolean result3 =  this.pointOfRect.equals(otherRect.pointOfRect);

    return  (result1 && result2 && result3);
  }

  @Override
  public String toString() {
    return  "My  Rectangle [width:" + this.width + ", height:" + this.height +", point:"+ this.pointOfRect.toString()+ "]";
  }
}

