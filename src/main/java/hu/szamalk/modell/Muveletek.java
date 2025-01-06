package hu.szamalk.modell;

public class Muveletek {


    public static long osszead(String num1, String num2) {
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        return (long) a+b;
    }

    public static double oszt(String num1, String num2) {
        Double a = Double.parseDouble(num1);
        Double b = Double.parseDouble(num2);
        if (b == 0) throw new ArithmeticException("Nem oszthatunk 0-val.");
        return a/b;
    }

    public static double oszt(double num1, double num2){
        return num1/num2;
    }


}
