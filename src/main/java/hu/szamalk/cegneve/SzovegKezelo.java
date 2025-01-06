package hu.szamalk.cegneve;

public class SzovegKezelo {
    public static String megfordit(String szoveg) {
        if (szoveg == null){
            throw new IllegalArgumentException("nem lehet null a szöveg");
        }

        StringBuilder sb = new StringBuilder(szoveg);
        StringBuffer sbf = new StringBuffer(szoveg);
        return sb.reverse().toString();
    }

    public static boolean isPalindrom(String szoveg) {
        if (szoveg == null){
            throw new IllegalArgumentException("nem lehet null a szöveg");
        }

        return szoveg.equals(megfordit(szoveg));
    }
}
