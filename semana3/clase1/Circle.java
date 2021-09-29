package semana3.clase1;

//circle hereda polyon
public class Circle implements Polygon {
    
    private double area;
    private double perimeter;
    private float radius;
    // private final double PI = 3.1416; //declarar constante, inmediatamente asignar valor

    // constructor with the attributes needed
    Circle(float radius) {
        // this.radius = radius;
        setRadius(radius);
        calculateArea();
    }

    Circle(double area) {
        setArea(area);
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
        calculateRadius();
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }
        
    @Override
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    //notacion que verifica si efectivamente estes implementando el metodo que viene de polygon
    @Override
    public void calculateArea() {
        this.area = Global.PI*this.radius*this.radius;
    }

    
    private void calculateRadius() {
        this.radius = (float)Math.sqrt((this.area/Global.PI));
    }

    
     
}
