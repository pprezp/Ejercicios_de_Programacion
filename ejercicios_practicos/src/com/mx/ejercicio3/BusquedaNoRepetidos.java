package com.mx.ejercicio3;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class BusquedaNoRepetidos {

    public static int[] searchUniques( int [] origen){
        Arrays.sort( origen );

        Map<Integer, Long> dato = Arrays.stream( origen )
                .boxed()
                .collect( Collectors.groupingBy( e -> e, Collectors.counting() ) );

        return dato.entrySet()
                .stream()
                .filter( entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();

    }

    public static void main(String[] args) {
        int [] dataOrigen = { 1, 3, 456, 234, 867,1, 342, 342, 3 };
        System.out.println( "Arreglo origen: " + Arrays.toString( dataOrigen ) );
        System.out.println( "Números sin repetir en el arreglo: " + Arrays.toString( searchUniques(dataOrigen) ) );
    }
}
