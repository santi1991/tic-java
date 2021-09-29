package semana2.exercises;

public class CalcVector {

    private int sum;

    public CalcVector() {
        this.sum = 0;
    }

    // calculate the sum of the even positive numbers of an array
    public int calcSumPares(int [] vector){        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0) {
                continue;
            }
            if (vector[i] % 2 == 0) {
                this.sum += vector[i];
            }
        }                           
        return this.sum;
    }

    // calculates the mean value of the elements of a given array
     //variables has to be defined as type double in order to get decimals from the division
    public double calcMeanValue(int [] vector) {
        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }
        double promedio = sum / vector.length;                
        // System.out.println("promedio: " + promedio);
        return promedio;
    }


    // ordenar vector, primera mitad ascendente, segunda mitad descendente
    public int[] orderArray(int [] vectorEntrada) {
        int half = vectorEntrada.length / 2;
        int countA = 0;
        // ordernar primera mitad de forma ascendente
        while (countA < half) {
            for (int i = 0; i < half-1; i++) {            
                int num1 = vectorEntrada[i];
                int num2 = vectorEntrada[i+1];
                if (vectorEntrada[i+1] < vectorEntrada[i]) {                
                    vectorEntrada[i] = num2;
                    vectorEntrada[i+1] = num1;               
                }
            }
            countA += 1;
        }
        int countB = half-1;
        // ordernar segunda mitad de forma descendente
        while (countB < vectorEntrada.length) {
            for (int j = half; j < vectorEntrada.length-1; j++ ) {
                int currentValue = vectorEntrada[j];
                int nextValue = vectorEntrada[j+1];
                if (vectorEntrada[j+1] > vectorEntrada[j]) {
                    vectorEntrada[j] = nextValue;
                    vectorEntrada[j+1] = currentValue;                   
                }                
            }
            countB += 1;
        }        
        // for (int k = 0; k < vectorEntrada.length; k++) {
        //     System.out.println(vectorEntrada[k]);
        // }
        return vectorEntrada;
    }

    public int[] sumarVectores(int[] v1, int[] v2) {
        int[] s = new int[v1.length];

        for (int i = 0; i < v1.length; i++) {                 
            s[i] =  v1[i] + v2[i];         
        }
        // for (int p = 0; p < s.length; p++) {
        //     System.out.println(s[p]);
        // }
        return s;
    }

    public String joinStrings(char [] vector){
        String vectorConcatenado = "";
        
        for (int i = 0; i < vector.length; i++) {
            String letter = String.valueOf(vector[i]);
            if (letter.equals(" ")) {
                vectorConcatenado = vectorConcatenado + " ";
            } else {
                vectorConcatenado = vectorConcatenado + letter;
            }
        }
        
        System.out.println(vectorConcatenado);                         
        return vectorConcatenado;
    }
}

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

// int s = 0;
// for (int i = 0; i < vectorEntrada.length; i++) {
//     if (vectorEntrada[i] < 0) {
//         continue;
//     }
//     if (vectorEntrada[i] % 2 == 0) {
//         // System.out.println("El número es par");
//         s += vectorEntrada[i];
//     }
//     // System.out.println("valor: " + vectorEntrada[i]);
// }
// System.out.println("suma: " + s);
