package com.mx.ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciRecursivo {

    public static int getFibonacci(int n) {
        if ( n == 1 || n == 0){
            return n;
        }else{
            return getFibonacci( n - 1) + getFibonacci( n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el numero fibonacci que deseas obtener: ");
        int iteraciones = scanner.nextInt();

        if (iteraciones <= 0){
            System.out.println("No se pueden ingresar números negativos");
            System.exit(0);
        }

        int [] fibo = new int[iteraciones];
        for (int i = 0; i < iteraciones; i++) {
            fibo[i] = getFibonacci(i);
        }
        System.out.println(Arrays.toString(fibo));
    }

}
