package semana2.clase4;

public class Main {
    public static void main(String[] args) {
        
        Cat michi = new Cat();
        michi.makeSound();

        // Polimorfismo
        Animal cat = new Cat();
        Animal bird = new Bird();

        cat.type();
        bird.type();
    }
}
