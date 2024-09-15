package com.mx.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOverlapping {

    public static int[][] getOverlapArray( int[][]originData ){
        /*Se ordena el arreglo comparando el primer elemento de cada arreglo individual*/
        Arrays.sort(originData, ( a, b )->Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();

        /*El primer elemento del arreglo se guarda en un arreglo temporal*/
        int[] actualPosition = originData[0];
        /*El elemento temporal, se guarda en la primer posición de la lista que se retornará*/
        result.add(actualPosition);
        /*Se itera cada arreglo del arreglo principal*/
        for (int[]data : originData ){
            int finalActual = actualPosition[1];
            /*Se compara el último elemento del arreglo temporal con el inicio del arreglo actual
            * Si es mayor, se actualiza el ultimo elemento del arreglo temporal con el mayor
            * entre el ultimo del elemento actual y el del temporal*/
            if ( finalActual > data[0]){
                actualPosition[1] = Math.max( finalActual, data[1] );
            }else {
                /*Si el ultimo elemento del arreglo temporal no es mayor al siguiente
                * se actualiza el arreglo temporal con el siguiente y se añade a la lista.
                * Siempre que cambie algun dato del arreglo temporal, afectara al elemento de la lista
                * ya que la posicion en memoria que se opera es la misma de la variable y la de
                * referencia del elemento en la lista. Al asignar un nuevo arreglo a la variable temporal
                * cambia la referencia en memoria, por lo que a la ya guardada previamente no sufre cambio.
                * */
                actualPosition = data;
                result.add(actualPosition);
            }
        }
        /*Se retorna la lista como arreglo a dos posiciones*/
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] originData = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        System.out.println( "Array Origen: " + Arrays.deepToString( originData ) );
        System.out.print( "Array Resultado: " + Arrays.deepToString( getOverlapArray( originData ) ) );
    }
}
