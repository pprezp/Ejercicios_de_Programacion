# Ejercicio 1. Intervalos sobrepuestos(ArrayOverlaping)
Problema: Dada una matriz de intervalos donde intervalos[i] = [inicio, fin], fusione todos los intervalos superpuestos y devuelva una matriz de intervalos no superpuestos que cubran todos los intervalos en la entrada.  

```
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]  `
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
```