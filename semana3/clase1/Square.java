package semana3.clase1;

public class Square implements Polygon {
    private double area;
    private double perimeter;

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }
        
    @Override
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        
    }
    
}
