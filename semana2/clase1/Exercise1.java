package semana2.clase1;

import java.util.Scanner;

public class Exercise1 {
    // private int numPeople;
    private Person[] people;
    private Scanner scanner;

    Exercise1() {
        scanner = new Scanner(System.in);
    }

    public void setNumPeople(int numPeople) {
        // this.numPeople = numPeople;
        this.people = new Person[numPeople];
    }

    public void setPeopleInfo() {
        // Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < people.length; i++) {
            System.out.println("______________________");
            System.out.println("Ingrese los datos de la persona " + i);
            System.out.println("Ingrese el nombre completo: ");
            String fullname = scanner.nextLine();

            System.out.println("Ingrese el año de nacimiento: ");
            // int year = scanner.nextInt();
            int year = Integer.parseInt(scanner.nextLine()); 
            // scanner.nextLine();
            Person person = new Person(fullname, year);
            this.people[i] = person;
            
        }
        // scanner.close(); 
    }

    public void showPeopleInfo() {
        for (Person person: this.people) {
            System.out.println("______________________");
            System.out.println("nombre de la persona: " + person.getFullname());
            System.out.println("edad de la persona: " + person.getAge());
        }
    }

    public Person searchByFullname(String fullname) {
        Person personFound = new Person("", 2021);
        for (Person person: this.people) {
            if (person.getFullname().equals(fullname)) {
                personFound = person;
                break;
            }            
        }
        return personFound;
    }

    //sobrecarga de metodos -> SE DIFERENCIA POR LA CANTIDAD DE ARGUMENTOS QUE RECIBE
    public Person searchPerson(String fullname) {
        Person personFound = new Person("", 2021);
        for (Person person: this.people) {
            if (person.getFullname().equals(fullname)) {
                personFound = person;
                break;
            }            
        }
        return personFound;
    }

    public Person searchPerson(String fullname, int age) {
        Person personFound = new Person("", 2021);
        for (Person person: this.people) {
            if (person.getFullname().equals(fullname) && person.getAge() == age) {
                personFound = person;
                break;
            }            
        }
        return personFound;
    }

    public Person searchPerson(String fullname, int age, int year) {
        Person personFound = new Person("", 2021);
        for (Person person: this.people) {
            if (person.getFullname().equals(fullname) && person.getAge() == age && person.getYear() == year) {
                personFound = person;
                break;
            }            
        }
        return personFound;
    }
    // ****************************************************************

    public void start() {
        // Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas: ");
        // int numPeople = scanner.nextInt();
        int numPeople = Integer.parseInt(scanner.nextLine()); 
        setNumPeople(numPeople);
        setPeopleInfo();
        showPeopleInfo();    
    }

}
