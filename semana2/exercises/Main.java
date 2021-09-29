package semana2.exercises;
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        // __________________________
        //  *** EJERCICIO 1: ***
        // __________________________

        // int number = Integer.parseInt(scanner.nextLine());
        // int number = scanner.nextInt();
        // Ciclo ciclo = new Ciclo(18);
        // ciclo.calcFactorial();

        // __________________________
        //  *** EJERCICIO 2: *** -> calc sum of positive even numbers
        // __________________________

        // CalcVector sumPares = new CalcVector();

        // // Se declara y crea el array
        // int[] vectorEntrada = new int[11];
        // // Se asignan valores a (inicializan) los elementos del array
        // vectorEntrada[0] = 0;
        // vectorEntrada[1] = 2;
        // vectorEntrada[2] = 1;
        // vectorEntrada[3] = 65;
        // vectorEntrada[4] = 66;
        // vectorEntrada[5] = 78;
        // vectorEntrada[6] = 12;
        // vectorEntrada[7] = 11;
        // vectorEntrada[8] = 90;
        // vectorEntrada[9] = 13;
        // vectorEntrada[10] = -8;
        // // result must be 248

        // int result = sumPares.calcSumPares(vectorEntrada);
        // System.out.println("suma: " + result);

        // __________________________
        //  *** EJERCICIO 3: ***  -> calc mean value
        // __________________________
        
        // int[] vectorEntrada = new int[10];
        // vectorEntrada[0] = 0;
        // vectorEntrada[1] = 2;
        // vectorEntrada[2] = 1;
        // vectorEntrada[3] = 65;
        // vectorEntrada[4] = 66;
        // vectorEntrada[5] = 78;
        // vectorEntrada[6] = 12;
        // vectorEntrada[7] = 11;
        // vectorEntrada[8] = 90;
        // vectorEntrada[9] = 13;

        // CalcVector meanValue = new CalcVector();

        // double meanResult = meanValue.calcMeanValue(vectorEntrada);
        // // // result must be 33.8
        // System.out.println("promedio: " + meanResult);  
        
        // __________________________
        //  *** EJERCICIO 4: *** -> reorder vector
        // __________________________

        // int[] vectorEntrada = new int[10];
        // vectorEntrada[0] = 0;
        // vectorEntrada[1] = 2;
        // vectorEntrada[2] = 1;
        // vectorEntrada[3] = 65;
        // vectorEntrada[4] = 66;
        // vectorEntrada[5] = 78;
        // vectorEntrada[6] = 12;
        // vectorEntrada[7] = 11;
        // vectorEntrada[8] = 90;
        // vectorEntrada[9] = 13;
        // CalcVector orderedArray = new CalcVector();
        // int[] resultArray = orderedArray.orderArray(vectorEntrada);

        // for (int k = 0; k < resultArray.length; k++) {
        //     System.out.println(resultArray[k]);
        // }

        // __________________________
        //  *** EJERCICIO 5: *** -> sum 2 vector
        // __________________________
        
        // int[] v1 = new int[10];
        // v1[0] = 0;
        // v1[1] = 2;
        // v1[2] = 1;
        // v1[3] = 65;
        // v1[4] = 66;
        // v1[5] = 78;
        // v1[6] = 12;
        // v1[7] = 11;
        // v1[8] = 90;
        // v1[9] = 13;

        // int[] v2 = new int[10];
        // v2[0] = 0;
        // v2[1] = -2;
        // v2[2] = 1;
        // v2[3] = 9;
        // v2[4] = 4;
        // v2[5] = 78;
        // v2[6] = 12;
        // v2[7] = 11;
        // v2[8] = 90;
        // v2[9] = 13;

        // CalcVector sumaVectores = new CalcVector();
        // int[] resultArray = sumaVectores.sumarVectores(v1, v2);

        // for (int k = 0; k < resultArray.length; k++) {
        //     System.out.println(resultArray[k]);
        // }


        // __________________________
        //  *** EJERCICIO 6: *** -> 
        // __________________________

        CalcVector concatenateVector = new CalcVector();

        char [] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'};
        concatenateVector.joinStrings(vector);


    }
}
