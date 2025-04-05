package com.mx.ejercicio6;

public class SwapVariables {
    public static void main(String[] args) {
        int x = 10;
        int y = 1;
        System.out.println("Valor de x antes " + x);
        System.out.println("Valor de y antes " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Valor de x despues " + x);
        System.out.println("Valor de y despues " + y);
    }
}
