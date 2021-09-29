package semana1.clase2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // String x = "Hello World";
        // System.out.println(x);
        // int num1 = 5, num2 = 5;
        // int num2 = 5;
        // int total = num1 + num2;  
        Scanner scanner = new Scanner(System.in);
        
        int number1 = 0;
        System.out.print("ingrese el numero:");
        number1 = scanner.nextInt(); // permite al usuario ingresar un numero entero        
        if ( number1 > 2) {
            System.out.println("Es mayor");
        } 
        else {
            System.out.println("Es menor");
        }     
        scanner.close();
        
    }
}


// println -> pasa a la siguiente linea en la consola
// print sin ln -> muestra todos los print en una misma linea