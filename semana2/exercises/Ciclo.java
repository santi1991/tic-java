package semana2.exercises;

public class Ciclo {

    private int number;

    public Ciclo(int number) {
        this.number = number;
    }

    // calculate the factorial of a number
    public void calcFactorial() {
        long factorial = 1;
        for (int i = 1; i <= this.number; i++) {
            factorial = factorial * i;
        }
        System.out.println("resultado: " + factorial); 
    }
}
