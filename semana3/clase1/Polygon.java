package semana3.clase1;

//una clase abstracta solo puede ser heredada,
//su funcion principal obliga a que las clases hija que la hereden implemnenten los metodos abstractoas que cree
public interface Polygon {
    
    // private double area;
    // private double perimeter;

    public double getArea();

    public void setArea(double area);

    public double getPerimeter();
    
    public void setPerimeter(double perimeter);

    public void calculateArea();
    
}
