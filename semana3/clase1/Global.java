package semana3.clase1;

public class Global {

    //static: usar variable o método sin necesidad de instanciar la clase
    static final double PI = 3.1416; // final -> no puede ser modificado
    
    //ejemplo metodo
    static double calculateAreaCircle(double radius) {
        return PI*radius*radius;
    }
}
