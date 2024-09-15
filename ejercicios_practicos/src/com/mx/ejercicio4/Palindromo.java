package com.mx.ejercicio4;

import java.util.Arrays;
import java.util.Scanner;
import java.text.Normalizer;
import java.util.stream.Collectors;

public class Palindromo {

    public static void palindrome(String words){

        String frase = Normalizer.normalize( words, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "")
                .replaceAll(" ", "")
                .toLowerCase();

        char[] wordArrays = frase.toCharArray();
        Character[]a = new Character[wordArrays.length];
        int count = 0;
        for (int i = wordArrays.length; i > 0; i--){ a[count++] = wordArrays[i-1]; }

        String reverseWords = Arrays.stream(a).map(Object::toString).collect(Collectors.joining(""));

        System.out.println( reverseWords.equals(frase) ? "Si es Palindromo" : "No es palindromo" );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        System.out.println("Escribe una frase: ");
        frase = scanner.nextLine();

        palindrome(frase);
    }
}
