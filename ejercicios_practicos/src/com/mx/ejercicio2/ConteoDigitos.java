package com.mx.ejercicio2;

import java.util.Arrays;

public class ConteoDigitos {

    public static int counterResult( int [] origin, int search ){
        char ch = (char) (search + '0');
        return  (int)Arrays.stream( origin )
                .mapToObj(Integer::toString)
                .flatMapToInt(String::chars)
                .filter( c-> c==ch)
                .count();
    }

    public static void main(String[] args) {
        int [] dataOrigen = { 199, 548, 684165, 5868, 12211 };
        int [] digitosBuscar = { 1, 6, 8 };
        int [][] result = new int[digitosBuscar.length][];
        int count = 0;

        for ( int digito : digitosBuscar){
            result[ count++ ] = new int[]{ digito, counterResult(dataOrigen, digito) };
        }

        System.out.println( "Data Origen: " + Arrays.toString( dataOrigen ) );
        System.out.println( "Datos a buscar: " + Arrays.toString( digitosBuscar ) );
        System.out.print( "Resultado: " + Arrays.deepToString( result ) );
    }
}
