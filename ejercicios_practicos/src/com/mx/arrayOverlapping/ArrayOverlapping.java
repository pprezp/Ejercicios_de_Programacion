package com.mx.arrayOverlapping;

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
        int[][] originData = { { -11, 4 }, { Integer.MIN_VALUE, 5 }, { 2, Integer.MAX_VALUE }, { 10, 15 }, { 7, 11 } };

        System.out.println( "Array Origen: " + Arrays.deepToString( originData ) );
        System.out.print( "Array Resultado: " + Arrays.deepToString( getOverlapArray( originData ) ) );
    }
}
