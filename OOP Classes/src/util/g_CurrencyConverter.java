package util;

public class g_CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converter(double dollarPrice, double amount) {
        return dollarPrice * amount + dollarPrice * amount * IOF;
    }

}