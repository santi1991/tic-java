package semana1.clase3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        // Person persona1 = new Person("Pedro", 45);
        // System.out.println(persona1.age);
        // persona1.age = 35;
        // System.out.println(persona1.age);

        Person person1 = new Person("Juan", 1991);
        // puedo acceder de esta forma si es public, si es private debo acceder a traves de un getter
        // System.out.println(person1.age);
        // person1.walk();

        // un metodo getter es una funcion cualquiera que me retorna un atributo de la clase
        System.out.println(person1.getAge());
        
        // person1.setAge(170);
        // System.out.println(person1.getAge());

        // ARREGLOS
        int[] myArray;
        double[] myArray2;

        System.out.print("Ingrese la cantidad de datos: ");
        int numData = teclado.nextInt();

        myArray = new int[numData]; //el tamaño del arreglo debe ser entero
        myArray2 = new double[numData];
        // myArray[1] = 4;
        // System.out.print(myArray[1]);

        // for (int i = 0; i < numData; i++) {

        // }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Ingrese el dato " + i + " : ");
            // myArray[i] = i; 
            // myArray[i] = teclado.nextInt();
            myArray2[i] = teclado.nextDouble();
        }

        // forma 1: notacion para recorrer el arreglo
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray2[i]);
        }

        // forma 2: notacion para recorrer el arreglo
        for (double i: myArray2) {
            System.out.println("dato: " + i);
        }
    }
}
