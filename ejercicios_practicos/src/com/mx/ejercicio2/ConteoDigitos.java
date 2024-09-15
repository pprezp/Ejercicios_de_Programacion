package com.mx.ejercicio2;

import java.util.Arrays;

public class ConteoDigitos {

    public static int counterResult( int [] origin, int search ){
        /*El digito a buscar se convierte en un caracter*/
        char ch = (char) (search + '0');

        return  (int)Arrays.stream( origin ) //Se crea un stream usando el array origen
                .mapToObj(Integer::toString) //Se crea un objeto convirtiendo los numeros en strings
                .flatMapToInt(String::chars) //Los strings se convierten en caracteres
                .filter( c-> c==ch) //Se filtran los caracteres el arreglo que coinciden con el numero que buscamos
                .count(); // Se cuentan las veces que aparecio el digito en el arreglo de caracteres
    }

    public static void main(String[] args) {
        int [] dataOrigen = { 199, 548, 684165, 5868, 12211 };
        int [] digitosBuscar = { 1, 6, 8 };
        /*Se crea un array donde se almacenaran los arrays cuyas posiciones seran ocupadas por el
        * digito a buscar y las veces que aparece en el arreglo*/
        int [][] result = new int[digitosBuscar.length][];
        int count = 0;
        /*Se itera el arreglo de los digitos que se buscara*/
        for ( int digito : digitosBuscar){
            result[ count++ ] = new int[]{ digito, counterResult(dataOrigen, digito) };
        }

        System.out.println( "Data Origen: " + Arrays.toString( dataOrigen ) );
        System.out.println( "Datos a buscar: " + Arrays.toString( digitosBuscar ) );
        System.out.print( "Resultado: " + Arrays.deepToString( result ) );
    }
}
