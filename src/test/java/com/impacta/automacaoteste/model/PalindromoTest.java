package com.impacta.automacaoteste.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {

    @Test
    public void testPalavraPalindromoContendoLetrasMaiusculas(){

        //“Rotator” - ok
        //“mAlAyAlam” - ok

        //Arrange
        Palindromo objAppPalindromo = new Palindromo("mAlAyAlam");
        //Act
        boolean isPalindromo = objAppPalindromo.validaPalindromo(objAppPalindromo.getPalavraFrase());
        //Assert
        assertTrue(isPalindromo);

    }

    @Test
    public void testPalavraPalindromoComTodasLetrasMinusculas(){

        //“bob” - ok
        //“madam” - ok
        //"1" - ok

        //Arrange
        Palindromo objAppPalindromo = new Palindromo("madam");
        //Act
        boolean isPalindromo = objAppPalindromo.validaPalindromo(objAppPalindromo.getPalavraFrase());
        //Assert
        assertTrue(isPalindromo);

    }

    @Test
    public void testPalavraPalindromoComTodasLetrasMaiusculas(){

        //Arrange
        Palindromo objAppPalindromo = new Palindromo("BOB");
        //Act
        boolean isPalindromo = objAppPalindromo.validaPalindromo(objAppPalindromo.getPalavraFrase());
        //Assert
        assertTrue(isPalindromo);

    }

    @Test
    public void testFrasePalindromoContendoPontuacoesAcentuacoes(){

        //“Able was I, ere I saw Elba” - ok
        //“Step on no pets.” - ok
        //“02/02/2020” - ok
        //“Madam I'm Adam” - ok
        //“Step on no pets.” - ok
        //“Top spot!” - ok
        //"Socorram-me, subi no ônibus em Marrocos" - ok

        //Arrange
        Palindromo objAppPalindromo = new Palindromo("Socorram-me, subi no ônibus em Marrocos");
        //Act
        boolean isPalindromo = objAppPalindromo.validaPalindromo(objAppPalindromo.getPalavraFrase());

        System.out.println(objAppPalindromo.getPalavraFrase());
        //Assert
        assertTrue(isPalindromo);

    }

    //---------------------TESTE NEGATIVOS

    @Test
    public void testPalavraFraseNaoPalindromo(){

        //“xyz” - ok
        //“elephant” - ok
        //“Country” - ok
        //“Top . post!” - ok
        //“Wonderful-fool” - ok
        //“Wild imagination!” - ok

        //Arrange
        Palindromo objAppPalindromo = new Palindromo("Wild imagination!");
        //Act
        boolean isPalindromo = objAppPalindromo.validaPalindromo(objAppPalindromo.getPalavraFrase());
        //Assert
        assertFalse(isPalindromo);

    }

}