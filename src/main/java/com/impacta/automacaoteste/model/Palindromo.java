package com.impacta.automacaoteste.model;


import java.util.Locale;

public class Palindromo {

    private String palavraFrase;

    public Palindromo(String palavraFrase) {
        this.palavraFrase = palavraFrase.toLowerCase(Locale.ROOT).replaceAll("\\p{Punct}", "").replace(" ", "");
    }

    public String getPalavraFrase() {
        return palavraFrase.toLowerCase(Locale.ROOT).replaceAll("\\p{Punct}", "").replace(" ", "");
    }

    public boolean validaPalindromo(String palavra){

        return palavraFrase.equals(new StringBuilder(palavraFrase).reverse().toString());

    }

}
