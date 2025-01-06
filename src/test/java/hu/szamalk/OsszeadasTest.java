package hu.szamalk;

import hu.szamalk.modell.Muveletek;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OsszeadasTest {

    @Test
    void tesztOsszeadNullakat(){
        assertEquals(0, Muveletek.osszead("0", "0"));
    }

    @Test
    void tesztOsszeadAzonosak(){
        assertEquals(4, Muveletek.osszead("2", "2"));
    }

    @Test
    void tesztOsszeadKulonbozok(){
        assertEquals(5, Muveletek.osszead("2", "3"));
    }

    @Test
    void tesztOsszeadNagySzamok(){
        assertEquals((long) Integer.MAX_VALUE+3, Muveletek.osszead(Integer.MAX_VALUE + "", "3"));
    }

    @Test
    void tesztOsszeadNemSzammal() throws Exception{
        assertThrows(NumberFormatException.class, () -> Muveletek.osszead("a", "3"));

    }

}