package com.impacta.automacaoteste.model;


import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

public class Palindromo {

    private String palavraFrase;

    public Palindromo(String palavraFrase) {
        this.palavraFrase = retirarAcentuacao(palavraFrase.toLowerCase(Locale.ROOT).replaceAll("\\p{Punct}", "").replace(" ", ""));
    }

    public String getPalavraFrase() {
        return retirarAcentuacao(palavraFrase.toLowerCase(Locale.ROOT).replaceAll("\\p{Punct}", "").replace(" ", ""));
    }

    public static String retirarAcentuacao(String palavraFrase) {
        String nfdNormalizedString = Normalizer.normalize(palavraFrase, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }

    public boolean validaPalindromo(String palavraFrase){

        return palavraFrase.equals(new StringBuilder(palavraFrase).reverse().toString());

    }

}
