package com.mx.ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciIterativo {

  public static int[] getFibo(int n){
        int fibonacci = 0;
        int anterior = 0;
        int actual = 1;
        int [] fiboSerie = new int[n];

        for (int i = 1; i <= n; i++) {
            if ( i == 1){ fiboSerie[i - 1] = 0; }
            else if ( i == 2) { fiboSerie[i - 1] = 1; }
            else{
                fibonacci = anterior + actual;
                fiboSerie[i - 1] = fibonacci;
                anterior = actual;
                actual = fibonacci;
            }
        }
        return fiboSerie;
  }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de fibonacci a obtener: ");
        int fibo = scanner.nextInt();
        if (fibo <= 0){
            System.out.print("\nNo se pueden ingresar números menores o iguales a 0");
            System.exit(0);
        }
        System.out.println(Arrays.toString(getFibo(fibo)));
    }
}
