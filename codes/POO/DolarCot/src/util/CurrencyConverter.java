package util;

public class CurrencyConverter {
public  static double IOF = 0.06;

public static double dollarToReal(double m, double cot){
    return m * cot + (IOF * (m * cot));

}

}
