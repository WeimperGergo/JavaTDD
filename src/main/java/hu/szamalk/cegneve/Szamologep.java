package hu.szamalk.cegneve;

public class Szamologep {
    public int osszeadas(int x, int y) {
        return x+y;
    }

    public int kivonas(int x, int y) {
        return x-y;
    }

    public int szorzas(int x, int y) {
        return x*y;
    }

    public Double osztas(int x, int y) {
        if (y == 0) throw new IllegalArgumentException("0-val nem lehet osztani.");
        else return (double) x/y;
    }
}
