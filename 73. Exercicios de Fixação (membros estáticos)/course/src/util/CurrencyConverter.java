package util;

public class CurrencyConverter {
    public static double paid_price(double dollar_price, double dollars_bought) {
        double percentage = (double) 6 / 100;
        double dollars = dollar_price * dollars_bought;
        return dollars += dollars * percentage;
    }
}
