package com.mx.ejercicio3;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class BusquedaNoRepetidos {

    public static int[] searchUniques( int [] origen){
        Arrays.sort( origen );

        return Arrays.stream( origen ) //Se genera un stream del arreglo origen
                .boxed() //Los elementos se guardan como enteros
                /*Se crea un Map agrupando los elementos del stream en pares valor < numero, vecesQueSeRepite>*/
                .collect( Collectors.groupingBy( e -> e, Collectors.counting() ) )
                /*Se genera una coleccion de los elementos del Map*/
                .entrySet()
                /*Se genera un stream de la coleccion generada*/
                .stream()
                /*Se filtran los datos obteniendo los elementos cuyo conteno es igual a 1*/
                .filter( entry -> entry.getValue() == 1)
                /*Se genera un objeto con las llaves del map ya filtrado */
                .map(Map.Entry::getKey)
                /*Se convierte en entero primitivo el valor de los objetos*/
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();//Se convierte el stream en un arreglo

    }

    public static void main(String[] args) {
        int [] dataOrigen = { 1, 3, 456, 234, 867,1, 342, 342, 3 };
        System.out.println( "Arreglo origen: " + Arrays.toString( dataOrigen ) );
        System.out.println( "Números sin repetir en el arreglo: " + Arrays.toString( searchUniques(dataOrigen) ) );
    }
}
