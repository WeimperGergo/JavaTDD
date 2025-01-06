package hu.szamalk.cegneve;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SzovegTest {

    @Test
    void testMegfordit(){
        Assertions.assertEquals("abc", SzovegKezelo.megfordit("cba"));
    }

    @Test
    void testMegforditNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> SzovegKezelo.megfordit(null));
    }

    @Test
    void testPalindromSzo(){
        Assertions.assertTrue(SzovegKezelo.isPalindrom("madam"));
        Assertions.assertFalse(SzovegKezelo.isPalindrom("java"));
    }

    @Test
    void testPalindromMondat(){
        Assertions.assertTrue(SzovegKezelo.isPalindrom("indul a görög aludni"));
    }

    @Test
    void testPalindromNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> SzovegKezelo.isPalindrom(null));
    }

}
