package semana5.clase2;

public class Factorial {
    
    public long calculateFactorial(int number) {
        long resultFactorial = 1;
        for (int i = 2; i <= number; i++) {
            resultFactorial  = resultFactorial * i;
        }
        return resultFactorial;
    }

    
}
