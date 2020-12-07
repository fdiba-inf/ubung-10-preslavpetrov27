package exercise10;

public class Ellipse extends Figure {
  
  public Ellipse(){
    super(new Point(0, 0), 1, 1);
  }


  public Ellipse(Point startPoint, int a, int b){
    super(new Point(startPoint), a, b);
  }

  public Ellipse(Ellipse otherEllipse){
    super(new Point(otherEllipse.startPoint), otherEllipse.side1, otherEllipse.side2);
  }

    
    @Override
    public double calculatePerimeter() {
        return Math.PI * (3.0 * (side1 + side2) - Math.sqrt((3.0 * side1 + side2) * (side1 + 3.0 * side2)));
    }
    @Override
    public double calculateArea() {
        return Math.PI * side1 * side2;
    }
    @Override
    public String getType() {
        return (side1 == side2) ? "Circle" : "Ellipse";
    }

    @Override
    public boolean equal(Figure otherFigure) {
      if (otherFigure instanceof Ellipse){
        return super.equal(otherFigure);
      }else{
        return false;
      }

        
    }
    @Override
    public boolean containsClick(Point click) {
      double check1 = Math.pow((click.x - startPoint.x + side1), 2)/ Math.pow(side1, 2);
      double check2 =  Math.pow((click.y - startPoint.y + side2), 2)/ Math.pow(side2, 2);
      double check = check1 + check2;
      boolean condition = check <= 1;
      return condition;
    }
}
