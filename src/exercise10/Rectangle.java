package exercise10;

public class Rectangle extends Figure {
    public Rectangle() {
        super(new Point(0, 0), 1, 1);
    }

    public Rectangle(Point startPoint, double height, double width) {
        super(startPoint, height, width);
    }

    public Rectangle(Rectangle otherRectangle) {
        super(otherRectangle.startPoint, otherRectangle.side1, otherRectangle.side2);
    }

    @Override
    public double calculatePerimeter() {
        return side1 * 2 + side2 * 2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public String getType() {
        return (side1 == side2) ? "Square" : "Rectangle";
    }

    @Override
    public boolean equal(Figure otherFigure) {
        if (otherFigure instanceof Rectangle) {
            return super.equal(otherFigure);
        } else {
            return false;
        }
    }

   
    public boolean containsClick(Point click){
      boolean check1 = click.x >= startPoint.x;
      boolean check2 = click.x <= (startPoint.x + side1);
      boolean check3 = click.y >= startPoint.y;
      boolean check4 =  click.y <= (startPoint.y + side2);
     
      
        return check1 && check2 && check3 && check4;
      }

  
}
