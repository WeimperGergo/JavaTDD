package hu.szamalk.cegneve;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzamologepTest {
    private Szamologep szg;

    @BeforeEach
    void ini(){
        szg = new Szamologep();
    }

    @Test
    void testOsszead(){
        assertEquals(3, szg.osszeadas(1,2));
    }

    @Test
    void testKivon(){
        assertEquals(1, szg.kivonas(3,2));
    }

    @Test
    void testSzoroz(){
        assertEquals(6, szg.szorzas(2,3));
    }

    @Test
    void testOsztasEgesz(){
        assertEquals(2, szg.osztas(6,3));
    }

    @Test
    void testOsztasValos(){
        Assertions.assertEquals(2.5, szg.osztas(5,2), 0.001);
    }

    @Test
    void testOsztasNullaval(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> szg.osztas(3,0));
    }
}