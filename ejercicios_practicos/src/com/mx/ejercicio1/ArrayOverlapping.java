package com.mx.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOverlapping {

    public static int[][] getOverlapArray( int[][]originData ){
        Arrays.sort(originData, ( a, b )->Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] actualPosition = originData[0];

        result.add(actualPosition);

        for (int[]data : originData ){
            int finalActual = actualPosition[1];

            if ( finalActual > data[0]){
                actualPosition[1] = Math.max( finalActual, data[1] );
            }else {
                actualPosition = data;
                result.add(actualPosition);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] originData = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        System.out.println( "Array Origen: " + Arrays.deepToString( originData ) );
        System.out.print( "Array Resultado: " + Arrays.deepToString( getOverlapArray( originData ) ) );
    }
}
