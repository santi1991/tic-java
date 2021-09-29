package semana2.clase1;
// import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ejercicio 1
        Exercise1 exercise1 = new Exercise1();
        exercise1.start();
        // Person person = exercise1.searchByFullname("juan");
        Person person = exercise1.searchPerson("pedro", 25);
        if (person.getFullname().equals("")) {
            System.out.println("no encontro la persona");
        }
        else {
            System.out.println("encontró a: " + person.getFullname() + " " + person.getAge());
        }
  
    }
}


