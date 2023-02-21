package com.example.javastudies;

public class CurrencyConverter {
    public static double converter(double price, double wantedAmount) {
        return 1.06 * price * wantedAmount;
    }
}
