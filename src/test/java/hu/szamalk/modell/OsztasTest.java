package hu.szamalk.modell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OsztasTest {

    @Test
    void tesztOsztasEgeszekkel(){
        assertEquals(3, Muveletek.oszt("9", "3"));
    }

    @Test
    void tesztOsztasValosokkal(){
        assertEquals(10.0, Muveletek.oszt("25.0", "2.5"));
    }

    @Test
    void tesztOsztasEgeszekkelValosra(){
        assertEquals(33.33, Muveletek.oszt("100", "3"));
    }

    @Test
    void tesztOsztasSzammal(){
        assertEquals(5, Muveletek.oszt(15, 3));
    }

}