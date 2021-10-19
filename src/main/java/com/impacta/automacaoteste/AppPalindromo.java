package com.impacta.automacaoteste;

import com.impacta.automacaoteste.model.Palindromo;

import java.util.Scanner;

public class AppPalindromo {

    public static void main(String[] args) {

        System.out.println("------------------------------------------");
        System.out.println("---SISTEMA IDENTIFICADOR DE PALÍNDROMOS---");
        System.out.println("------------------------------------------");
        System.out.println("-Autor: Natalia Fernanda Milani de Moraes-");
        System.out.println("------------------------------------------");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a palavra a ser validada: ");
        String inputPalavra = scanner.next();

        Palindromo validaPalavra = new Palindromo(inputPalavra);

        if (validaPalavra.validaPalindromo(validaPalavra.getPalavraFrase())){
            System.out.println("A palavra \"" + inputPalavra + "\" é um palíndromo!");
        }else{
            System.out.println("A palavra \"" + inputPalavra + "\" NÃO é um palíndromo!");
        }

    }

}
