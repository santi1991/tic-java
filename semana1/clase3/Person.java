package semana1.clase3;

public class Person {
    // private int cc = 123; // solo se puede acceder y usar dentro de esta clase
    // public String fullname = "Juan";
    // public int age = 27; // por defecto lleva public, no es necesatio escribirlo,
    // todo lo que sea publico se puede modificar

    private String fullname;
    private int age;
    private int identification;

    // constructor
    Person(String fullname, int bornYear) {
        calculateAgeFromYear(bornYear);
        setFullname(fullname);
        // this.fullname = fullname;
        // this.age = age;
    }

    // void me indica que no retorna nada, simplemente ejecuta el codigo

    public void walk() {
        System.out.println("estoy caminando");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 150) {
            System.out.println("la edad no puede ser mayor a 150 años");
        }
        else {
            this.age = age;
        }        
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }
    
    public int getIdentification() {
        return this.identification;
    }
    
    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    private void calculateAgeFromYear(int bornYear) {
        this.age = 2021 - bornYear;
    }

}
