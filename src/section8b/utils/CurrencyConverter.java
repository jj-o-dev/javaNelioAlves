package section8b.utils;

public abstract class CurrencyConverter {

    public static double dolarToReal(double amount, double quotation) {
        double price = amount * quotation;
        return price + price * 0.06;
    }

}
