package semana1.clase1;

public class Cadenas {
    public static void main(String[] args) {

        String nombre, nombreCompleto;
        String apellido = "Pérez";
        nombre = "Pepito";
        nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
        // Imprime Pepito Pérez

        String a = "higo";
        String b = "HIGO";
        String c = "higo";
        // equals -> verifica si dos cadenas de caracteres son iguales
        // equalsIgnoreCase -> verifica si dos cadenas de caracteres son iguales, ignorando las diferencias entre mayúsculas y minúsculas 
        System.out.println(a.equals(b)); // Imprime false
        System.out.println(a.equalsIgnoreCase(b)); // Imprime true
        System.out.println(a.equals(c)); // Imprime true
    }
}
