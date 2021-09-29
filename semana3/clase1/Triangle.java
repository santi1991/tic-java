package semana3.clase1;

public class Triangle implements Polygon {
    
    private double area;
    private double perimeter;

    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }
    
    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        
    }
}
