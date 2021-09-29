package semana2.clase1;

public class Person {
    private String fullname;
    private int age;
    private int identification;
    private int year;

    // constructor
    Person(String fullname, int year) {
        calculateAgeFromYear(year);
        setFullname(fullname);
        // this.fullname = fullname;
        // this.age = age;
    }

    // void me indica que no retorna nada, simplemente ejecuta el codigo

    public void walk() {
        System.out.println("estoy caminando");
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 150) {
            System.out.println("la edad no puede ser mayor a 150 años");
            this.age = 0;
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

    private void calculateAgeFromYear(int year) {
        setYear(year);
        setAge(2021-year);
        // this.age = 2021 - bornYear;
    }
}
